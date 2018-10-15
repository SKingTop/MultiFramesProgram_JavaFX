package multiframesprogramm;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import static multiframesprogramm.MultiFramesProgramm.stageMain;

/**
 * @author SABIT_KARAEV
 */
public class FXMLFrame1Controller implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private Button exitframe1button;
    @FXML
    private Button frame1nextbutton;

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        stageMain.setTitle("Добро пожаловать!");
    }    

    @FXML
    private void exitframe1button_Action(ActionEvent event) {
        stageMain.close();
    }

    @FXML
    private void frame1nextbutton_Action(ActionEvent event) throws IOException {
        stageMain.setScene(new SceneBuilder().getScene("2")); 
    }

    
}
