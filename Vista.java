/**
 * Algoritmos y Estructura de Datos
 * Universidad del Valle de Guatemala
 * Hoja de Trabajo No.1
 * File: RadioG9
 * @author Sebastián Franco - 21484
 * @author Nicolle Escobar - 20647
 * @author Luis Montenegro - 21699
 * @version 1.1
 * @since 21/02/2022
 */
import java.util.Scanner;

public class Vista {

    private Scanner scan;

    /**para importar el scanner */
    public void scanner(){
        scan = new Scanner(System.in);
    }

    /** Se despliega el menú de opciones */
    public void menu(){
        System.out.println("Men�");
		System.out.println("1. Encender");
		System.out.println("2. Cambiar de frecuencia");
		System.out.println("3. Siguiente emisora");
		System.out.println("4. Regresar");
		System.out.println("5. Guardar ");
		System.out.println("6. Mis emisoras");
		System.out.println("7. Apagar");
        System.out.println("(8 para salir)");
    }

    /**
     * Para obtener el ingreso del usuario
     * @return scan
     */
    public int input(){
        return scan.nextInt();
    }
    
    /** Se muestra en caso que la radio esté apagada */
    public void apagado(){
        System.out.println("El dispositivo se encuentra apagado.\n");
    }

    /** Se muestra en caso la radio esté encendida */
    public void encendido(){
        System.out.println("El dispositivo se encuentra encendido.\n ");
    }
    
    /** Se muestra en caso que el usuario ingrese un valor indebido*/
    public void errorDeIngreso(){
        System.out.println("Por favor ingrese una de las opciones permitidas.\n");
    }

    /** Se muestra en caso exista una excepción*/
    public void outOfBounds(){
        System.out.println("IndexOutOfBoundException\n Por favor verificar que el " + 
        "ArrayList no esté vacío");
    }



}
