
/**
 * Write a description of class ValidaPassword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ValidaPassword
{
    
    public static void main (String args[]) {
    
        String password = "passw@rd12";
        
        if (password.length() >= 8 && password.matches(".*\\d.*")) {
            System.out.println("Tu pwd tiene mas de 8 caracteres, al menos un digito");
        } else if (password.length() >= 8) {
            System.out.println("Tu pwd cumple la longitud pero nada mas");
        } else {
            System.out.println("Tu pwd esta todo pedorro");
        
        }
        
        
    }
}
