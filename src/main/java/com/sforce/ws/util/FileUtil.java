package com.sforce.ws.util;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class contains util method related to File handeling.
 *
 * @author http://cheenath.com
 * @version 1.0
 * @since 1.0  Nov 11, 2005
 */
public class FileUtil {

    /**
     * end of line
     */
    public static final String EOL = System.getProperty("line.separator");

    /**
     * @param file
     *
     * @return
     */
    public static String toString(File file) throws IOException {
        FileInputStream fin = new FileInputStream(file);
        return toString(fin);
    }

    public static byte[] toBytes(InputStream in) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();

        int ch;
        while ((ch = in.read()) != -1) {
            bout.write(ch);
        }

        in.close();
        return bout.toByteArray();
    }

    public static void copy(InputStream from, OutputStream to) throws IOException {
        copy(from, to, true);
    }

    public static void copy(InputStream from, OutputStream to, boolean closeOutput) throws IOException {
        copy(from, true, to, closeOutput);
    }

    public static void copy(InputStream from, boolean closeInput, OutputStream to, boolean closeOutput)
            throws IOException {
        try {
            byte[] buf = new byte[1024];

            int count;
            while ((count = from.read(buf, 0, buf.length)) != -1) {
                to.write(buf, 0, count);
            }
        } finally {
            try {
                if (closeOutput) to.close();
            } finally {
                if (closeInput) from.close();
            }
        }
    }

    private static String toString(InputStream in) throws IOException {
        return new String(toBytes(in));
    }

    public static File mkdirs(String packageName, File root) {
        String[] dirs = packageName.split("\\.");

        for (String dir : dirs) {
            File f = new File(root, dir);

            if (!f.exists()) {
                f.mkdir();
            }

            root = f;
        }

        return root;
    }

    public static boolean deleteDir(File dir) {
        if (dir.isDirectory()) {
            String[] children = dir.list();
            for (String child : children) {
                boolean success = deleteDir(new File(dir, child));
                if (!success) {
                    return false;
                }
            }
        }

        return dir.delete();
    }

    public static List<File> listFilesRecursive(File dir, boolean includeDirs) {
        List<File> result = null;
        if (dir.isDirectory()) {
            result = new ArrayList<File>();
            listFilesRecursive(dir, result, includeDirs);
        }
        return result;
    }

    private static void listFilesRecursive(File dir, List<File> result, boolean includeDirs) {
        for (String child : dir.list()) {
            File f = new File(dir, child);
            if (f.isDirectory()) {
                if (includeDirs) result.add(f);
                listFilesRecursive(f, result, includeDirs);
            } else {
                result.add(f);
            }
        }
    }

    public static File makeTempDirectory(String dirName, boolean deleteIfExists) throws IOException {
        return makeTempDirectory(null, dirName, deleteIfExists);
    }

    public static File makeTempDirectory(File parentTempDir, String dirName, boolean deleteIfExists) throws IOException {
        File dir = new File(getSystemTempDirectory(parentTempDir), dirName);
        if (dir.exists()) {
            if (deleteIfExists)
                deleteDir(dir);
            else
                throw new IOException("Cannot create directory that already exists: " + dir);
        }
        dir.mkdirs();
        dir.deleteOnExit();
        return dir;
    }

    public static File getSystemTempDirectory(File parentTempDir) throws IOException {
        if (parentTempDir != null && parentTempDir.exists() && parentTempDir.isDirectory()) return parentTempDir;

        final File t = File.createTempFile("java", ".tmp", parentTempDir);
        try {
            return t.getParentFile();
        } finally {
            t.delete();
        }
    }
}
