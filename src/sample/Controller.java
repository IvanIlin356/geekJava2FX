package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Controller {
    private static String userName = "user1";

    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    @FXML
    TextArea conversationArea;
    @FXML
    TextArea messageAuthor;
    @FXML
    TextField messageText;

    public void sendMessage(){
        if (!messageText.getText().isEmpty()) {
            conversationArea.appendText(messageText.getText() + "\n");
            messageAuthor.appendText(dateFormat.format(new Date()) + " " + userName + "\n");
            messageText.clear();
            messageText.requestFocus();
        }
    }

    public void selectSmile(){
        Alert alert = new Alert(Alert.AlertType.INFORMATION);

        alert.setTitle("under construction");
        alert.setHeaderText(null);
        alert.setContentText("в разработке");

        alert.showAndWait();
    }
}
