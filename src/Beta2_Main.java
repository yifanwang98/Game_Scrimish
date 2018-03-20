
public class Beta2_Main {
	public static char attackP = 'P';
	public static boolean aiF = false;

	/**
	 * Array [discard attack? ; discard defend?] Discard: -1; DO NOT Discard: 1
	 */
	public static int[] gamePlay(String attack, String defend) {
		int[] status = new int[2];
		if (attack.equals("AR") && defend.equals("AR")) {
			status[0] = 1;
			status[1] = -1;
		} else if (attack.equals(defend)) {
			status[0] = -1;
			status[1] = -1;
		} else if (attack.equals("SH") && defend.equals("Cr")) {
			status[0] = 1;
			status[1] = 1;
		} else if (attack.equals("SH")) {
			status[0] = -1;
			status[1] = 1;
		} else if (attack.equals("AR") && defend.equals("SH")) {
			status[0] = 1;
			status[1] = 1;
		} else if (attack.equals("AR")) {
			status[0] = 1;
			status[1] = -1;
		} else if (attack.equals("SH")) {
			status[0] = -1;
			status[1] = 1;
		} else if (defend.equals("SH")) {
			status[0] = -1;
			status[1] = 1;
		} else if (attack.compareTo(defend) > 0) {
			status[0] = 1;
			status[1] = -1;
		} else {
			status[0] = -1;
			status[1] = 1;
		}
		return status;
	}

	/** Get attack card */
	public static String getAttack(Cards attack, int row) {
		return attack.getCard(row);
	}

	/** Get defensive card */
	public static String getDefend(Cards defend, int row) {
		return defend.getCard(row);
	}

	/**
	 * Determine whether the game is over. Return 0 if not. Return 1 if attack
	 * wins; -1 if defend wins
	 */
	public static int gameOver(String attack, String defend) {
		int gameover = 0;
		if (attack.equals("SH") && defend.equals("Cr"))
			gameover = 0;
		else if (defend.equals("Cr"))
			gameover = 1;
		else if (attack.equals("Cr") && !(defend.equals("Cr")))
			gameover = -1;
		else
			gameover = 0;
		return gameover;
	}

}