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
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;

import static multiframesprogramm.MultiFramesProgramm.comboBoxAnswer;
import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * FXML Controller class
 *
 * @author SABIT_KARAEV
 */
public class FXMLFrame2Controller implements Initializable {
    
    private ObservableList<String> arr = FXCollections.observableArrayList(
            "Супермен",
            "Бэтмен",
            "Флэш",
            "Чудо женщина",
            "Зеленый фонарь",
            "Аквамен",
            "Железный человек",
            "Капитан Америка",
            "Халк",
            "Росомаха",
            "Черная вдова",
            "Тор"
    );
    
    @FXML
    private Button frame2backbutton;
    @FXML
    private Button frame2nextbutton;
    @FXML
    private ComboBox<String> combobox;
    @FXML
    private Label comboBoxLabel;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Комикcы");
        combobox.setItems(arr);
        combobox.getSelectionModel().selectFirst();
        comboBoxAnswer = combobox.getSelectionModel().getSelectedItem();
        comboBoxLabel.setText("Выбрано: " + comboBoxAnswer);
    }    

    @FXML
    private void frame2backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("1")); 
    }

    @FXML
    private void frame2nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("3")); 
        
    }

    @FXML
    private void combobox_action(ActionEvent event) {
        String line = combobox.getSelectionModel().getSelectedItem();
        comboBoxAnswer = line;
        comboBoxLabel.setText("Выбрано: " + line);       
    }
    
}
