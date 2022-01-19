/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.1
 * File: RadioG9
 * @author Sebastián Franco - 21484
 * @author Nicolle Escobar - 
 * @author Luis Montenegro - 21699
 */

public class RadioG9 implements Radio{
    boolean frequency;
    int position;
    double station;

    
    /**
     * Constructor de la clase.
     */
    public RadioG9(){

    }

    public boolean isOn(){

    }

    public void turnOnOff(){

    }
    
    public void nextStation(boolean frequency){

    }
    
    public void prevStation(boolean frequency){

    }

    public double getStation(){

    }
   
    public void saveStation(int position, double station){

    }

    public double getSavedStation(int position){
        station = this.guardados[position];
        frequency = station > 200;
        return station;
    }

    public boolean getFrequency(){
        return frequency;
    }

    public void switchAMFM(){
		frequency = !frequency;
		if (frequency) {
			station = 530;
		} else {
			station = 87.9;
		}
    }

}