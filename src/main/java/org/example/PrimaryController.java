package org.example;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML
    Label testLabel;

    @FXML//ez mondja meg hogy ez egy fxml által felhasználható metódus
    private void switchToSecondary() throws IOException {
        //App.setRoot("secondary");
        testLabel.setText("Boldog Karacsonyt");
    }
}
