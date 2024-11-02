
public class clase
{
    public static void main(String args[]){
    
        double [] calificaciones; //declaracion
        double calificacion2[] = new double[3];
        
        calificaciones = new double[3];
        
        calificaciones[0] = 8.5;
        calificaciones[1]= 5.4;
        calificaciones[2]= 9.4;
        
        for (int i=0; i< calificaciones.length; i++) {
            
          System.out.println("calificacion  : " +i + "=" + calificaciones[i]);
        
        }
        
    }
}
