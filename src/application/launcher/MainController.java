package application.launcher;

import java.net.URL;
import java.util.ResourceBundle;

import application.launcher.model.ButtonsAction;
import application.tool.sound.ClicSound;
import application.tool.sound.ImageClicSound;
import application.tool.sound.MusicLauncher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class MainController implements Initializable, ImageClicSound {

	@FXML
	private Button animation;
	@FXML
	private Button cours;
	@FXML
	private ImageView imageView;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		MusicLauncher.music("elevatorMusic");
	}

	@FXML
	public void clic(ActionEvent event) {
		System.out.println("test : " + ((Button) event.getSource()).getText());
		ButtonsAction action = new ButtonsAction();
		MusicLauncher.stop();
		action.exec(((Button) event.getSource()));
	}

	@Override
	public void mouseOnImageReleased() {
		System.out.println("Test : appuie sur l'image du son");
		ClicSound action = new ClicSound();
		MusicLauncher.stop();
		action.exec(imageView);
	}
}
