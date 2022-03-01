package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {
    @FXML
    public Text result;
    @FXML
    public TextField nr1;
    @FXML
    public TextField nr2;

    public void add(){
        int nr1 = convertTextFieldResultToInt(getNr1());
        int nr2 = convertTextFieldResultToInt(getNr2());
        setResult(Integer.toString(nr1+nr2));
    }


    public Text getResult() {
        return result;
    }

    public TextField getNr1() {
        return nr1;
    }

    public void setNr1(TextField nr1) {
        this.nr1 = nr1;
    }

    public TextField getNr2() {
        return nr2;
    }

    public void setNr2(TextField nr2) {
        this.nr2 = nr2;
    }

    public int convertTextFieldResultToInt(TextField field){
        try{
            String str = field.getText();
            return Integer.parseInt(str);
        }
        catch (NumberFormatException ex) {
            ex.printStackTrace();
        }
        return 1;
    }
    public void setResult(String result) {
        this.result.setText(result);
    }
}