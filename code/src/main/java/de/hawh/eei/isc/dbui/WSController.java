package de.hawh.eei.isc.dbui;

import java.io.IOException;
import javafx.fxml.FXML;

public class WSController {

    @FXML
    private void switchToStart() throws IOException {
        App.setRoot("StartScreen");
    }
}