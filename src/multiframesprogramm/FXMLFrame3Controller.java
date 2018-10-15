/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.radioButtonAnswer;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame3Controller implements Initializable {

    @FXML
    private Button frame3backbutton;
    @FXML
    private Button frame3nextbutton;
    @FXML
    private ToggleGroup group1;
    @FXML
    private Label radioButtonLabel;
    @FXML
    private RadioButton radioButton1;
    @FXML
    private RadioButton radioButton3;
    @FXML
    private RadioButton radioButton2;
    @FXML
    private RadioButton radioButton4;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Игры");
        radioButtonAnswer = "Assassin's Creed";
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }    

    @FXML
    private void frame3backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2")); 
    }

    @FXML
    private void frame3nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("4")); 
        
    }

    @FXML
    private void radioButton1_Action(ActionEvent event) {
        radioButtonAnswer = "Assassin's Creed";
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }

    @FXML
    private void radioButton3_Action(ActionEvent event) {
        radioButtonAnswer = "Grand Theft Auto";
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }

    @FXML
    private void radioButton2_Action(ActionEvent event) {
        radioButtonAnswer = "The Witcher";
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }

    @FXML
    private void radioButton4_Action(ActionEvent event) {
        radioButtonAnswer = "Dota";
        radioButtonLabel.setText("Выбрано: " + radioButtonAnswer);
    }
    
}
