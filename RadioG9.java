/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.1
 * File: RadioG9
 * @author Sebastián Franco - 21484
 * @author Nicolle Escobar - 20647
 * @author Luis Montenegro - 21699
 */

public class RadioG9 implements Radio{
    private boolean frequency;
    private int position;
    private double station;
    private boolean onOff;
    private double am;
    private double fm;

    
    /**
     * Constructor de la clase.
     */
    public RadioG9(){
    	onOff = false;
    	am = 530;
    	fm = 87.9;
    	frequency = true;
    }
    
    public boolean isOn(){
    	return onOff;
    }

    public void turnOnOff(){
    	onOff = !onOff;
    }
    
    public void nextStation(boolean frequency) {
        if (frequency){
            if (am == 1610){
                am = 530;
            } else {
                am += 10;
                am =Math.round(am);
            }
        } else {
            if(fm == 107.9){
                fm = 87.9;
            } else {
                fm += 0.2;
                fm =Math.round(fm*100.0)/100.0;
            }
        }
    }
	    	
    	
    
    
    public void prevStation(boolean frequency){

    }

    public double getStation(){
        if (frequency) 
        	return am;
        else return fm;
    }
    
   
    public void saveStation(int position, double station){

    }

//    public double getSavedStation(int position){
//       station = this.guardados[position];
//        frequency = station > 200;
//        return station;
//    }

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
