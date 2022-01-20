import java.util.Arrays;
import java.util.Scanner;
import java.lang.reflect.Array;


public class main {

	public static void main(String args[]) {
		try {
			Scanner scn = new Scanner(System.in);
			RadioG9 radio = new RadioG9();
						
			
			while(true) {
				System.out.println("Menú");
				System.out.println("1. Encender");
				System.out.println("2. Cambiar de frecuencia");
				System.out.println("3. Siguiente emisora");
				System.out.println("4. Regresar");
				System.out.println("5. Guardar ");
				System.out.println("6. Mis emisoras");
				System.out.println("7. Apagar");
				int opcion = scn.nextInt();				
				scn.nextLine();
				
				
				if (opcion == 1) {
					if(radio.isOn() == false) {
						radio.turnOnOff();
						System.out.println("Bienvenido/a");
					}
					
					else if(radio.isOn() == true) {
						System.out.println("El dispositivo ya está encendido");
					}
				}
				
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
						System.out.println("El dispositivo está apagado");
					}
				}
				
				else if (opcion == 3) {
					if(radio.isOn() == true) {
						radio.nextStation(radio.getFrequency());
						System.out.println(radio.getStation());
					}
					
					else if (radio.isOn() == false) {
						System.out.println("El dispositivo está apagado");
					}
				}
				
			}
			
			
	
		}catch(Exception ie) {
			System.out.println("Ocurrió un error");
		}
		
	}

}
