
import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

public class Beta2_SetUpController {
	public String[][] temp = new String[5][5];
	protected static Cards a = new Cards();
	protected static Cards b = new Cards();

	/** BACK Button */
	@FXML
	private void goBack() throws IOException {
		Beta2_Start.back();
	}

	@FXML
	private Button continueBTN;

	/** Go to ChooseFirst */
	@FXML
	private void chooseFirst() throws IOException {
		b.distributeCards();
		if (a.hasEmpty() == false) {
			continueBTN.setDisable(false);
			Beta2_Start.whoGoFirst();
		}
	}

	@FXML
	private Button randomBTN;

	/** Autoselect */
	@FXML
	private void randomCard() throws IOException {
		a = new Cards();
		a.distributeCards();
		// 1
		showP10();
		showP11();
		showP12();
		showP13();
		showP14();
		// 2
		showP20();
		showP21();
		showP22();
		showP23();
		showP24();
		// 3
		showP30();
		showP31();
		showP32();
		showP33();
		showP34();
		// 4
		showP40();
		showP41();
		showP42();
		showP43();
		showP44();
		// 5
		showP50();
		showP51();
		showP52();
		showP53();
		showP54();
		continueBTN.setDisable(false);
		slotIsEmpty(slot1, slot1Text);
		slotIsEmpty(slot2, slot2Text);
		slotIsEmpty(slot3, slot3Text);
		slotIsEmpty(slot4, slot4Text);
		slotIsEmpty(slot5, slot5Text);
		slotIsEmpty(slot6, slot6Text);
		slotIsEmpty(slotA, slotAText);
		slotIsEmpty(slotS, slotSText);
		slotIsEmpty(slotC, slotCText);
		num1 = 0;
		num2 = 0;
		num3 = 0;
		num4 = 0;
		num5 = 0;
		num6 = 0;
		numA = 0;
		numS = 0;
		numC = 0;
	}

	/** Show Pile 1 Cards Show Pile 1 Cards */
	@FXML
	private Rectangle pile1_0;
	@FXML
	private Text text1_0;

	@FXML
	private void showP10() {
		String name = a.getCard(0, 0);
		name = showName(name);
		show(pile1_0, text1_0, name);
	}

	@FXML
	private Rectangle pile1_1;
	@FXML
	private Text text1_1;

	@FXML
	private void showP11() {
		String name = a.getCard(0, 1);
		name = showName(name);
		show(pile1_1, text1_1, name);
	}

	@FXML
	private Rectangle pile1_2;
	@FXML
	private Text text1_2;

	@FXML
	private void showP12() {
		String name = a.getCard(0, 2);
		name = showName(name);
		show(pile1_2, text1_2, name);
	}

	@FXML
	private Rectangle pile1_3;
	@FXML
	private Text text1_3;

	@FXML
	private void showP13() {
		String name = a.getCard(0, 3);
		name = showName(name);
		show(pile1_3, text1_3, name);
	}

	@FXML
	private Rectangle pile1_4;
	@FXML
	private Text text1_4;

	@FXML
	private void showP14() {
		String name = a.getCard(0, 4);
		name = showName(name);
		show(pile1_4, text1_4, name);
	}

	// Show Pile 2 Cards Show Pile 2 Cards
	@FXML
	private Rectangle pile2_0;
	@FXML
	private Text text2_0;

	@FXML
	private void showP20() {
		String name = a.getCard(1, 0);
		name = showName(name);
		show(pile2_0, text2_0, name);
	}

	@FXML
	private Rectangle pile2_1;
	@FXML
	private Text text2_1;

	@FXML
	private void showP21() {
		String name = a.getCard(1, 1);
		name = showName(name);
		show(pile2_1, text2_1, name);
	}

	@FXML
	private Rectangle pile2_2;
	@FXML
	private Text text2_2;

	@FXML
	private void showP22() {
		String name = a.getCard(1, 2);
		name = showName(name);
		show(pile2_2, text2_2, name);
	}

	@FXML
	private Rectangle pile2_3;
	@FXML
	private Text text2_3;

	@FXML
	private void showP23() {
		String name = a.getCard(1, 3);
		name = showName(name);
		show(pile2_3, text2_3, name);
	}

	@FXML
	private Rectangle pile2_4;
	@FXML
	private Text text2_4;

	@FXML
	private void showP24() {
		String name = a.getCard(1, 4);
		name = showName(name);
		show(pile2_4, text2_4, name);
	}

	// Show Pile 3 Cards Show Pile 3 Cards
	@FXML
	private Rectangle pile3_0;
	@FXML
	private Text text3_0;

	@FXML
	private void showP30() {
		String name = a.getCard(2, 0);
		name = showName(name);
		show(pile3_0, text3_0, name);
	}

	@FXML
	private Rectangle pile3_1;
	@FXML
	private Text text3_1;

	@FXML
	private void showP31() {
		String name = a.getCard(2, 1);
		name = showName(name);
		show(pile3_1, text3_1, name);
	}

	@FXML
	private Rectangle pile3_2;
	@FXML
	private Text text3_2;

	@FXML
	private void showP32() {
		String name = a.getCard(2, 2);
		name = showName(name);
		show(pile3_2, text3_2, name);
	}

	@FXML
	private Rectangle pile3_3;
	@FXML
	private Text text3_3;

	@FXML
	private void showP33() {
		String name = a.getCard(2, 3);
		name = showName(name);
		show(pile3_3, text3_3, name);
	}

	@FXML
	private Rectangle pile3_4;
	@FXML
	private Text text3_4;

	@FXML
	private void showP34() {
		String name = a.getCard(2, 4);
		name = showName(name);
		show(pile3_4, text3_4, name);
	}

	// Show Pile 4 Cards Show Pile 4 Cards
	@FXML
	private Rectangle pile4_0;
	@FXML
	private Text text4_0;

	@FXML
	private void showP40() {
		String name = a.getCard(3, 0);
		name = showName(name);
		show(pile4_0, text4_0, name);
	}

	@FXML
	private Rectangle pile4_1;
	@FXML
	private Text text4_1;

	@FXML
	private void showP41() {
		String name = a.getCard(3, 1);
		name = showName(name);
		show(pile4_1, text4_1, name);
	}

	@FXML
	private Rectangle pile4_2;
	@FXML
	private Text text4_2;

	@FXML
	private void showP42() {
		String name = a.getCard(3, 2);
		name = showName(name);
		show(pile4_2, text4_2, name);
	}

	@FXML
	private Rectangle pile4_3;
	@FXML
	private Text text4_3;

	@FXML
	private void showP43() {
		String name = a.getCard(3, 3);
		name = showName(name);
		show(pile4_3, text4_3, name);
	}

	@FXML
	private Rectangle pile4_4;
	@FXML
	private Text text4_4;

	@FXML
	private void showP44() {
		String name = a.getCard(3, 4);
		name = showName(name);
		show(pile4_4, text4_4, name);
	}

	// Show Pile 5 Cards Show Pile 5 Cards
	@FXML
	private Rectangle pile5_0;
	@FXML
	private Text text5_0;

	@FXML
	private void showP50() {
		String name = a.getCard(4, 0);
		name = showName(name);
		show(pile5_0, text5_0, name);
	}

	@FXML
	private Rectangle pile5_1;
	@FXML
	private Text text5_1;

	@FXML
	private void showP51() {
		String name = a.getCard(4, 1);
		name = showName(name);
		show(pile5_1, text5_1, name);
	}

	@FXML
	private Rectangle pile5_2;
	@FXML
	private Text text5_2;

	@FXML
	private void showP52() {
		String name = a.getCard(4, 2);
		name = showName(name);
		show(pile5_2, text5_2, name);
	}

	@FXML
	private Rectangle pile5_3;
	@FXML
	private Text text5_3;

	@FXML
	private void showP53() {
		String name = a.getCard(4, 3);
		name = showName(name);
		show(pile5_3, text5_3, name);
	}

	@FXML
	private Rectangle pile5_4;
	@FXML
	private Text text5_4;

	@FXML
	private void showP54() {
		String name = a.getCard(4, 4);
		name = showName(name);
		show(pile5_4, text5_4, name);
	}

	// Show Name Switch Cases Show Name Switch Cases
	private String showName(String name) {
		try {
			switch (name) {
			case ("#1"):
				return "1-Dagger";
			case ("#2"):
				return "2-Sword";
			case ("#3"):
				return "3-Morning Star";
			case ("#4"):
				return "4-War Axe";
			case ("#5"):
				return "5-Halberd";
			case ("#6"):
				return "6-Longsword";
			case ("AR"):
				return "Archer";
			case ("SH"):
				return "Shield";
			case ("Cr"):
				return "Crown";
			default:
				return "";
			}
		} catch (NullPointerException ex) {
			return "";
		}
	}

	// Reset BTN Reset BTN
	@FXML
	private Button resetBTN;

	@FXML
	private void resetCard() throws IOException {
		a = new Cards();
		Beta2_Start.showSetUp();
	}

	// Show Method Show Method
	private void show(Rectangle pile, Text text, String name) {
		pile.setFill(Color.ANTIQUEWHITE);
		text.setDisable(false);
		text.setText(name);
		text.setOpacity(1);
	}

	// Help BTN
	@FXML
	private Button helpBTN;

	@FXML
	private void help() throws IOException {
		Beta2_HelpController.helpView();
	}

	protected static boolean discard = false;

	// Discard Pile1 Discard Pile1
	@FXML
	protected static void discardPile1() {
		if (!a.getCard(0).equals("Cr")) {
			a.discardCard(0);
			discard = true;
		}
	}

	// Discard Pile2 Discard Pile2
	@FXML
	protected static void discardPile2() {
		if (!a.getCard(1).equals("Cr")) {
			a.discardCard(1);
			discard = true;
		}
	}

	// Discard Pile3 Discard Pile3
	@FXML
	protected static void discardPile3() {
		if (!a.getCard(2).equals("Cr")) {
			a.discardCard(2);
			discard = true;
		}
	}

	// Discard Pile4 Discard Pile4
	@FXML
	protected static void discardPile4() {
		if (!a.getCard(3).equals("Cr")) {
			a.discardCard(3);
			discard = true;
		}
	}

	// Discard Pile5 Discard Pile5
	@FXML
	protected static void discardPile5() {
		if (!a.getCard(4).equals("Cr")) {
			a.discardCard(4);
			discard = true;
		}
	}

	// Record cards' number Record cards' number
	private int num1 = 5;
	private int num2 = 5;
	private int num3 = 3;
	private int num4 = 3;
	private int num5 = 2;
	private int num6 = 2;
	private int numA = 2;
	private int numS = 2;
	private int numC = 1;

	// Define Slots' fx:id Define Slots' fx:id
	@FXML
	private Rectangle slot1;
	@FXML
	private Rectangle slot2;
	@FXML
	private Rectangle slot3;
	@FXML
	private Rectangle slot4;
	@FXML
	private Rectangle slot5;
	@FXML
	private Rectangle slot6;
	@FXML
	private Rectangle slotA;
	@FXML
	private Rectangle slotS;
	@FXML
	private Rectangle slotC;

	// Slots' Text Name Slots' Text Name
	@FXML
	private Text slot1Text;
	@FXML
	private Text slot2Text;
	@FXML
	private Text slot3Text;
	@FXML
	private Text slot4Text;
	@FXML
	private Text slot5Text;
	@FXML
	private Text slot6Text;
	@FXML
	private Text slotAText;
	@FXML
	private Text slotSText;
	@FXML
	private Text slotCText;

	// Evaluation Parameters Evaluation Parameters
	private boolean isClicked = false;
	private boolean isSlot = false;
	private String cardName = "";
	private String click1 = "";
	private String click2 = "";
	private int[] cardPos1 = { 0, 0 };
	private int[] cardPos2 = { 0, 0 };
	private Rectangle previousClicked;

	/** When a slot is empty */
	private void slotIsEmpty(Rectangle slot, Text text) {
		slot.setFill(Color.SILVER);
		slot.setDisable(true);
		text.setDisable(true);
	}

	/** Check Slot */
	private void checkSlot() {
		switch (cardName) {
		case ("#1"): {
			num1--;
			if (num1 == 0)
				slotIsEmpty(slot1, slot1Text);
			break;
		}
		case ("#2"): {
			num2--;
			if (num2 == 0)
				slotIsEmpty(slot2, slot2Text);
			break;
		}
		case ("#3"): {
			num3--;
			if (num3 == 0)
				slotIsEmpty(slot3, slot3Text);
			break;
		}
		case ("#4"): {
			num4--;
			if (num4 == 0)
				slotIsEmpty(slot4, slot4Text);
			break;
		}
		case ("#5"): {
			num5--;
			if (num5 == 0)
				slotIsEmpty(slot5, slot5Text);
			break;
		}
		case ("#6"): {
			num6--;
			if (num6 == 0)
				slotIsEmpty(slot6, slot6Text);
			break;
		}
		case ("AR"): {
			numA--;
			if (numA == 0)
				slotIsEmpty(slotA, slotAText);
			break;
		}
		case ("SH"): {
			numS--;
			if (numS == 0)
				slotIsEmpty(slotS, slotSText);
			break;
		}
		case ("Cr"): {
			numC--;
			if (numC == 0)
				slotIsEmpty(slotC, slotCText);
			break;
		}
		}
		if (num1 == 0 && num2 == 0 && num3 == 0 && num4 == 0 && num5 == 0 && num6 == 0 && numA == 0 && numS == 0
				&& numC == 0) {
			continueBTN.setDisable(false);
		}
	}

	/**
	 * Slot1 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot1;
			click1 = "#1";
			cardName = "#1";
			changeColor(slot1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot1);
				click1 = "#1";
				cardName = "#1";
			}
			// isSlot == false
			else {
				click2 = "#1";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot1);
					num1++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Slot2 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot2;
			click1 = "#2";
			cardName = "#2";
			changeColor(slot2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot2);
				click1 = "#2";
				cardName = "#2";
			}
			// isSlot == false
			else {
				click2 = "#2";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot2);
					num2++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Slot3 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot3;
			click1 = "#3";
			cardName = "#3";
			changeColor(slot3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot3);
				click1 = "#3";
				cardName = "#3";
			}
			// isSlot == false
			else {
				click2 = "#3";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot3);
					num3++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Slot4 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot4;
			click1 = "#4";
			cardName = "#4";
			changeColor(slot4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot4);
				click1 = "#4";
				cardName = "#4";
			}
			// isSlot == false
			else {
				click2 = "#1";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot4);
					num4++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Slot5 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot5Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot5;
			click1 = "#5";
			cardName = "#5";
			changeColor(slot5);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot5);
				click1 = "#5";
				cardName = "#5";
			}
			// isSlot == false
			else {
				click2 = "#5";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot5);
					num5++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Slot6 clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Slot6Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slot6;
			click1 = "#6";
			cardName = "#6";
			changeColor(slot6);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slot6);
				click1 = "#6";
				cardName = "#6";
			}
			// isSlot == false
			else {
				click2 = "#6";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slot6);
					num6++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * SlotA clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void SlotAClicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slotA;
			click1 = "AR";
			cardName = "AR";
			changeColor(slotA);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slotA);
				click1 = "AR";
				cardName = "AR";
			}
			// isSlot == false
			else {
				click2 = "AR";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slotA);
					numA++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * SlotS clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void SlotSClicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slotS;
			click1 = "SH";
			cardName = "SH";
			changeColor(slotS);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slotS);
				click1 = "SH";
				cardName = "SH";
			}
			// isSlot == false
			else {
				click2 = "SH";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slotS);
					numS++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * SlotC clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void SlotCClicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			isSlot = true;
			previousClicked = slotC;
			click1 = "Cr";
			cardName = "Cr";
			changeColor(slotC);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				changeColorBack(previousClicked);
				changeColor(slotC);
				click1 = "Cr";
				cardName = "Cr";
			}
			// isSlot == false
			else {
				click2 = "Cr";
				// Same Card?
				if (click1 == null) {

				} else if (click1.equals(click2)) {
					putCardBack(slotC);
					numC++;
				}
				resetVariable();
			}
		}
	}

	/**
	 * Pile 1 Clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Pile1_0Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(0, 0);
			cardPos1[0] = 0;
			cardPos1[1] = 0;
			changeColor(pile1_0);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 0;
				cardPos1[1] = 0;
				// Check if it is null
				if (a.getCard(0, 0) == null) {
					a.setCard(0, 0, cardName);
					checkSlot();
					showP10();
				} else {
					// Same Card?
					if (cardName != a.getCard(0, 0)) {
						putCardBack();
						a.setCard(0, 0, cardName);
						checkSlot();
						showP10();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 0;
				cardPos2[1] = 0;
				swtichCard();
				showP10();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile1_1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(0, 1);
			cardPos1[0] = 0;
			cardPos1[1] = 1;
			changeColor(pile1_1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 0;
				cardPos1[1] = 1;
				// Check if it is null
				if (a.getCard(0, 1) == null) {
					a.setCard(0, 1, cardName);
					checkSlot();
					showP11();
				} else {
					// Same Card?
					if (cardName != a.getCard(0, 1)) {
						putCardBack();
						a.setCard(0, 1, cardName);
						checkSlot();
						showP11();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 0;
				cardPos2[1] = 1;
				swtichCard();
				showP11();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile1_2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(0, 2);
			cardPos1[0] = 0;
			cardPos1[1] = 2;
			changeColor(pile1_2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 0;
				cardPos1[1] = 2;
				// Check if it is null
				if (a.getCard(0, 2) == null) {
					a.setCard(0, 2, cardName);
					checkSlot();
					showP12();
				} else {
					// Same Card?
					if (cardName != a.getCard(0, 2)) {
						putCardBack();
						a.setCard(0, 2, cardName);
						checkSlot();
						showP12();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 0;
				cardPos2[1] = 2;
				swtichCard();
				showP12();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile1_3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(0, 3);
			cardPos1[0] = 0;
			cardPos1[1] = 3;
			changeColor(pile1_3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 0;
				cardPos1[1] = 3;
				// Check if it is null
				if (a.getCard(0, 3) == null) {
					a.setCard(0, 3, cardName);
					checkSlot();
					showP13();
				} else {
					// Same Card?
					if (cardName != a.getCard(0, 3)) {
						putCardBack();
						a.setCard(0, 3, cardName);
						checkSlot();
						showP13();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 0;
				cardPos2[1] = 3;
				swtichCard();
				showP13();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile1_4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(0, 4);
			cardPos1[0] = 0;
			cardPos1[1] = 4;
			changeColor(pile1_4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 0;
				cardPos1[1] = 4;
				// Check if it is null
				if (a.getCard(0, 4) == null) {
					a.setCard(0, 4, cardName);
					checkSlot();
					showP14();
				} else {
					// Same Card?
					if (cardName != a.getCard(0, 4)) {
						putCardBack();
						a.setCard(0, 4, cardName);
						checkSlot();
						showP14();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 0;
				cardPos2[1] = 4;
				swtichCard();
				showP14();
			}
			resetVariable();
		}
	}

	/**
	 * Pile 2 Clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Pile2_0Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(1, 0);
			cardPos1[0] = 0;
			cardPos1[1] = 0;
			changeColor(pile2_0);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 1;
				cardPos1[1] = 0;
				// Check if it is null
				if (a.getCard(1, 0) == null) {
					a.setCard(1, 0, cardName);
					checkSlot();
					showP20();
				} else {
					// Same Card?
					if (cardName != a.getCard(1, 0)) {
						putCardBack();
						a.setCard(1, 0, cardName);
						checkSlot();
						showP20();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 1;
				cardPos2[1] = 0;
				swtichCard();
				showP20();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile2_1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(1, 1);
			cardPos1[0] = 1;
			cardPos1[1] = 1;
			changeColor(pile2_1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 1;
				cardPos1[1] = 1;
				// Check if it is null
				if (a.getCard(1, 1) == null) {
					a.setCard(1, 1, cardName);
					checkSlot();
					showP21();
				} else {
					// Same Card?
					if (cardName != a.getCard(1, 1)) {
						putCardBack();
						a.setCard(1, 1, cardName);
						checkSlot();
						showP21();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 1;
				cardPos2[1] = 1;
				swtichCard();
				showP21();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile2_2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(1, 2);
			cardPos1[0] = 1;
			cardPos1[1] = 2;
			changeColor(pile2_2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 1;
				cardPos1[1] = 2;
				// Check if it is null
				if (a.getCard(1, 2) == null) {
					a.setCard(1, 2, cardName);
					checkSlot();
					showP22();
				} else {
					// Same Card?
					if (cardName != a.getCard(1, 2)) {
						putCardBack();
						a.setCard(1, 2, cardName);
						checkSlot();
						showP22();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 1;
				cardPos2[1] = 2;
				swtichCard();
				showP22();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile2_3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(1, 3);
			cardPos1[0] = 1;
			cardPos1[1] = 3;
			changeColor(pile2_3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 1;
				cardPos1[1] = 3;
				// Check if it is null
				if (a.getCard(1, 3) == null) {
					a.setCard(1, 3, cardName);
					checkSlot();
					showP23();
				} else {
					// Same Card?
					if (cardName != a.getCard(1, 3)) {
						putCardBack();
						a.setCard(1, 3, cardName);
						checkSlot();
						showP23();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 1;
				cardPos2[1] = 3;
				swtichCard();
				showP23();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile2_4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(1, 4);
			cardPos1[0] = 1;
			cardPos1[1] = 4;
			changeColor(pile2_4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 1;
				cardPos1[1] = 4;
				// Check if it is null
				if (a.getCard(1, 4) == null) {
					a.setCard(1, 4, cardName);
					checkSlot();
					showP24();
				} else {
					// Same Card?
					if (cardName != a.getCard(1, 4)) {
						putCardBack();
						a.setCard(1, 4, cardName);
						checkSlot();
						showP24();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 1;
				cardPos2[1] = 4;
				swtichCard();
				showP24();
			}
			resetVariable();
		}
	}

	/**
	 * Pile 3 Clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Pile3_0Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(2, 0);
			cardPos1[0] = 2;
			cardPos1[1] = 0;
			changeColor(pile3_0);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 2;
				cardPos1[1] = 0;
				// Check if it is null
				if (a.getCard(2, 0) == null) {
					a.setCard(2, 0, cardName);
					checkSlot();
					showP30();
				} else {
					// Same Card?
					if (cardName != a.getCard(2, 0)) {
						putCardBack();
						a.setCard(2, 0, cardName);
						checkSlot();
						showP30();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 2;
				cardPos2[1] = 0;
				swtichCard();
				showP20();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile3_1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(2, 1);
			cardPos1[0] = 2;
			cardPos1[1] = 1;
			changeColor(pile3_1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 2;
				cardPos1[1] = 1;
				// Check if it is null
				if (a.getCard(2, 1) == null) {
					a.setCard(2, 1, cardName);
					checkSlot();
					showP31();
				} else {
					// Same Card?
					if (cardName != a.getCard(2, 1)) {
						putCardBack();
						a.setCard(2, 1, cardName);
						checkSlot();
						showP31();

					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 2;
				cardPos2[1] = 1;
				swtichCard();
				showP31();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile3_2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(2, 2);
			cardPos1[0] = 2;
			cardPos1[1] = 2;
			changeColor(pile3_2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 2;
				cardPos1[1] = 2;
				// Check if it is null
				if (a.getCard(2, 2) == null) {
					a.setCard(2, 2, cardName);
					checkSlot();
					showP32();
				} else {
					// Same Card?
					if (cardName != a.getCard(2, 2)) {
						putCardBack();
						a.setCard(2, 2, cardName);
						checkSlot();
						showP32();

					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 2;
				cardPos2[1] = 2;
				swtichCard();
				showP32();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile3_3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(2, 3);
			cardPos1[0] = 2;
			cardPos1[1] = 3;
			changeColor(pile3_3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 2;
				cardPos1[1] = 3;
				// Check if it is null
				if (a.getCard(2, 3) == null) {
					a.setCard(2, 3, cardName);
					checkSlot();
					showP33();
				} else {
					// Same Card?
					if (cardName != a.getCard(2, 3)) {
						putCardBack();
						a.setCard(2, 3, cardName);
						checkSlot();
						showP33();
					}
				}
			}
			// isSlot == false
			else {

				cardPos2[0] = 2;
				cardPos2[1] = 3;
				swtichCard();
				showP33();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile3_4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(2, 4);
			cardPos1[0] = 2;
			cardPos1[1] = 4;
			changeColor(pile3_4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 2;
				cardPos1[1] = 4;
				// Check if it is null
				if (a.getCard(2, 4) == null) {
					a.setCard(2, 4, cardName);
					checkSlot();
					showP34();
				} else {
					// Same Card?
					if (cardName != a.getCard(2, 4)) {
						putCardBack();
						a.setCard(2, 4, cardName);
						checkSlot();
						showP34();
					}
				}
			}
			// isSlot == false
			else {

				cardPos2[0] = 2;
				cardPos2[1] = 4;
				swtichCard();
				showP34();
			}
			resetVariable();
		}
	}

	/**
	 * Pile 4 Clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Pile4_0Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(3, 0);
			cardPos1[0] = 3;
			cardPos1[1] = 0;
			changeColor(pile4_0);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 3;
				cardPos1[1] = 0;
				// Check if it is null
				if (a.getCard(3, 0) == null) {
					a.setCard(3, 0, cardName);
					checkSlot();
					showP40();
				} else {
					// Same Card?
					if (cardName != a.getCard(3, 0)) {

						putCardBack();
						a.setCard(3, 0, cardName);
						checkSlot();
						showP40();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 3;
				cardPos2[1] = 0;
				swtichCard();
				showP40();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile4_1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(3, 1);
			cardPos1[0] = 3;
			cardPos1[1] = 1;
			changeColor(pile4_1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 3;
				cardPos1[1] = 1;
				// Check if it is null
				if (a.getCard(3, 1) == null) {
					a.setCard(3, 1, cardName);
					checkSlot();
					showP41();
				} else {
					// Same Card?
					if (cardName != a.getCard(3, 1)) {
						putCardBack();
						a.setCard(3, 1, cardName);
						checkSlot();
						showP41();

					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 3;
				cardPos2[1] = 1;
				swtichCard();
				showP41();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile4_2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(3, 2);
			cardPos1[0] = 3;
			cardPos1[1] = 2;
			changeColor(pile4_2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 3;
				cardPos1[1] = 2;
				// Check if it is null
				if (a.getCard(3, 2) == null) {
					a.setCard(3, 2, cardName);
					checkSlot();
					showP42();
				} else {
					// Same Card?
					if (cardName != a.getCard(3, 2)) {
						putCardBack();
						a.setCard(3, 2, cardName);
						checkSlot();
						showP42();
					}
				}
			}
			// isSlot == false
			else {

				cardPos2[0] = 3;
				cardPos2[1] = 2;
				swtichCard();
				showP42();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile4_3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(3, 3);
			cardPos1[0] = 3;
			cardPos1[1] = 3;
			changeColor(pile4_3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 3;
				cardPos1[1] = 3;
				// Check if it is null
				if (a.getCard(3, 3) == null) {
					a.setCard(3, 3, cardName);
					checkSlot();
					showP43();
				} else {
					// Same Card?
					if (cardName != a.getCard(3, 3)) {
						putCardBack();
						a.setCard(3, 3, cardName);
						checkSlot();
						showP43();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 3;
				cardPos2[1] = 3;
				swtichCard();
				showP43();

			}
			resetVariable();
		}
	}

	@FXML
	private void Pile4_4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(3, 4);
			cardPos1[0] = 3;
			cardPos1[1] = 4;
			changeColor(pile4_4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 3;
				cardPos1[1] = 4;
				// Check if it is null
				if (a.getCard(3, 4) == null) {
					a.setCard(3, 4, cardName);
					checkSlot();
					showP44();
				} else {
					// Same Card?
					if (cardName != a.getCard(3, 4)) {
						putCardBack();
						a.setCard(3, 4, cardName);
						checkSlot();
						showP44();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 3;
				cardPos2[1] = 4;
				swtichCard();
				showP44();
			}
			resetVariable();
		}
	}

	/**
	 * Pile 5 Clicked
	 * 
	 * @throws IOException
	 */
	@FXML
	private void Pile5_0Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(4, 0);
			cardPos1[0] = 4;
			cardPos1[1] = 0;
			changeColor(pile5_0);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 4;
				cardPos1[1] = 0;
				// Check if it is null
				if (a.getCard(4, 0) == null) {
					a.setCard(4, 0, cardName);
					checkSlot();
					showP50();
				} else {
					// Same Card?
					if (cardName != a.getCard(4, 0)) {
						putCardBack();
						a.setCard(4, 0, cardName);
						checkSlot();
						showP50();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 4;
				cardPos2[1] = 0;
				swtichCard();
				showP50();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile5_1Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(4, 1);
			cardPos1[0] = 4;
			cardPos1[1] = 1;
			changeColor(pile5_1);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 4;
				cardPos1[1] = 1;
				// Check if it is null
				if (a.getCard(4, 1) == null) {
					a.setCard(4, 1, cardName);
					checkSlot();
					showP51();
				} else {
					// Same Card?
					if (cardName != a.getCard(4, 1)) {
						putCardBack();
						a.setCard(4, 1, cardName);
						checkSlot();
						showP51();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 4;
				cardPos2[1] = 1;
				swtichCard();
				showP51();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile5_2Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(4, 2);
			cardPos1[0] = 4;
			cardPos1[1] = 2;
			changeColor(pile5_2);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 4;
				cardPos1[1] = 2;
				// Check if it is null
				if (a.getCard(4, 2) == null) {
					a.setCard(4, 2, cardName);
					checkSlot();
					showP52();
				} else {
					// Same Card?
					if (cardName != a.getCard(4, 2)) {
						putCardBack();
						a.setCard(4, 2, cardName);
						checkSlot();
						showP52();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 4;
				cardPos2[1] = 2;
				swtichCard();
				showP52();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile5_3Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(4, 3);
			cardPos1[0] = 4;
			cardPos1[1] = 3;
			changeColor(pile5_3);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 4;
				cardPos1[1] = 3;
				// Check if it is null
				if (a.getCard(4, 3) == null) {
					a.setCard(4, 3, cardName);
					checkSlot();
					showP53();
				} else {
					// Same Card?
					if (cardName != a.getCard(4, 3)) {
						putCardBack();
						a.setCard(4, 3, cardName);
						checkSlot();
						showP53();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 4;
				cardPos2[1] = 3;
				swtichCard();
				showP53();
			}
			resetVariable();
		}
	}

	@FXML
	private void Pile5_4Clicked(MouseEvent event) throws IOException {
		// isClicked == false: this is the first click
		if (isClicked == false) {
			isClicked = true;
			click1 = a.getCard(4, 4);
			cardPos1[0] = 4;
			cardPos1[1] = 4;
			changeColor(pile5_4);
		}
		// isClicked == true: this is the second click
		else {
			// isSlot == true
			if (isSlot == true) {
				cardPos1[0] = 4;
				cardPos1[1] = 4;
				// Check if it is null
				if (a.getCard(4, 4) == null) {
					a.setCard(4, 4, cardName);
					checkSlot();
					showP54();
				} else {
					// Same Card?
					if (cardName != a.getCard(4, 4)) {
						putCardBack();
						a.setCard(4, 4, cardName);
						checkSlot();
						showP54();
					}
				}
			}
			// isSlot == false
			else {
				cardPos2[0] = 4;
				cardPos2[1] = 4;
				swtichCard();
				showP54();
			}
			resetVariable();
		}
	}

	@FXML
	private void resetVariable() throws IOException {
		isClicked = false;
		isSlot = false;
		click1 = "";
		click2 = "";
		cardName = null;
		try {
			changeColorBack(previousClicked);
		} catch (NullPointerException e) {

		}
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a.getCard(i, j) != null)
					setCardsColor(i, j);
			}
		}
		// Check full
		boolean isFull = true;
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (a.getCard(i, j) == null) {
					isFull = false;
					resetCardsColor(i, j);
				}
			}
			if (isFull == false)
				break;
		}
		// Check Empty
		if (num1 == 0)
			slotIsEmpty(slot1, slot1Text);
		else
			slotIsNotEmpty(slot1, slot1Text);
		if (num2 == 0)
			slotIsEmpty(slot2, slot2Text);
		else
			slotIsNotEmpty(slot2, slot2Text);
		if (num3 == 0)
			slotIsEmpty(slot3, slot3Text);
		else
			slotIsNotEmpty(slot3, slot3Text);
		if (num4 == 0)
			slotIsEmpty(slot4, slot4Text);
		else
			slotIsNotEmpty(slot4, slot4Text);
		if (num5 == 0)
			slotIsEmpty(slot5, slot5Text);
		else
			slotIsNotEmpty(slot5, slot5Text);
		if (num6 == 0)
			slotIsEmpty(slot6, slot6Text);
		else
			slotIsNotEmpty(slot6, slot6Text);
		if (numA == 0)
			slotIsEmpty(slotA, slotAText);
		else
			slotIsNotEmpty(slotA, slotAText);
		if (numS == 0)
			slotIsEmpty(slotS, slotSText);
		else
			slotIsNotEmpty(slotS, slotSText);
		if (numC == 0)
			slotIsEmpty(slotC, slotCText);
		else
			slotIsNotEmpty(slotC, slotCText);

		// Check for crown
		boolean noError = false;
		if (numC == 0) {
			for (int i = 0; i < 5; i++) {
				try {
					if (a.getCard(i, 0).equals("Cr")) {
						noError = true;
						break;
					}
				} catch (NullPointerException e) {
					noError = true;
				}
			}
		} else {
			for (int i = 0; i < 5; i++) {
				if (a.getCard(i, 0) == null) {
					noError = true;
					break;
				}
			}
		}
		if (isFull && noError) {
			continueBTN.setDisable(false);
		}
		if (!noError) {
			Beta2_SetUpErrorController.ErrorView();
			continueBTN.setDisable(true);
		}
	}

	private void slotIsNotEmpty(Rectangle rec, Text text) {
		rec.setDisable(false);
		text.setDisable(false);
		changeColorBack(rec);
	}

	private void putCardBack(Rectangle slot) {
		slot.setDisable(false);
		changeColorBack(slot);
		a.setCard(cardPos1[0], cardPos1[1], null);
	}

	private void putCardBack() {
		switch (a.getCard(cardPos1[0], cardPos1[1])) {
		case "#1": {
			putCardBack(slot1);
			num1++;
			break;
		}
		case "#2": {
			putCardBack(slot2);
			num2++;
			break;
		}
		case "#3": {
			putCardBack(slot3);
			num3++;
			break;
		}
		case "#4": {
			putCardBack(slot4);
			num4++;
			break;
		}
		case "#5": {
			putCardBack(slot5);
			num5++;
			break;
		}
		case "#6": {
			putCardBack(slot6);
			num6++;
			break;
		}
		case "AR": {
			putCardBack(slotA);
			numA++;
			break;
		}
		case "SH": {
			putCardBack(slotS);
			numS++;
			break;
		}
		case "Cr": {
			putCardBack(slotC);
			numC++;
			break;
		}
		}
	}

	private void changeColor(Rectangle rec) {
		rec.setFill(Color.LIGHTCYAN);
	}

	private void changePileColor(Rectangle rec) {
		rec.setFill(Color.BISQUE);
	}

	private void changeColorBack(Rectangle rec) {
		rec.setFill(Color.WHITE);
	}

	private void setCardsColor(int row, int column) {
		switch (row) {
		case 0: {
			if (column == 0)
				changePileColor(pile1_0);
			else if (column == 1)
				changePileColor(pile1_1);
			else if (column == 2)
				changePileColor(pile1_2);
			else if (column == 3)
				changePileColor(pile1_3);
			else
				changePileColor(pile1_4);
			break;
		}
		case 1: {
			if (column == 0)
				changePileColor(pile2_0);
			else if (column == 1)
				changePileColor(pile2_1);
			else if (column == 2)
				changePileColor(pile2_2);
			else if (column == 3)
				changePileColor(pile2_3);
			else
				changePileColor(pile2_4);
			break;
		}
		case 2: {
			if (column == 0)
				changePileColor(pile3_0);
			else if (column == 1)
				changePileColor(pile3_1);
			else if (column == 2)
				changePileColor(pile3_2);
			else if (column == 3)
				changePileColor(pile3_3);
			else
				changePileColor(pile3_4);
			break;
		}
		case 3: {
			if (column == 0)
				changePileColor(pile4_0);
			else if (column == 1)
				changePileColor(pile4_1);
			else if (column == 2)
				changePileColor(pile4_2);
			else if (column == 3)
				changePileColor(pile4_3);
			else
				changePileColor(pile4_4);
			break;
		}
		case 4: {
			if (column == 0)
				changePileColor(pile5_0);
			else if (column == 1)
				changePileColor(pile5_1);
			else if (column == 2)
				changePileColor(pile5_2);
			else if (column == 3)
				changePileColor(pile5_3);
			else
				changePileColor(pile5_4);
			break;
		}
		}
	}

	private void resetCardsColor(int row, int column) {
		switch (row) {
		case 0: {
			if (column == 0)
				pile1_0.setFill(Color.rgb(234, 234, 234));
			else if (column == 1)
				pile1_1.setFill(Color.rgb(234, 234, 234));
			else if (column == 2)
				pile1_2.setFill(Color.rgb(234, 234, 234));
			else if (column == 3)
				pile1_3.setFill(Color.rgb(234, 234, 234));
			else
				pile1_4.setFill(Color.rgb(234, 234, 234));
			break;
		}
		case 1: {
			if (column == 0)
				pile2_0.setFill(Color.rgb(234, 234, 234));
			else if (column == 1)
				pile2_1.setFill(Color.rgb(234, 234, 234));
			else if (column == 2)
				pile2_2.setFill(Color.rgb(234, 234, 234));
			else if (column == 3)
				pile2_3.setFill(Color.rgb(234, 234, 234));
			else
				pile2_4.setFill(Color.rgb(234, 234, 234));
			break;
		}
		case 2: {
			if (column == 0)
				pile3_0.setFill(Color.rgb(234, 234, 234));
			else if (column == 1)
				pile3_1.setFill(Color.rgb(234, 234, 234));
			else if (column == 2)
				pile3_2.setFill(Color.rgb(234, 234, 234));
			else if (column == 3)
				pile3_3.setFill(Color.rgb(234, 234, 234));
			else
				pile3_4.setFill(Color.rgb(234, 234, 234));
			break;
		}
		case 3: {
			if (column == 0)
				pile4_0.setFill(Color.rgb(234, 234, 234));
			else if (column == 1)
				pile4_1.setFill(Color.rgb(234, 234, 234));
			else if (column == 2)
				pile4_2.setFill(Color.rgb(234, 234, 234));
			else if (column == 3)
				pile4_3.setFill(Color.rgb(234, 234, 234));
			else
				pile4_4.setFill(Color.rgb(234, 234, 234));
			break;
		}
		case 4: {
			if (column == 0)
				pile5_0.setFill(Color.rgb(234, 234, 234));
			else if (column == 1)
				pile5_1.setFill(Color.rgb(234, 234, 234));
			else if (column == 2)
				pile5_2.setFill(Color.rgb(234, 234, 234));
			else if (column == 3)
				pile5_3.setFill(Color.rgb(234, 234, 234));
			else
				pile5_4.setFill(Color.rgb(234, 234, 234));
			break;
		}
		}
	}

	private void swtichCard() {
		String tempCard = a.getCard(cardPos1[0], cardPos1[1]);
		a.setCard(cardPos1[0], cardPos1[1], a.getCard(cardPos2[0], cardPos2[1]));
		a.setCard(cardPos2[0], cardPos2[1], tempCard);
		// Show the card before
		switch (cardPos1[0]) {
		case 0: {
			if (cardPos1[1] == 0) {
				showP10();
			} else if (cardPos1[1] == 1) {
				showP11();
			} else if (cardPos1[1] == 2) {
				showP12();
			} else if (cardPos1[1] == 3) {
				showP13();
			} else
				showP14();
			break;
		}
		case 1: {
			if (cardPos1[1] == 0) {
				showP20();
			} else if (cardPos1[1] == 1) {
				showP21();
			} else if (cardPos1[1] == 2) {
				showP22();
			} else if (cardPos1[1] == 3) {
				showP23();
			} else
				showP24();
			break;
		}
		case 2: {
			if (cardPos1[1] == 0) {
				showP30();
			} else if (cardPos1[1] == 1) {
				showP31();
			} else if (cardPos1[1] == 2) {
				showP32();
			} else if (cardPos1[1] == 3) {
				showP33();
			} else
				showP34();
			break;
		}
		case 3: {
			if (cardPos1[1] == 0) {
				showP40();
			} else if (cardPos1[1] == 1) {
				showP41();
			} else if (cardPos1[1] == 2) {
				showP42();
			} else if (cardPos1[1] == 3) {
				showP43();
			} else
				showP44();
			break;
		}
		case 4: {
			if (cardPos1[1] == 0) {
				showP50();
			} else if (cardPos1[1] == 1) {
				showP51();
			} else if (cardPos1[1] == 2) {
				showP52();
			} else if (cardPos1[1] == 3) {
				showP53();
			} else
				showP54();
			break;
		}
		}
	}
}