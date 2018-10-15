/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiframesprogramm;

import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 *
 * @author SABIT_KARAEV
 */
public class MultiFramesProgramm extends Application {
    
    static Stage stageMain; // Общая переменная для доступа главной сцене
    static String comboBoxAnswer = ""; // Общая переменная для сохранения текста
    static String radioButtonAnswer = ""; // Общая переменная для сохранения текста
    static String checkBoxAnswer = ""; // Общая переменная для сохранения текста
    static String jListAnswer = ""; // Общая переменная для сохранения текста
    
    @Override
    public void start(Stage stage) throws Exception {
        stageMain = stage; // Сохраняем ссылку на главную сцену в общей переменной
        stage.getIcons().add(new Image("/images/icon.png"));
        stage.setScene(new SceneBuilder().getScene("1")); // Переход на первое окно
        stage.setResizable(false);
        stage.show(); // Активируем видимость программы
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
