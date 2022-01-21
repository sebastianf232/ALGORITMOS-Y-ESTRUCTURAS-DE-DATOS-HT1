import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;


public class main {

	public static void main(String args[]) {
		try {
			Scanner scn = new Scanner(System.in);
			RadioG9 radio = new RadioG9();
						
			
			while(true) {
				System.out.println("Menu");
				System.out.println("1. Encender");
				System.out.println("2. Cambiar de frecuencia");
				System.out.println("3. Siguiente emisora");
				System.out.println("4. Regresar");
				System.out.println("5. Guardar ");
				System.out.println("6. Mis emisoras");
				System.out.println("7. Apagar");
				int opcion = scn.nextInt();				
				scn.nextLine();
				
				/**Opcion que permite encender la Radio. */
				if (opcion == 1) {
					if(radio.isOn() == false) {
						radio.turnOnOff();
						System.out.println("Bienvenido/a");
					}
					
					else if(radio.isOn() == true) {
						System.out.println("El dispositivo ya esta encendido");
					}
				}
				
				/** Opción que permite cambiar la frecuencia. */
				else if (opcion == 2) {
					if(radio.isOn() == true) {
						radio.switchAMFM();
						if (radio.getFrequency() == true) {
							System.out.println("Frecuencia: AM");
						}
						
						else if (radio.getFrequency() == false) {
							System.out.println("Frecuencia: FM");
						}
					}
					
					else if(radio.isOn() == false) {
						System.out.println("El dispositivo esta apagado");
					}
				}
				
				/** Opción que permite avanzar de estación. */
				else if (opcion == 3) {
					if(radio.isOn() == true) {
						radio.nextStation(radio.getFrequency());
						System.out.println(radio.getStation());
					}
					
					else if (radio.isOn() == false) {
						System.out.println("El dispositivo esta apagado");
					}
				}

				/**Opcion que permite regresar de estación. */
				else if (opcion == 4){
					if(radio.isOn() == true) {
						radio.prevStation(radio.getFrequency());
						System.out.println(radio.getStation());
					}
					else if(radio.isOn() == false) {
						System.out.println("El dispositivo esta apagado");
					}
				}

				/**Opcion que permite guardar la emisora. */
				else if (opcion == 5){
					if(radio.isOn() == true) {
						System.out.println("Escoja un numero de 1-12 para guardar la emisora.");
						int a = scn.nextInt();
						radio.saveStation(a, radio.getStation());
						System.out.println("Se ha guardado la estación.");
					}
					else if(radio.isOn() == false) {
						System.out.println("El dispositivo esta apagado");
					}
				}

				/**Opcion que permite ver las emisoras. */
				else if (opcion == 6){
					if(radio.isOn() == true) {
						System.out.println("Escoja un numero de 1-12 de la emisora que quiere escuchar.");
						int a = scn.nextInt();
						radio.getSavedStation(a);
						System.out.println(radio.getSavedStation(a));
					}
					else if(radio.isOn() == false) {
						System.out.println("El dispositivo esta apagado");
					}
				}

				/**Opcion que permite apagar la Radio. */
				else if (opcion == 7){
					if(radio.isOn() == true) {
						radio.turnOnOff();
						System.out.println("La Radio ha sido apagada.");
					}
					
					else if(radio.isOn() == false) {
						System.out.println("El dispositivo ya esta apagado.");
					}
				}
				
			}
			
			
	
		}catch(Exception ie) {
			System.out.println("Ocurrio un error, intente de nuevo.");
		}
		
	}

}
