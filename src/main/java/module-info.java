module com.db {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    requires transitive java.logging;

    requires transitive java.xml;
    requires java.xml.ws;
    requires java.xml.bind;
    requires javax.jws;
    requires com.sun.xml.ws;

    requires java.desktop;
    requires commons.beanutils;
    requires ST4;
    requires appengine.api;


    opens com.agile.ws.schema.common.v1.jaxws;
    opens com.agile.ws.schema.project.v1.jaxws;
    opens com.agile.ws.schema.search.v1.jaxws;
    opens com.agile.ws.schema.collaboration.v1.jaxws;
    opens com.agile.ws.schema.table.v1.jaxws;

    opens com.db to javafx.fxml;
    exports com.db;
}