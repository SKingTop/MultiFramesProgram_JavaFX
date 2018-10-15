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
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

import static multiframesprogramm.MultiFramesProgramm.stageMain;
import static multiframesprogramm.MultiFramesProgramm.checkBoxAnswer;

/**
 * FXML Controller class
 *
 * @author student
 */
public class FXMLFrame4Controller implements Initializable {

    @FXML
    private Button frame4backbutton;
    @FXML
    private Button frame4nextbutton;
    @FXML
    private CheckBox checkBox1;
    @FXML
    private CheckBox checkBox3;
    @FXML
    private CheckBox checkBox2;
    @FXML
    private CheckBox checkBox4;
    @FXML
    private Label checkBoxLabel;

    String otvet = "";
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Языки");
        checkBoxAnswer = "Русский";
        checkBoxLabel.setText("Выбранно: " + checkBoxAnswer);
    }    
    
    public void checkBoxcheck (){
        checkBoxAnswer = "";
        if (checkBox1.isSelected()){
            otvet += " Русский";
            //checkBoxLabel.setText("Выбранно: " + otvet);
        } else {
            otvet = otvet;
        }
        if (checkBox2.isSelected()){
            otvet += " Казахский";
            //checkBoxLabel.setText("Выбранно: " + otvet);
        } else {
            otvet = otvet;
        }
        if (checkBox3.isSelected()){
            otvet += " Английский";
            //checkBoxLabel.setText("Выбранно: " + otvet);
        } else {
            otvet = otvet;
        }
        if (checkBox4.isSelected()){
            otvet += " Немецкий";
            //checkBoxLabel.setText("Выбранно: " + otvet);
        } else {
            otvet = otvet;
        }
        checkBoxLabel.setText("Выбранно:" + otvet);
        checkBoxAnswer = otvet;
        otvet = "";
    }

    @FXML
    private void frame4backbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("3"));
        
    }

    @FXML
    private void frame4nextbutton_action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("5"));
    }

    @FXML
    private void checkBox1_Action(ActionEvent event) {
        checkBoxLabel.setText("Выбранно: ");
        //otvet = "";
        checkBoxcheck ();
    }

    @FXML
    private void checkBox3_Action(ActionEvent event) {
        checkBoxLabel.setText("Выбранно: ");
        //otvet = "";
        checkBoxcheck ();
    }

    @FXML
    private void checkBox2_Action(ActionEvent event) {
        checkBoxLabel.setText("Выбранно: ");
        //otvet = "";
        checkBoxcheck ();
    }

    @FXML
    private void checkBox4_Action(ActionEvent event) {
        checkBoxLabel.setText("Выбранно: ");
        //otvet = "";
        checkBoxcheck ();
    }
    
}
