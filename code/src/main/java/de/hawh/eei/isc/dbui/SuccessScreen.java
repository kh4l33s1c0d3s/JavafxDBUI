package de.hawh.eei.isc.dbui;

import javafx.fxml.FXML;

import java.io.IOException;

public class SuccessScreen {

    @FXML
    private void switchToWelcome() throws IOException {
        App.setRoot("WelcomeScreen");
    }
    @FXML
    private void switchToEnd() throws IOException {
        App.setRoot("EndScreen");
    }
}
