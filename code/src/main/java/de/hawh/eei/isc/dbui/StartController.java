package de.hawh.eei.isc.dbui;

import java.io.IOException;
import javafx.fxml.FXML;

public class StartController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("WelcomeScreen");
    }
}
