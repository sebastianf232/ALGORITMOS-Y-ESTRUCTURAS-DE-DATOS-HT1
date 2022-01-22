/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.1
 * File: RadioG9
 * @author Sebastián Franco - 21484
 * @author Nicolle Escobar - 20647
 * @author Luis Montenegro - 21699
 * @version 1.1
 * @since 21/21/2022
 */

import java.util.InputMismatchException;



public class main {

	public static void main(String args[]) {
		//try {
			RadioG9 radio = new RadioG9();
			Vista vista = new Vista();
			boolean terminado = false;
			boolean ciclo = true;

			try {
			while(!terminado) {
				//para importar el Scanner desde la vista
				vista.scanner();
				vista.menu();
				int opcion = vista.input();


				switch(opcion){
					/********************************************/
					/**Opción que permite encender el radio*/
					/********************************************/
					case 1:
						if(radio.isOn() == false) {
							radio.turnOnOff();
							vista.encendido();
						}
						
						else if(radio.isOn() == true) {
							vista.apagado();
						}
					break;
					/********************************************/
					/**Opción que permite cambiar la frecuencia */
					/********************************************/
					case 2:
						if(radio.isOn() == true) {
							radio.switchAMFM();
							if (radio.getFrequency() == true) {
								System.out.println("Frecuencia: AM\n");
							}
							
							else if (radio.getFrequency() == false) {
								System.out.println("Frecuencia: FM\n");
							}
						}
						
						else if(radio.isOn() == false) {
							vista.apagado();
						}
					break;
					/********************************************/
					/**Opción que permite avanzar de estación */
					/********************************************/
					case 3:
						if(radio.isOn() == true) {
							radio.nextStation(radio.getFrequency());
							System.out.println(radio.getStation());
						}
						
						else if (radio.isOn() == false) {
							vista.apagado();
						}
					break;
					/********************************************/
					/**Opción que permite regresar la estación */
					/********************************************/
					case 4:
						if(radio.isOn() == true){
							radio.prevStation(radio.getFrequency());
							System.out.println(radio.getStation());
						}
						else if(radio.isOn() == false){
							vista.apagado();
						}

					break;
					/********************************************/
					/**Opción que permite guardar la emisora */
					/********************************************/
					case 5:
						if(radio.isOn() == true){
							System.out.println("Indique la posición en la que quiere guardar la emisora " + 
							"en un intervalo de 1 - 12: ");
						//verificar que el número esté en el intervalo y que no se ingrese un símbolo incorrecto
						do {
							try{
								int position = vista.input();
								if(position>12){
									vista.errorDeIngreso();
								}

								else{
									radio.saveStation(position, radio.getStation());
									ciclo = true;
									
								}
								
								}
								catch(InputMismatchException IME){
									vista.errorDeIngreso();
								}
						} while (!ciclo);
							
						}
						else if(radio.isOn() == false){
							vista.apagado();
						}

					break;
					/********************************************/
					/**Opción que permite ver las emisoras */
					/********************************************/
					case 6:
						if(radio.isOn() == true){
							System.out.println("Indique la posición de la emisora que desea poner " + 
							"en un intervalo de 1 - 12: ");
							int position = vista.input();
							//verificar que el número esté en el intervalo y que no se ingrese un símbolo incorrecto
							do {
								try {
									if(position>12){
										vista.errorDeIngreso();
									}
									else{
										radio.getSavedStation(position);
										System.out.println(radio.getSavedStation(position));
										ciclo = true;
									}
									
								}
								catch (InputMismatchException e) {
									vista.errorDeIngreso();
								}
							} while (!ciclo);

						}

						else{
							vista.apagado();
						}

					break;
					/********************************************/
					/**Opción para apagar el radio */
					/********************************************/
					case 7:
						if(radio.isOn() == true) {
							radio.turnOnOff();
						}
						else{
							vista.apagado();
						}
						
					break;
					/********************************************/
					/**Opción para finalizar el programa */
					/********************************************/
					case 8:
						terminado = true;
					break; 
					/********************************************/
					/**Si se ingresa un valor fuera de rango*/
					/********************************************/
					default:
						vista.errorDeIngreso();
					break;
				}
			}

		} 
		catch (InputMismatchException e) {
			vista.errorDeIngreso();
		}	
			
		//}catch(Exception e) {System.out.println("Ha ocurrido un error");}
		
	}

}
