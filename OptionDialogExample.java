import javax.swing.JOptionPane;

public class OptionDialogExample {
    public static void main(String[] args) {
        // Opciones que aparecerán en el cuadro de diálogo
        String[] options = {"Opción 1", "Opción 2", "Opción 3"};
        
        // Mostrar el cuadro de diálogo con las opciones
        int choice = JOptionPane.showOptionDialog(
                null,
                "Elige una opción:",
                "Ejemplo de showOptionDialog",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                options,
                options[0] // Opción predeterminada seleccionada
        );

        // Procesar la selección del usuario
        switch (choice) {
            case 0:
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 1");
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 2");
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "Has seleccionado Opción 3");
                break;
            default:
                JOptionPane.showMessageDialog(null, "No seleccionaste ninguna opción");
                break;
        }
    }
}