
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;

public class Beta2_ChooseFirstController extends Beta2_SetUpController {

	//private Beta2_Start backToSetUp;

	@FXML
	private void goBack() throws IOException {
		Beta2_Start.backToSetUp();
	}

	@FXML
	private Button PlayerFirst;
	@FXML
	private Button AIFirst;

	@FXML
	private void PlayerFirstChosen(MouseEvent event) throws IOException {
		PlayerFirst.setOpacity(1);
		AIFirst.setOpacity(0.4);
		StartBTN.setDisable(false);
		Beta2_Main.attackP = 'P';
	}

	@FXML
	private void AIFirstChosen(MouseEvent event) throws IOException {
		AIFirst.setOpacity(1);
		PlayerFirst.setOpacity(0.4);
		StartBTN.setDisable(false);
		Beta2_Main.attackP = 'A';
		Beta2_Main.aiF = true;
	}

	//private Beta2_Start goToGame;
	@FXML
	private Button StartBTN;

	@FXML
	private void clickToStart() throws IOException {
		Beta2_Start.goToGame();
	}

}