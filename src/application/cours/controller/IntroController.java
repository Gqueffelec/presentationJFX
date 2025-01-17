package application.cours.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

public class IntroController extends Controller {

	@FXML
	private Text text1;
	@FXML
	private VBox text2;
	@FXML
	private Text text3;

	// initialisation de la scene en cachant les éléments

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		text1.setVisible(false);
		text2.setVisible(false);
		text3.setVisible(false);
		state = StateSlide.UN;
	}

	// switch qui avance à chaque clic dépendant de l'enum de la classe mère (cf
	// Controller.java)

	@Override
	public void avancementSlide(MouseEvent event) {
		switch (state) {
		case UN:
			text1.setVisible(true);
			state = StateSlide.DEUX;
			break;
		case DEUX:
			text2.setVisible(true);
			state = StateSlide.TROIS;
			break;
		case TROIS:
			text3.setVisible(true);
			break;
		case QUATRE:
			break;
		}
	}

}
