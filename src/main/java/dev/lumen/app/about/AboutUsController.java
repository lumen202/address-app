package dev.lumen.app.about;

import dev.lumen.core.controller.Controller;
import dev.lumen.models.person.Author;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;

public class AboutUsController extends Controller {

    @FXML
    private Text name;
    @FXML
    private Text adrress;
    @FXML
    private Text contactNum;
    @FXML
    private Text email;
    @FXML
    private Text description;
    @FXML
    private ImageView logo;

    @Override
    protected void load_fields() {
    }

    private Author author;

    @Override
    protected void load_bindings() {
        author = new Author("Joshua Diniega", "Mabini Street, Hilongos Leyte", "jdiniega202@gmail.com", "0920883990");

    }

    @Override
    protected void load_listeners() {

        name.textProperty().bind(author.nameProperty());
        adrress.textProperty().bind(author.addressProperty());
        contactNum.textProperty().bind(author.contactNumProperty());
        email.textProperty().bind(author.emailProperty());
        description.textProperty().bind(author.getDescription());
        logo.setImage(new Image(
                getClass().getResource("/dev/lumen/assets/img/logo.png")
                        .toExternalForm()));
    }
}