package de.hawh.eei.isc.dbui;

import javafx.fxml.FXML;

import java.io.IOException;

public class DecisionScreen {
    @FXML
    private void switchToWelcome() throws IOException {
        App.setRoot("WelcomeScreen");
    }

    @FXML
    private void switchToAdd() throws IOException {
        App.setRoot("AddScreen");
    }
}
