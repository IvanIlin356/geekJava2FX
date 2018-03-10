package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class Controller {
    @FXML
    TextArea conversationArea;
    @FXML
    TextField messageText;

    public void sendMessage(){
        if (!messageText.getText().isEmpty()) {
            conversationArea.appendText(messageText.getText() + "\n");
            messageText.clear();
            messageText.requestFocus();
        }
    }
}
