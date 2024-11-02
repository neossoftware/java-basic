
/**
 * Write a description of class Promedio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Promedio
{
    public static void main(String args[]){
    
        System.out.println("Hola");
    
        /*
        double calificacion []= new double[6];
        
        calificacion[0]= 5;
        calificacion[1]= 6.7;
        calificacion[2]= 9;
        calificacion[3]= 6;
        calificacion[4]= 7.8;
        calificacion[5]= 7.9; */
        
        double calificacion []= {5, 6.7, 9,6,7.8,7.9};
        
        double suma = 0;
        for (int j=0; j< calificacion.length; j++){
           suma = suma + calificacion[j];
        }
        
        System.out.println(suma);
    
    }
}
