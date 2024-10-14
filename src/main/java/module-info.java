module lumen.addressapp {
    requires transitive javafx.controls;
    requires javafx.base;
    requires javafx.fxml;
    requires javafx.graphics;

    requires jakarta.xml.bind;

    requires java.prefs;

    requires net.datafaker;

    opens dev.lumen.app to javafx.fxml;
    opens dev.lumen.app.overview to javafx.fxml;
    opens dev.lumen.app.overview.form to javafx.fxml;
    opens dev.lumen.models.person to jakarta.xml.bind;
    opens dev.lumen.app.about to javafx.fxml;

    exports dev.lumen;
    exports dev.lumen.models.person;
    exports dev.lumen.libs.xml.adapter;
    exports dev.lumen.app.about;
}
