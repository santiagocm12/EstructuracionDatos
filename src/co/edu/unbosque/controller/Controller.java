package co.edu.unbosque.controller;

import java.util.ArrayList;

import co.edu.unbosque.model.ClaseX;
import co.edu.unbosque.model.Dados;
import co.edu.unbosque.model.Parchis;
import co.edu.unbosque.model.Player;
import co.edu.unbosque.view.View;

public class Controller {

	private View view;
	private Parchis classParchis;
	private Player classPlayer;
	public ArrayList<Player> arrayPlayer;
	private String pColour;
	private Dados classDados;

	public Controller() {

		view = new View();
		classParchis = new Parchis();
		classPlayer = new Player();
		classDados = new Dados();

		this.arrayPlayer = new ArrayList<Player>();

		function();
//		functionDice();
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

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());

				} else if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());

				} else if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				else if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				} else if (player2 == 2) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {

						pColour = "Rojo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				} else if (player2 == 3) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Azul";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				}
				// JUGADOR1
				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				} else {

					String jugador1 = view.pressEnter("\nJugador 1, para tirar el dado presione ENTER");

					boolean resultado1 = classDados.resultadoDados();

					if (jugador1.isEmpty()) {

						if (resultado1 == true) {

							view.showResults("\nEl resultado de los dados es par. La ficha puede salir de la carcel");

							view.pressEnter("\nJugador 1, presione ENTER para mover la ficha");
							int numdado = classDados.getTotal();
							System.out.println("El total de los dados es: " + classDados.ValorDados());
							classParchis.MovePlayer(classParchis.getPlayer().get(0), numdado);

						} else if (resultado1 == false) {

							view.showResults("\nEl resultado de los dados no es par. No puede salir de la carcel");

						}

					}

					if (classParchis.getPlayer().get(1) != null) {

					}
					// JUGADOR2

					String jugador2 = view.pressEnter("\nJugador 2, para tirar el dado presione ENTER");
					boolean resultado2 = classDados.resultadoDados();

					if (jugador2.isEmpty()) {

						if (resultado2 == true) {

							view.showResults("\nEl resultado de los dados es par. La ficha puede salir de la carcel");

							view.pressEnter("\nJugador 2, presione ENTER para mover la ficha");
							int numdado = classDados.getTotal();
							System.out.println("El total de los dados es: " + classDados.ValorDados());
							classParchis.MovePlayer(classParchis.getPlayer().get(1), numdado);

						} else if (resultado2 == false) {

							view.showResults("\nEl resultado de los dados no es par. No puede salir de la carcel");

						}

					}
				}
			}

			// CASO DE QUE HAYAN 3 JUGADORES
			if (resultQuantityPlayers == 3) {

				int player1 = view.chooseColour(
						"Escoja el color del primer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				// JUGADOR1
				if (player1 == 1) {

					pColour = "Amarillo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				
				if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				
				
				
				
				
				
				
				//JUGADOR2
				int player2 = view.chooseColour(
						"Escoja el color del segundo jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player2 == 1) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Amarillo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}

				}

				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				} else {
					
					
					
					
					
					
					
					//JUGADOR3
					int player3 = view.chooseColour(
							"Escoja el color del tercer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

					if (player3 == 1) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Amarillo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player1 == player3 || player2 == player3) {
						view.showResults("ERROR: Debe reiniciar el juego");
					} else {

						String jugador1 = view.pressEnter("\nJugador 1, para tirar el dado presione ENTER");

						boolean resultado1 = classDados.resultadoDados();

						if (jugador1.isEmpty()) {

							if (resultado1 == true) {

								view.showResults(
										"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
								
								view.pressEnter("\nJugador 1, presione ENTER para mover la ficha");
								int numdado = classDados.getTotal();
								System.out.println("El total de los dados es: " + classDados.ValorDados());
								classParchis.MovePlayer(classParchis.getPlayer().get(0), numdado);
								
								
							} else if (resultado1 == false) {

								view.showResults("\nEl resultado de los dados no es par. No puede salir de la carcel");

							}

						}

						String jugador2 = view.pressEnter("\nJugador 2, para tirar el dado presione ENTER");
						boolean resultado2 = classDados.resultadoDados();

						if (jugador2.isEmpty()) {

							if (resultado2 == true) {

								view.showResults(
										"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
								
								view.pressEnter("\nJugador 2, presione ENTER para mover la ficha");
								int numdado = classDados.getTotal();
								System.out.println("El total de los dados es: " + classDados.ValorDados());
								classParchis.MovePlayer(classParchis.getPlayer().get(1), numdado);
								
							} else if (resultado2 == false) {

								view.showResults("\nEl resultado de los dados no es par. No puede salir de la carcel");

							}

						}

						String jugador3 = view.pressEnter("\nJugador 3, para tirar el dado presione ENTER");
						boolean resultado3 = classDados.resultadoDados();

						if (jugador3.isEmpty()) {

							if (resultado3 == true) {

								view.showResults(
										"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
								
								view.pressEnter("\nJugador 3, presione ENTER para mover la ficha");
								int numdado = classDados.getTotal();
								System.out.println("El total de los dados es: " + classDados.ValorDados());
								classParchis.MovePlayer(classParchis.getPlayer().get(2), numdado);
								
							} else if (resultado3 == false) {

								view.showResults("\nEl resultado de los dados no es par. No puede salir de la carcel");

							}

						}
					}
				}
			}
			
			
			
			
			
			
			//CASO QUE HAYAN 4 JUGADORES
			if (resultQuantityPlayers == 4) {
				
				
				
				//JUGADOR1
				int player1 = view.chooseColour(
						"Escoja el color del primer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player1 == 1) {

					pColour = "Amarillo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 2) {

					pColour = "Rojo";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				if (player1 == 3) {

					pColour = "Azul";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}

				if (player1 == 4) {

					pColour = "Verde";

					Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 0);

					String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

					System.out.println(mensajeFinal);

					System.out.println(classParchis.mostrarJugador());
				}
				
				
				
				
				//JUGADOR2
				int player2 = view.chooseColour(
						"Escoja el color del segundo jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

				if (player2 == 1) {

					if (player1 == player2) {
						view.showResults("Cada jugador debe seleccionar un color diferente");
					} else {
						pColour = "Amarillo";

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

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

						Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 17);

						String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

						System.out.println(mensajeFinal);

						System.out.println(classParchis.mostrarJugador());
					}
				}

				if (player1 == player2) {
					view.showResults("ERROR: Debe reiniciar el juego");
				} else {
					
					
					
					
					//JUGADOR3
					int player3 = view.chooseColour(
							"Escoja el color del tercer jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

					if (player3 == 1) {

						if (player1 == player3 || player2 == player3) {
							view.showResults("Cada jugador debe seleccionar un color diferente");
						} else {
							pColour = "Amarillo";

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

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

							Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 34);

							String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

							System.out.println(mensajeFinal);

							System.out.println(classParchis.mostrarJugador());
						}
					}

					if (player1 == player3 || player2 == player3) {
						view.showResults("ERROR: Debe reiniciar el juego");

					} else {
						
						
						
						
						
						//JUGADOR4
						int player4 = view.chooseColour(
								"Escoja el color del cuarto jugador \n (1) Amarillo \n (2) Rojo \n (3) Azul \n (4) Verde");

						if (player4 == 1) {

							if (player1 == player4 || player2 == player4 || player3 == player4) {
								view.showResults("Cada jugador debe seleccionar un color diferente");
							} else {
								pColour = "Amarillo";

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 51);

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

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 51);

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

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 51);

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

								Player objectPlayer = this.classParchis.createObjectPlayer(pColour, 51);

								String mensajeFinal = this.classParchis.addPlayer(objectPlayer);

								System.out.println(mensajeFinal);

								System.out.println(classParchis.mostrarJugador());
							}
						}

						if (player1 == player4 || player2 == player4 || player3 == player4) {
							view.showResults("ERROR: Debe reiniciar el juego");
						} else {

							String jugador1 = view.pressEnter("\nJugador 1, para tirar el dado presione ENTER");

							boolean resultado1 = classDados.resultadoDados();

							if (jugador1.isEmpty()) {

								if (resultado1 == true) {

									view.showResults(
											"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
									
									view.pressEnter("\nJugador 1, presione ENTER para mover la ficha");
									int numdado = classDados.getTotal();
									System.out.println("El total de los dados es: " + classDados.ValorDados());
									classParchis.MovePlayer(classParchis.getPlayer().get(0), numdado);
									
								} else if (resultado1 == false) {

									view.showResults(
											"\nEl resultado de los dados no es par. No puede salir de la carcel");

								}

							}

							String jugador2 = view.pressEnter("\nJugador 2, para tirar el dado presione ENTER");
							boolean resultado2 = classDados.resultadoDados();

							if (jugador2.isEmpty()) {

								if (resultado2 == true) {

									view.showResults(
											"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
									
									view.pressEnter("\nJugador 2, presione ENTER para mover la ficha");
									int numdado = classDados.getTotal();
									System.out.println("El total de los dados es: " + classDados.ValorDados());
									classParchis.MovePlayer(classParchis.getPlayer().get(1), numdado);
									
								} else if (resultado2 == false) {

									view.showResults(
											"\nEl resultado de los dados no es par. No puede salir de la carcel");

								}

							}

							String jugador3 = view.pressEnter("\nJugador 3, para tirar el dado presione ENTER");
							boolean resultado3 = classDados.resultadoDados();

							if (jugador3.isEmpty()) {

								if (resultado3 == true) {

									view.showResults(
											"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
									
									view.pressEnter("\nJugador 3, presione ENTER para mover la ficha");
									int numdado = classDados.getTotal();
									System.out.println("El total de los dados es: " + classDados.ValorDados());
									classParchis.MovePlayer(classParchis.getPlayer().get(2), numdado);
									
								} else if (resultado3 == false) {

									view.showResults(
											"\nEl resultado de los dados no es par. No puede salir de la carcel");

								}

							}

							String jugador4 = view.pressEnter("\nJugador 4, para tirar el dado presione ENTER");
							boolean resultado4 = classDados.resultadoDados();

							if (jugador4.isEmpty()) {

								if (resultado4 == true) {

									view.showResults(
											"\nEl resultado de los dados es par. La ficha puede salir de la carcel");
									
									view.pressEnter("\nJugador 4, presione ENTER para mover la ficha");
									int numdado = classDados.getTotal();
									System.out.println("El total de los dados es: " + classDados.ValorDados());
									classParchis.MovePlayer(classParchis.getPlayer().get(3), numdado);
									
								} else if (resultado4 == false) {

									view.showResults(
											"\nEl resultado de los dados no es par. No puede salir de la carcel");

								}

							}
						}
					}
				}
			}

		} else {

			view.showResults("Debe seleccionar una cantidad entre 2 y 4 jugadores \nERROR: Reinicie el juego");

		}

	}

}
