package application.launcher;

import java.net.URL;
import java.util.ResourceBundle;
import application.launcher.model.ButtonsAction;
import application.launcher.model.MusicLauncher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.media.MediaPlayer;

public class MainController implements Initializable {
	@FXML
	private Button race;
	@FXML
	private Button login;
	@FXML
	private Button animation;
	@FXML
	private Button dragAndDrop;
	@FXML
	private Button cours;

	@FXML
	private static Slider pourcentageVolume;

	private static MediaPlayer backgroundPlayer;
	private static double volume;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		backgroundPlayer = MusicLauncher.music("elevatorMusic");
		backgroundPlayer.play();
	}

	public void clic(ActionEvent event) {
		System.out.println("test : " + ((Button) event.getSource()).getText());
		ButtonsAction action = new ButtonsAction();
		action.exec(((Button) event.getSource()));
	}

//	public static void setVolume() {
//		MainController.volume = pourcentageVolume.getValue();
//	}
//	
//	public void changevolume(Slider vol) {
//		System.out.println("test : " +  vol.getValue());
//		ButtonsAction action = new ButtonsAction();
//	}
	

}