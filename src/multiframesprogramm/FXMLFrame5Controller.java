/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.input.MouseEvent;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.jListAnswer;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame5Controller implements Initializable {
private ObservableList<String> items = FXCollections.observableArrayList (
            "Аниме",
            "Боевик",
            "Биографический",
            "Вестерн",
            "Военный",
            "Детектив",
            "Документальный",
            "Драма",
            "Исторический",
            "Кинокомикс",
            "Комедия",
            "Короткометражный",
            "Мелодрамма",
            "Приключения",
            "Семейный",
            "Спорт",
            "Триллер",
            "Ужасы",
            "Фантастика");
    @FXML
    private Button frame5backbutton;
    @FXML
    private Button frame5nextbutton;
    @FXML
    private Label jListLabel;
    @FXML
    private ListView<String> jList;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        jList.setItems(items);
        jList.getSelectionModel().selectFirst();
        stageMain.setTitle("Кино");
        jListAnswer = jList.getSelectionModel().getSelectedItem();
        jListLabel.setText("Выбрано: " + jListAnswer);
    }    

    @FXML
    private void frame5backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4"));
    }

    @FXML
    private void frame5nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("6"));
        
    }

    @FXML
    private void jList_action(MouseEvent event) {
        jListAnswer = jList.getSelectionModel().getSelectedItem();
        jListLabel.setText("Выбрано: " + jListAnswer);
    }
    
}
