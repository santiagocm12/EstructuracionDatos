package co.edu.unbosque.model;

public class Player {

	private String colour;
	private int countingDice;

	public Player() {

	}
	

	public Player(String colour, int countingDice) {

		this.colour = colour;
		this.countingDice = countingDice;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getCountingDice() {
		return countingDice;
	}

	public void setCountingDice(int countingDice) {
		this.countingDice = countingDice;
	}

}
