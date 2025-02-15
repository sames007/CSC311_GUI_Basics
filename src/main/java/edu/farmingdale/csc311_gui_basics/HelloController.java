package edu.farmingdale.csc311_gui_basics;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class HelloController {

    @FXML
    private Label Text;

    @FXML
    private ImageView image;

    // Button event for rotating the text
    @FXML
    void onTextRotateButtonClick(ActionEvent event) {
        Text.setRotate(Text.getRotate() + 20);
    }

    // Button event for rotating the image
    @FXML
    void onImageRotateButtonClick(ActionEvent event) {
        image.setRotate(image.getRotate() + 20);
    }
}