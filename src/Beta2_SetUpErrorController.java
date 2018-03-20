
import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Beta2_SetUpErrorController {
	public static void ErrorView() throws IOException {
		Stage a = new Stage();
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_SetUpErrorController.class.getResource("SetUpError.fxml"));
		Pane pane = Loader.load();
		Scene scene = new Scene(pane, 500, 200); // Create a scene and place it
													// in the stage
		a.setTitle("ERROR"); // Set the stage title
		a.setScene(scene); // Place the scene in the stage
		a.show(); // Display the stage
		a.setResizable(false);
	}
}
