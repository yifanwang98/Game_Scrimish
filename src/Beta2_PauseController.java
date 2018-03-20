
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Beta2_PauseController {
	private static Stage a = new Stage();

	public static void showPauseView() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_PauseController.class.getResource("PauseView.fxml"));
		Pane paneForHelp = Loader.load();
		Scene scene = new Scene(paneForHelp, 490, 306);
		scene.setFill(Color.BLACK);
		a.setTitle("Pause"); // Set the stage title
		a.setScene(scene); // Place the scene in the stage
		a.show(); // Display the stage
		a.setResizable(false);
	}

	@FXML
	private Button mainMenu;

	@FXML
	private void goToMainMenu() throws IOException {
		a.close();
		Beta2_Start.back();
	}

	@FXML
	private Button helpBTN;

	@FXML
	private void showHelp() throws IOException {
		a.close();
		Beta2_HelpController.helpView();
	}

	@FXML
	private Button exitBTN;

	@FXML
	private void exitAPP() {
		a.close();
		System.exit(0);
	}
}