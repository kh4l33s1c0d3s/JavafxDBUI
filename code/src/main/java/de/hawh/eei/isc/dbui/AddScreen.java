package de.hawh.eei.isc.dbui;

import javafx.fxml.FXML;

import java.io.IOException;

public class AddScreen {
    @FXML
    private void handleSubmit() throws IOException {
        App.setRoot("SuccessScreen");
    }
    @FXML
    private void cancel() throws IOException {
        App.setRoot("DecisionScreen");
    }

}
