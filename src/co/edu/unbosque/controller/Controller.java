package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.Parchis;
import co.edu.unbosque.model.Player;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Parchis classParchis;
	private Player classPlayer;
	public ArrayList<Player> arrayPlayer;
	private String pColour;

	public Controller() {

		view = new View();
		classParchis = new Parchis();
		classPlayer = new Player();

		this.arrayPlayer = new ArrayList<Player>();

		function();
	}

	public void function() {

		int resultQuantityPlayers = view.quantityPlayers();
		int counter1 = 0;

		if (resultQuantityPlayers == 2 || resultQuantityPlayers == 3 || resultQuantityPlayers == 4) {

			view.showResults("Se han agregado " + "( " + resultQuantityPlayers + " ) jugadores");

			if (resultQuantityPlayers == 2) {

				int player1 = view.chooseColour(
						"Escoja el color del primer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player1 == 1) {

					pColour = "Amarillo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());

				} else if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());

				} else if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				else if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				int player2 = view.chooseColour(
						"Escoja el color del segundo jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player2 == 1) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Amarillo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				} else if (player2 == 2) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {

						pColour = "Rojo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				} else if (player2 == 3) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Azul";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}

				else if (player2 == 4) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Verde";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				}
				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				}

			}

			if (resultQuantityPlayers == 3) {

				int player1 = view.chooseColour(
						"Escoja el color del primer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player1 == 1) {

					pColour = "Amarillo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				int player2 = view.chooseColour(
						"Escoja el color del segundo jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player2 == 1) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Amarillo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());

					}

				}
				if (player2 == 2) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {

						pColour = "Rojo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				}
				if (player2 == 3) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {

						pColour = "Azul";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());

					}
				}

				if (player2 == 4) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Verde";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				}

				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				} else {

					int player3 = view.chooseColour(
							"Escoja el color del tercer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

					if (player3 == 1) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Amarillo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}
					if (player3 == 2) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Rojo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}
					if (player3 == 3) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Azul";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player3 == 4) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Verde";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player1 == player3 || player2 == player3) {
						view.showResults("ERROR: Debe reiniciar el juego");
					}
				}
			}
			if (resultQuantityPlayers == 4) {

				int player1 = view.chooseColour(
						"Escoja el color del primer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player1 == 1) {

					pColour = "Amarillo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				int player2 = view.chooseColour(
						"Escoja el color del segundo jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player2 == 1) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Amarillo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}
				if (player2 == 2) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Rojo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}
				if (player2 == 3) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Azul";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}

				if (player2 == 4) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Verde";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}

				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				} else {
					int player3 = view.chooseColour(
							"Escoja el color del tercer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

					if (player3 == 1) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Amarillo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}
					if (player3 == 2) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Rojo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}
					if (player3 == 3) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Azul";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player3 == 4) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Verde";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player1 == player3 || player2 == player3) {
						view.showResults("ERROR: Debe reiniciar el juego");

					} else {
						int player4 = view.chooseColour(
								"Escoja el color del cuarto jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

						if (player4 == 1) {

							if (player1 == player4 || player2 == player4 || player3 == player4) {
								view.showResults("Cada jugador debe seleccionar un color diferente");
							} else {
								pColour = "Amarillo";

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

								String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

								System.out.println(mensajeFinal);

								System.out.println(classParchis.mostrarJugador());
							}
						}
						if (player4 == 2) {

							if (player1 == player4 || player2 == player4 || player3 == player4) {
								view.showResults("Cada jugador debe seleccionar un color diferente");
							} else {
								pColour = "Rojo";

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

								String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

								System.out.println(mensajeFinal);

								System.out.println(classParchis.mostrarJugador());
							}
						}
						if (player4 == 3) {

							if (player1 == player4 || player2 == player4 || player3 == player4) {
								view.showResults("Cada jugador debe seleccionar un color diferente");
							} else {
								pColour = "Azul";

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

								String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

								System.out.println(mensajeFinal);

								System.out.println(classParchis.mostrarJugador());
							}
						}

						if (player4 == 4) {

							if (player1 == player4 || player2 == player4 || player3 == player4) {
								view.showResults("Cada jugador debe seleccionar un color diferente");
							} else {
								pColour = "Verde";

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 3);

								String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

								
								System.out.println(mensajeFinal);

								System.out.println(classParchis.mostrarJugador());
							}
						}

						if (player1 == player4 || player2 == player4 || player3 == player4) {
							view.showResults("ERROR: Debe reiniciar el juego");
						}
					}
				}
			}

		} else {

			view.showResults("Debe seleccionar una cantidad entre 2 y 4 jugadores \nERROR: Reinicie el juego");

		}

	}
}
