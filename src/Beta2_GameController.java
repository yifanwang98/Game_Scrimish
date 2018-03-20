
import java.io.IOException;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Beta2_GameController {
	Cards a = Beta2_SetUpController.a;
	Cards b = Beta2_SetUpController.b;

	/** PauseBTN */
	@FXML
	private void pause() throws IOException {
		Beta2_PauseController.showPauseView();
	}

	/** DiscardBTNs */
	@FXML
	private Button discard1;
	@FXML
	private Button discard2;
	@FXML
	private Button discard3;
	@FXML
	private Button discard4;
	@FXML
	private Button discard5;

	/** Discard Pile1 */
	@FXML
	private void discardP1() {
		Beta2_SetUpController.discardPile1();
		if (Beta2_SetUpController.discard)
			disableDiscardBTNs();
	}

	/** Discard Pile2 */
	@FXML
	private void discardP2() {
		Beta2_SetUpController.discardPile2();
		if (Beta2_SetUpController.discard)
			disableDiscardBTNs();
	}

	/** Discard Pile3 */
	@FXML
	private void discardP3() {
		Beta2_SetUpController.discardPile3();
		if (Beta2_SetUpController.discard)
			disableDiscardBTNs();
	}

	/** Discard Pile4 */
	@FXML
	private void discardP4() {
		Beta2_SetUpController.discardPile4();
		if (Beta2_SetUpController.discard)
			disableDiscardBTNs();
	}

	/** Discard Pile5 */
	@FXML
	private void discardP5() {
		Beta2_SetUpController.discardPile5();
		if (Beta2_SetUpController.discard)
			disableDiscardBTNs();
	}

	/** Disable DiscardBTN Method */
	private void disableDiscardBTNs() {
		discard1.setDisable(true);
		discard2.setDisable(true);
		discard3.setDisable(true);
		discard4.setDisable(true);
		discard5.setDisable(true);
	}

	/** Computer's Cards */
	@FXML
	protected ImageView a1;
	@FXML
	protected ImageView a2;
	@FXML
	protected ImageView a3;
	@FXML
	protected ImageView a4;
	@FXML
	protected ImageView a5;
	@FXML
	protected ImageView a6;
	@FXML
	protected ImageView aA;
	@FXML
	protected ImageView aS;
	@FXML
	protected ImageView aC;

	/** Player's Cards */
	@FXML
	protected ImageView p1;
	@FXML
	protected ImageView p2;
	@FXML
	protected ImageView p3;
	@FXML
	protected ImageView p4;
	@FXML
	protected ImageView p5;
	@FXML
	protected ImageView p6;
	@FXML
	protected ImageView pA;
	@FXML
	protected ImageView pS;
	@FXML
	protected ImageView pC;

	/** Back of the Cards */
	@FXML
	protected ImageView pBack1;
	@FXML
	protected ImageView aBack1;
	@FXML
	protected ImageView pBack2;
	@FXML
	protected ImageView aBack2;
	@FXML
	protected ImageView pBack3;
	@FXML
	protected ImageView aBack3;
	@FXML
	protected ImageView pBack4;
	@FXML
	protected ImageView aBack4;
	@FXML
	protected ImageView pBack5;
	@FXML
	protected ImageView aBack5;

	/** Slots */
	@FXML
	protected Rectangle slot1;
	@FXML
	protected Rectangle slot2;
	@FXML
	protected Rectangle slot3;
	@FXML
	protected Rectangle slot4;
	@FXML
	protected Rectangle slot5;

	private boolean isClicked = false;
	private int row;

	/** click on aBack */
	@FXML
	private void pBack1Clicked() {
		row = 0;
		pBack1.setOpacity(1.0);
		pBack2.setOpacity(0.6);
		pBack3.setOpacity(0.6);
		pBack4.setOpacity(0.6);
		pBack5.setOpacity(0.6);
		isClicked = true;
	}

	@FXML
	private void pBack2Clicked() {
		row = 1;
		pBack2.setOpacity(1.0);
		pBack1.setOpacity(0.6);
		pBack3.setOpacity(0.6);
		pBack4.setOpacity(0.6);
		pBack5.setOpacity(0.6);
		isClicked = true;
	}

	@FXML
	private void pBack3Clicked() {
		row = 2;
		pBack3.setOpacity(1.0);
		pBack2.setOpacity(0.6);
		pBack1.setOpacity(0.6);
		pBack4.setOpacity(0.6);
		pBack5.setOpacity(0.6);
		isClicked = true;

	}

	@FXML
	private void pBack4Clicked() {
		row = 3;
		pBack4.setOpacity(1.0);
		pBack2.setOpacity(0.6);
		pBack3.setOpacity(0.6);
		pBack1.setOpacity(0.6);
		pBack5.setOpacity(0.6);
		isClicked = true;
	}

	@FXML
	private void pBack5Clicked() {
		row = 4;
		pBack5.setOpacity(1.0);
		pBack2.setOpacity(0.6);
		pBack3.setOpacity(0.6);
		pBack4.setOpacity(0.6);
		pBack1.setOpacity(0.6);
		isClicked = true;
	}

	@FXML
	private void slot1Clicked() {
		if (isClicked && !(b.emptyPile(4))) {
			slotChosen = 1;
			showCard();
		}
	}

	@FXML
	private void slot2Clicked() {
		if (isClicked && !(b.emptyPile(4))) {
			slotChosen = 2;
			showCard();
		}
	}

	@FXML
	private void slot3Clicked() {
		if (isClicked && !(b.emptyPile(4))) {
			slotChosen = 3;
			showCard();
		}
	}

	@FXML
	private void slot4Clicked() {
		if (isClicked && !(b.emptyPile(4))) {
			slotChosen = 4;
			showCard();
		}
	}

	@FXML
	private void slot5Clicked() {
		if (isClicked && !(b.emptyPile(4))) {
			slotChosen = 5;
			showCard();
		}
	}

	private String attack = "";
	private String defend = "";
	private int stageN = 0;
	private int gameover = 0;
	private int slotChosen = 0;

	@FXML
	private HBox slots;

	/** show chosen card and play game */
	private void showCard() {
		resetScene();
		EventHandler<ActionEvent> eventHandler = e -> {
			if (stageN == 0) {
				Beta2_Main.attackP = 'P';
				attack = a.getCard(row);
				defend = b.getCard(slotChosen - 1);
				slots.setOpacity(0);
				showPlayerA(attack, slotChosen);
				showComputerD(defend, slotChosen);
				int[] discard = Beta2_Main.gamePlay(attack, defend);
				if (discard[0] == -1)
					a.discardCard(row);
				if (discard[1] == -1)
					b.discardCard(slotChosen - 1);
				gameover = Beta2_Main.gameOver(attack, defend);
				stageN++;
			} else if (stageN == 1) {
				resetScene();
				slots.setOpacity(0);
				if (gameover == 0) {
					// AI's turn
					Beta2_Main.attackP = 'A';
					do {
						row = (int) (Math.random() * 5);
						attack = b.getCard(row);
					} while (attack.equals(" "));
					do {
						slotChosen = 1 + (int) (Math.random() * 5);
						defend = a.getCard(slotChosen - 1);
					} while (defend.equals(" "));
					showComputerA(attack, slotChosen);
					showPlayerD(defend, slotChosen);
					int[] discard = Beta2_Main.gamePlay(attack, defend);
					if (discard[0] == -1)
						b.discardCard(row);
					if (discard[1] == -1)
						a.discardCard(slotChosen - 1);
					gameover = Beta2_Main.gameOver(attack, defend);
					stageN = 0;
					if (gameover != 0) {
						if (gameover == -1) {
							showWin();
						} else {
							showDefeat();
						}
					}
				} else {
					if (gameover == -1) {
						showDefeat();
					} else {
						showWin();
					}
				}
			}
		};
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(800), eventHandler));
		animation.setCycleCount(2);
		animation.play(); // Start animation

	}

	@FXML
	private ImageView conTBTN;

	@FXML
	private void continueGame() {
		if (Beta2_Main.aiF) {
			ifAIFirst();
			Beta2_Main.aiF = false;
		}
		resetScene();
	}

	public void ifAIFirst() {
		EventHandler<ActionEvent> eventHandler = e -> {
			resetScene();
			slots.setOpacity(0);
			Beta2_Main.attackP = 'A';
			do {
				row = (int) (Math.random() * 5);
				attack = b.getCard(row);
			} while (attack.equals(" "));
			do {
				slotChosen = 1 + (int) (Math.random() * 5);
				defend = a.getCard(slotChosen - 1);
			} while (defend.equals(" "));
			showComputerA(attack, slotChosen);
			showPlayerD(defend, slotChosen);
			int[] discard = Beta2_Main.gamePlay(attack, defend);
			if (discard[0] == -1)
				b.discardCard(row);
			if (discard[1] == -1)
				a.discardCard(slotChosen - 1);
			gameover = Beta2_Main.gameOver(attack, defend);
			stageN = 0;
		};
		Timeline animation = new Timeline(new KeyFrame(Duration.millis(900), eventHandler));
		animation.setCycleCount(1);
		animation.play(); // Start animation
	}

	/** switch case for show PLAYER attack card */
	private void showPlayerA(String attack, int slotNumber) {
		switch (attack) {
		case ("#1"): {
			p1.setOpacity(1);
			p1.setX(getSlotX(slotNumber));
			p1.setY(250.0);
			break;
		}
		case ("#2"): {
			p2.setOpacity(1);
			p2.setX(getSlotX(slotNumber));
			p2.setY(250.0);
			break;
		}
		case ("#3"): {
			p3.setOpacity(1);
			p3.setX(getSlotX(slotNumber));
			p3.setY(250.0);
			break;
		}
		case ("#4"): {
			p4.setOpacity(1);
			p4.setX(getSlotX(slotNumber));
			p4.setY(250.0);
			break;
		}
		case ("#5"): {
			p5.setOpacity(1);
			p5.setX(getSlotX(slotNumber));
			p5.setY(250.0);
			break;
		}
		case ("#6"): {
			p6.setOpacity(1);
			p6.setX(getSlotX(slotNumber));
			p6.setY(250.0);
			break;
		}
		case ("AR"): {
			pA.setOpacity(1);
			pA.setX(getSlotX(slotNumber));
			pA.setY(250.0);
			break;
		}
		case ("SH"): {
			pS.setOpacity(1);
			pS.setX(getSlotX(slotNumber));
			pS.setY(250.0);
			break;
		}
		case ("Cr"): {
			pC.setOpacity(1.0);
			pC.setX(getSlotX(slotNumber));
			pC.setY(250.0);
			break;
		}
		}
	}

	/** switch case for show AI defend card */
	private void showComputerD(String defend, int slotNumber) {
		hideComputerBack(slotNumber);
		switch (defend) {
		case "#1": {
			a1.setOpacity(1.0);
			a1.setX(getSlotX(slotNumber));
			a1.setY(58.0);
			break;
		}
		case "#2": {
			a2.setOpacity(1.0);
			a2.setX(getSlotX(slotNumber));
			a2.setY(58.0);
			break;
		}
		case "#3": {
			a3.setOpacity(1.0);
			a3.setX(getSlotX(slotNumber));
			a3.setY(58.0);
			break;
		}
		case "#4": {
			a4.setOpacity(1.0);
			a4.setX(getSlotX(slotNumber));
			a4.setY(58.0);
			break;
		}
		case "#5": {
			a5.setOpacity(1.0);
			a5.setX(getSlotX(slotNumber));
			a5.setY(58.0);
			break;
		}
		case "#6": {
			a6.setOpacity(1.0);
			a6.setX(getSlotX(slotNumber));
			a6.setY(58.0);
			break;
		}
		case "AR": {
			aA.setOpacity(1.0);
			aA.setX(getSlotX(slotNumber));
			aA.setY(58.0);
			break;
		}
		case "SH": {
			aS.setOpacity(1.0);
			aS.setX(getSlotX(slotNumber));
			aS.setY(58.0);
			break;
		}
		case "Cr": {
			aC.setOpacity(1.0);
			aC.setX(getSlotX(slotNumber));
			aC.setY(58.0);
			break;
		}
		}
	}

	/** switch case for show PLAYER defend card */
	private void showPlayerD(String defend, int slotNumber) {
		hidePlayerBack(slotNumber);
		switch (defend) {
		case "#1": {
			p1.setOpacity(1.0);
			p1.setX(getSlotX(slotNumber));
			p1.setY(455.0);
			break;
		}
		case "#2": {
			p2.setOpacity(1.0);
			p2.setX(getSlotX(slotNumber));
			p2.setY(455.0);
			break;
		}
		case "#3": {
			p3.setOpacity(1.0);
			p3.setX(getSlotX(slotNumber));
			p3.setY(455.0);
			break;
		}
		case "#4": {
			p4.setOpacity(1.0);
			p4.setX(getSlotX(slotNumber));
			p4.setY(455.0);
			break;
		}
		case "#5": {
			p5.setOpacity(1.0);
			p5.setX(getSlotX(slotNumber));
			p5.setY(455.0);
			break;
		}
		case "#6": {
			p6.setOpacity(1.0);
			p6.setX(getSlotX(slotNumber));
			p6.setY(455.0);
			break;
		}
		case "AR": {
			pA.setOpacity(1.0);
			pA.setX(getSlotX(slotNumber));
			pA.setY(455.0);
			break;
		}
		case "SH": {
			pS.setOpacity(1.0);
			pS.setX(getSlotX(slotNumber));
			pS.setY(455.0);
			break;
		}
		case "Cr": {
			pC.setOpacity(1.0);
			pC.setX(getSlotX(slotNumber));
			pC.setY(455.0);
			break;
		}
		}
	}

	/** switch case for show AI attack card */
	private void showComputerA(String attack, int slotNumber) {
		switch (attack) {
		case "#1": {
			a1.setOpacity(1.0);
			a1.setX(getSlotX(slotNumber));
			a1.setY(250.0);
			break;
		}
		case "#2": {
			a2.setOpacity(1.0);
			a2.setX(getSlotX(slotNumber));
			a2.setY(250.0);
			break;
		}
		case "#3": {
			a3.setOpacity(1.0);
			a3.setX(getSlotX(slotNumber));
			a3.setY(250.0);
			break;
		}
		case "#4": {
			a4.setOpacity(1.0);
			a4.setX(getSlotX(slotNumber));
			a4.setY(250.0);
			break;
		}
		case "#5": {
			a5.setOpacity(1.0);
			a5.setX(getSlotX(slotNumber));
			a5.setY(250.0);
			break;
		}
		case "#6": {
			a6.setOpacity(1.0);
			a6.setX(getSlotX(slotNumber));
			a6.setY(250.0);
			break;
		}
		case "AR": {
			aA.setOpacity(1.0);
			aA.setX(getSlotX(slotNumber));
			aA.setY(250.0);
			break;
		}
		case "SH": {
			aS.setOpacity(1.0);
			aS.setX(getSlotX(slotNumber));
			aS.setY(250.0);
			break;
		}
		case "Cr": {
			aC.setOpacity(1.0);
			aC.setX(getSlotX(slotNumber));
			aC.setY(250.0);
			break;
		}
		}
	}

	/** getSlotX coordinate */
	private double getSlotX(int slotNumber) {
		if (slotNumber == 1)
			return 140.0;
		else if (slotNumber == 2)
			return 353.0;
		else if (slotNumber == 3)
			return 567.0;
		else if (slotNumber == 4)
			return 776.0;
		else
			return 988.0;
	}

	/** hide back */
	private void hideComputerBack(int slotNumber) {
		if (slotNumber == 1)
			aBack1.setOpacity(0);
		else if (slotNumber == 2)
			aBack2.setOpacity(0);
		else if (slotNumber == 3)
			aBack3.setOpacity(0);
		else if (slotNumber == 4)
			aBack4.setOpacity(0);
		else
			aBack5.setOpacity(0);

	}

	/** hide back */
	private void hidePlayerBack(int slotNumber) {
		if (slotNumber == 1)
			pBack1.setOpacity(0);
		else if (slotNumber == 2)
			pBack2.setOpacity(0);
		else if (slotNumber == 3)
			pBack3.setOpacity(0);
		else if (slotNumber == 4)
			pBack4.setOpacity(0);
		else
			pBack5.setOpacity(0);
	}

	/** reset scene */
	private void resetScene() {
		// back
		aBack1.setOpacity(1.0);
		aBack2.setOpacity(1.0);
		aBack3.setOpacity(1.0);
		aBack4.setOpacity(1.0);
		aBack5.setOpacity(1.0);
		pBack1.setOpacity(1.0);
		pBack2.setOpacity(1.0);
		pBack3.setOpacity(1.0);
		pBack4.setOpacity(1.0);
		pBack5.setOpacity(1.0);
		// cards
		a1.setOpacity(0);
		a2.setOpacity(0);
		a3.setOpacity(0);
		a4.setOpacity(0);
		a5.setOpacity(0);
		a6.setOpacity(0);
		aA.setOpacity(0);
		aS.setOpacity(0);
		aC.setOpacity(0);
		p1.setOpacity(0);
		p2.setOpacity(0);
		p3.setOpacity(0);
		p4.setOpacity(0);
		p5.setOpacity(0);
		p6.setOpacity(0);
		pA.setOpacity(0);
		pS.setOpacity(0);
		pC.setOpacity(0);
		// slots
		slots.setOpacity(1);
		// check empty
		checkEmpty();
		// isClicked
		isClicked = false;
	}

	/** Check if the pile is empty */
	public void checkEmpty() {
		for (int i = 0; i < 5; i++) {
			if (b.emptyPile(i)) {
				switch (i) {
				case 0: {
					aBack1.setDisable(true);
					aBack1.setOpacity(0.3);
					disableASlot(i);
					break;
				}
				case 1: {
					aBack2.setDisable(true);
					aBack2.setOpacity(0.3);
					disableASlot(i);
					break;
				}
				case 2: {
					aBack3.setDisable(true);
					aBack3.setOpacity(0.3);
					disableASlot(i);
					break;
				}
				case 3: {
					aBack4.setDisable(true);
					aBack4.setOpacity(0.3);
					disableASlot(i);
					break;
				}
				case 4: {
					aBack5.setDisable(true);
					aBack5.setOpacity(0.3);
					disableASlot(i);
					break;
				}
				}
			}
			if (a.emptyPile(i)) {
				switch (i) {
				case 0: {
					pBack1.setDisable(true);
					pBack1.setOpacity(0.3);
					break;
				}
				case 1: {
					pBack2.setDisable(true);
					pBack2.setOpacity(0.3);
					break;
				}
				case 2: {
					pBack3.setDisable(true);
					pBack3.setOpacity(0.3);
					break;
				}
				case 3: {
					pBack4.setDisable(true);
					pBack4.setOpacity(0.3);
					break;
				}
				case 4: {
					pBack5.setDisable(true);
					pBack5.setOpacity(0.3);
					break;
				}
				}
			}
		}
	}

	private void disableASlot(int slotNumber) {
		switch (slotNumber) {
		case 0: {
			slot1.setDisable(true);
			break;
		}
		case 1: {
			slot2.setDisable(true);
			break;
		}
		case 2: {
			slot3.setDisable(true);
			break;
		}
		case 3: {
			slot4.setDisable(true);
			break;
		}
		case 4: {
			slot5.setDisable(true);
			break;
		}
		}
	}

	private void disableAll() {
		a1.setDisable(true);
		a2.setDisable(true);
		a3.setDisable(true);
		a4.setDisable(true);
		a5.setDisable(true);
		a6.setDisable(true);
		aA.setDisable(true);
		aS.setDisable(true);
		aC.setDisable(true);
		p1.setDisable(true);
		p2.setDisable(true);
		p3.setDisable(true);
		p4.setDisable(true);
		p5.setDisable(true);
		p6.setDisable(true);
		pA.setDisable(true);
		pS.setDisable(true);
		pC.setDisable(true);
		conTBTN.setDisable(true);
		disableASlot(1);
		disableASlot(2);
		disableASlot(3);
		disableASlot(4);
		disableASlot(5);
		aBack1.setDisable(true);
		aBack2.setDisable(true);
		aBack3.setDisable(true);
		aBack4.setDisable(true);
		aBack5.setDisable(true);
		pBack1.setDisable(true);
		pBack2.setDisable(true);
		pBack3.setDisable(true);
		pBack4.setDisable(true);
		pBack5.setDisable(true);
	}
	
	@FXML
	private ImageView Victory;
	@FXML
	private ImageView Defeat;

	private void showWin() {
		Victory.setFitHeight(167);
		Victory.setFitWidth(900);
		Victory.setLayoutX(62);
		Victory.setLayoutY(40);
		Victory.setX(170);
		Victory.setY(200);
		disableAll();
	}

	private void showDefeat() {
		Defeat.setFitHeight(167);
		Defeat.setFitWidth(900);
		Defeat.setLayoutX(62);
		Defeat.setLayoutY(40);
		Defeat.setX(460);
		Defeat.setY(200);
		disableAll();
	}

}
