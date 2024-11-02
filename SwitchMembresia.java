
/**
 * Write a description of class SwitchMembresia here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SwitchMembresia
{
    public static void main(String args[]) {
        
        //oro -> 20% plata -> 10% bronce->5%
        //Total compra 30, 000 
        //Cual es tu membresia ?
        
        //if  - else - if
        String membresia = "oro";
        
        switch(membresia) {
            
            case "oro": 
                //ejecutar la logica 
                System.out.println("Membresia oro");
                break;
            case "plata":
                 //ejecutar la logica 
                System.out.println("Membresia plata");
                break;
            case "bronce":
                 //ejecutar la logica 
                System.out.println("Membresia bronce");
                break; 
             default :
                 System.out.println("No tienes membresia");
                 break;
        
        }
        
    }
}
