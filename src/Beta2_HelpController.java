
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Beta2_HelpController {

	public static void helpView() throws IOException {
		Stage a = new Stage();
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_SetUpController.class.getResource("Help.fxml"));
		Pane paneForHelp = Loader.load();
		Scene scene = new Scene(paneForHelp, 700, 560); // Create a scene and
														// place it in the stage
		scene.setFill(Color.BLACK);
		a.setTitle("Help"); // Set the stage title
		a.setScene(scene); // Place the scene in the stage
		a.show(); // Display the stage
		a.setResizable(false);
	}
}