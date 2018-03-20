
public class Cards {

	/** Generate cards for Player */
	private String[][] player = new String[5][5];

	/** Constructor */
	protected Cards() {
		this.player = new String[5][5];
	}

	/** Place Cards Randomly */
	protected void distributeCards() {
		// Crown
		int n = (int) (Math.random() * 5);
		player[n][0] = "Cr";
		// Dagger
		for (int count = 0; count < 5;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#1";
					count++;
					isEmpty = false;
				}
			}
		}
		// Sword
		for (int count = 0; count < 5;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#2";
					count++;
					isEmpty = false;
				}
			}
		}
		// MorningStar
		for (int count = 0; count < 3;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#3";
					count++;
					isEmpty = false;
				}
			}
		}
		// WarAxe
		for (int count = 0; count < 3;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#4";
					count++;
					isEmpty = false;
				}
			}
		}
		// Halberd
		for (int count = 0; count < 2;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#5";
					count++;
					isEmpty = false;
				}
			}
		}
		// Longsword
		for (int count = 0; count < 2;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "#6";
					count++;
					isEmpty = false;
				}
			}
		}
		// Archer
		for (int count = 0; count < 2;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "AR";
					count++;
					isEmpty = false;
				}
			}
		}
		// Shield
		for (int count = 0; count < 2;) {
			boolean isEmpty = true;
			while (isEmpty == true) {
				int a = (int) (Math.random() * 5);
				int b = (int) (Math.random() * 5);
				if (this.player[a][b] == null) {
					this.player[a][b] = "SH";
					count++;
					isEmpty = false;
				}
			}
		}
	}

	/** Print */
	public void ddd() {
		for (int n = 0; n < player.length; n++) {
			for (int m = 0; m < player.length; m++) {
				System.out.print(player[n][m] + " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
	}

	/** Mutator */
	protected void setCard(int row, int column, String card) {
		this.player[row][column] = card;
	}

	/** Overload Access */
	protected String getCard(int row) {
		String cardGotChosen = " ";
		for (int n = 4; n >= 0; n--) {
			if (!(player[row][n].equals(" "))) {
				cardGotChosen = player[row][n];
				break;
			}
		}
		return cardGotChosen;
	}

	/** Overload Access */
	protected String getCard(int row, int column) {
		String name = player[row][column];
		return name;
	}

	/** Discard */
	protected void discardCard(int row) {
		for (int n = 4; n >= 0; n--) {
			if (!(player[row][n].equals(" "))) {
				player[row][n] = " ";
				break;
			}
		}
	}

	/** Has Empty Slot */
	protected boolean hasEmpty() {
		boolean hasNull = false;
		for (int n = 0; n < 5; n++) {
			for (int m = 0; m < 5; m++) {
				if (player[n][m] == null) {
					hasNull = true;
					break;
				}
			}
			if (hasNull == true)
				break;
		}
		return hasNull; // If it is full: false
	}

	/**
	 * Check if the pile is empty Return true if it is empty, return false if it
	 * is not
	 */
	protected boolean emptyPile(int row) {
		if (player[row][0].equals(" "))
			return true;
		return false;
	}
}