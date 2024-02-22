module com.example.practica5php {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.practica5php to javafx.fxml;
    exports com.example.practica5php;
    exports com.example.practica5php.ejercicio1;
    opens com.example.practica5php.ejercicio1 to javafx.fxml;
}