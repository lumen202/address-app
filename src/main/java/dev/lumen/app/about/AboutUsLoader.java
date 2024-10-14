package dev.lumen.app.about;

import java.io.IOException;

import dev.lumen.App;
import dev.lumen.core.loader.Loader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class AboutUsLoader extends Loader {
    public AboutUsLoader(App app) {
        super("about/ABOUT_US", app);
    }

    @Override
    public void load() {
        try {
            StackPane root = loader.load();
            Scene scene = new Scene(root);
            AboutUsController controller = loader.getController();
            controller.load(app);

            Stage aboutUsStage = new Stage();
            aboutUsStage.setTitle("Address App - About Us");
            aboutUsStage.getIcons().add(new Image(getClass().getResource("/dev/lumen/assets/img/favicon.png").toExternalForm()));
            aboutUsStage.initOwner(app.getApplicationStage());
            aboutUsStage.initModality(Modality.APPLICATION_MODAL);
            aboutUsStage.setResizable(false);
            aboutUsStage.setScene(scene);
            aboutUsStage.showAndWait();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
