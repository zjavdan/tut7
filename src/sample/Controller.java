package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    @FXML
    private TextField lozinka;

    @FXML
    private TextField ime;

    @FXML
    private TextField kime;

    @FXML
    private TextField prezime;

    @FXML
    private TextField mail;

    @FXML
    private ListView<?> Lista;

    @FXML
    private Label imeL;

    @FXML
    private Label prezimeL;

    @FXML
    private Label mailL;

    @FXML
    private Label korisnickoL;

    @FXML
    private Label lozinkaL;

    @FXML
    private Button krajBtn;

    @FXML
    private Button dodajBtn;

    public void closeButtonAction() {
        Stage stage = (Stage) krajBtn.getScene().getWindow();
        stage.close();
    }

}