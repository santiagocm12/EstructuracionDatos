package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Parchis {

	private ArrayList<Player> arrayPlayer = new ArrayList<Player>();
	public Player player;

	public Parchis() {

	}

	public Parchis(ArrayList<Player> player) {
		super();
		this.arrayPlayer = player;
	}

	public Player createObjectPlayer(String colour, int countingDice) {

		Player objectPlayer = new Player();

		objectPlayer.setColour(colour);
		objectPlayer.setCountingDice(countingDice);

		return objectPlayer;
	}

	public String addPlayer(Player addplayer) {

		arrayPlayer.add(addplayer);

		return "Se agregó correctamente la ficha.";
	}

	public String mostrarJugador() {

		String lista = "Se ha(n) creado " + this.arrayPlayer.size() + " jugador(es) \n";
		lista = lista + "";

		for (int i = 0; i < this.arrayPlayer.size(); i++) {
			lista = lista + "Jugador: " + (i + 1) + "  -  Color: " + this.arrayPlayer.get(i).getColour() + "\n";
		}

		return lista;

	}
	
    public void MovePlayer(Player player,int NumDado) {  	
    	int pos_actual = player.getCountingDice();
    	int new_pos = pos_actual + NumDado;
    	if(new_pos>68) {
    		new_pos = new_pos-68;
    	}
    	else {
    		
    	player.setCountingDice(new_pos);
    	
    	}
    	System.out.println("posición de la ficha actual: "+player.getCountingDice());
	}
	
	

	public ArrayList<Player> getPlayer() {
		return arrayPlayer;
	}

	public void setPlayer(ArrayList<Player> player) {
		this.arrayPlayer = player;
	}

}
