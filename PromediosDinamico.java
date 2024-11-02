
/**
 * Write a description of class PromediosDinamico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class PromediosDinamico
{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Cuantas calificaciones quieres leer: ");
        int numcalif = sc.nextInt();
    
    
        double calif[] = new double[numcalif];
        
      
        for (int j= 0; j<numcalif; j++) {
        
            System.out.println("Ingresa la  calificacion "+ (j+1));
            double calificacion = sc.nextDouble();
            calif[j]= calificacion;
        
        }
        
        double suma = 0;
       
        for (int i =0 ; i<numcalif; i++) {
            suma = suma + calif[i];
        }
        
        double promedio = suma / numcalif;
        
        System.out.println("El promedio es: " + promedio);
    
    }
}
