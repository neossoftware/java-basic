
/**
 * Write a description of class ArregloWhile here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ArregloWhile
{
    public static void main(String args[]) {
    
               
        double calificacion []= {5, 6.7, 9,6,7.8,7.9,10,6.7, 7.8, 6, 5};
        
        System.out.println(calificacion.length);
        
        int i=0;
        double suma = 0;
    
        while (i < calificacion.length) {
            System.out.println("calificacion es: " + (i+1) + " " + calificacion[i]);
            suma = suma + calificacion[i];
            i = i + 1;
        }
        
        System.out.println(suma);
        System.out.println("Promedio" + suma /  calificacion.length);
    }
}
