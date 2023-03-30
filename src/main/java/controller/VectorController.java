package controller;

import domain.Vector;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class VectorController
{
    @FXML
    private TextField maxSizeTextField;

    @FXML
    private TextArea textArea;

    Alert alert;

    Vector vector;
    @javafx.fxml.FXML
    public void initialize(){
        alert= alert("Vector Algorithm", "There was an error");
        alert.setAlertType(Alert.AlertType.ERROR);
    }

    @FXML
    void addIndexOnAction(ActionEvent event) {

    }

    @FXML
    void addValueOnAction(ActionEvent event) {

    }

    @FXML
    void clearOnAction(ActionEvent event) {

    }

    @FXML
    void containsOnAction(ActionEvent event) {

    }

    @FXML
    void fillShowOnAction(ActionEvent event) {
        if(isValid()){
            vector = new Vector(Integer.valueOf(this.maxSizeTextField.getText()));
            util.Utility.fill(vector);
            vector.sort();
            this.textArea.setText(vector.toString());
        } else{
            alert.setAlertType(Alert.AlertType.ERROR);
            alert.setContentText("Please complete the info and try again...");
            alert.showAndWait();
        }

    }

    private boolean isValid() {
        return !this.maxSizeTextField.getText().isEmpty();
    }

    @FXML
    void removeIndexOnAction(ActionEvent event) {

    }

    @FXML
    void removeValueOnAction(ActionEvent event) {

    }

    @FXML
    void sizeOnAction(ActionEvent event) {

    }

    private Alert alert(String title, String headerText){
        Alert a= new Alert(Alert.AlertType.INFORMATION);
        a.setTitle(title);
        a.setHeaderText(headerText);
        DialogPane dp= a.getDialogPane();
        return a;
    }
}