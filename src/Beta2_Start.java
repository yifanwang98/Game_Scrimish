
import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Beta2_Start extends Application {

	private Stage primaryStage;
	static BorderPane pane;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Scrimish by YF Wang");
		this.primaryStage.setFullScreen(false);
		this.primaryStage.setResizable(false);
		showStartPage();
	}

	private void showStartPage() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("StartView.fxml"));
		pane = Loader.load();
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void showSetUp() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("SetUpFXML.fxml"));
		Pane pane1 = Loader.load();
		pane.setCenter(pane1);
	}

	public static void back() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("StartView.fxml"));
		Pane pane1 = Loader.load();
		pane.setCenter(pane1);
	}

	public static void backToSetUp() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("SetUpFXML.fxml"));
		Pane pane1 = Loader.load();
		pane.setCenter(pane1);
	}

	public static void goToGame() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("Game.fxml"));
		Pane pane1 = Loader.load();
		pane.setCenter(pane1);
	}

	public static void whoGoFirst() throws IOException {
		FXMLLoader Loader = new FXMLLoader();
		Loader.setLocation(Beta2_Start.class.getResource("ChooseFirst.fxml"));
		Pane pane1 = Loader.load();
		pane.setCenter(pane1);
	}
}