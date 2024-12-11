module com.test.mytestjavafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.test.mytestjavafx to javafx.fxml;
    exports com.test.mytestjavafx;
    opens com.test.mytestjavafx.controller to javafx.fxml;
    exports com.test.mytestjavafx.controller;
    opens com.test.mytestjavafx.model;
}