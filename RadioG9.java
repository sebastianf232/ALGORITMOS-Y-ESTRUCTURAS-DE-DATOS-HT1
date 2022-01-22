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
import java.util.ArrayList;
import java.util.List;



public class RadioG9 implements Radio{


    private static List<Double> guardados = new ArrayList<Double>();
    private boolean frequency, onOff;
    private double am, fm, station;

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
        if(frequency){
            if(am == 530){
                am = 1610;
            }
            else{
                am -= 10;
                am = Math.round(am);
            }
        }   
        else{
            if(fm == 87.9){
                fm = 107.09;
            }
            else{
                fm -= 0.2;
                fm = Math.round(fm*100.0)/100.0;
            }

        }
    }

    public double getStation(){
        if (frequency) 
        	return am;
        else return fm;
    }
    
   
    public void saveStation(int position, double station){
        filler();
        guardados.set(position, station); 
        
    }

    public double getSavedStation(int position){
        filler();
        station = guardados.get(position);
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

    
    /**********************************************************************/
    /**Método para llenar el ArrayList previamente a ejecutar el programa */
    /**********************************************************************/ 
    private static void filler(){
        //se llena previamente para evitar el IndexOutOfBoundsException
        //cuando se intenta acceder a un índice distinto de 0
        for(double i = 0; i <= 12; i++){
            guardados.add(i);
        }
    }
    
}
