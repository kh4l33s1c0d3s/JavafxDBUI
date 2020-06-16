package de.hawh.eei.isc.dbui;

import java.io.IOException;
import javafx.fxml.FXML;

public class WSController {

    @FXML
    private void switchToStart() throws IOException {
        App.setRoot("StartScreen");
    }
    @FXML
    private void switchToEnd() throws IOException {
        App.setRoot("EndScreen");
    }
    @FXML
    private void switchToAdd() throws IOException {
        App.setRoot("AddScreen");
    }
    @FXML
    private void switchToShowAll() throws IOException {
        App.setRoot("ShowAllScreen");
    }
    @FXML
    private void switchToHAW() throws IOException {
        App.setRoot("HAWScreen");
    }
}