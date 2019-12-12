package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
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
    private TextField imeL;

    @FXML
    private TextField prezimeL;

    @FXML
    private TextField mailL;

    @FXML
    private TextField korisnickoL;

    @FXML
    private TextField lozinkaL;

    @FXML
    private Button krajBtn;

    @FXML
    private Button dodajBtn;

    public void closeButtonAction() {
        Stage stage = (Stage) krajBtn.getScene().getWindow();
        stage.close();
    }

}