import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        /* Escribir un programa que simule una calculadora, dependiendo de la opción ingresada
        (1- suma, 2- resta, 3- multiplicación, 4- división) por el usuario, realice la operación
        solicitada. Para la división se debe restringir que el divisor sea distinto de cero. */

        String strOpcion, strNumero1, strNumero2;
        double opcion, num1, num2;
        boolean salir = false;

        while (!salir) {
            try {
                strOpcion = JOptionPane.showInputDialog("Introduzca la operación deseada \n1-suma \n2-resta \n3-multiplicación \n4-división \n5-salir ");
                opcion = Double.parseDouble(strOpcion);

                switch ((int) opcion) {
                    case 1:
                        try {
                            strNumero1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
                            num1 = Double.parseDouble(strNumero1);

                            strNumero2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
                            num2 = Double.parseDouble(strNumero2);

                            JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + String.format("%.2f", num1 + num2));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: Introduzca un número válido.");
                        }
                        break;
                    case 2:
                        try {
                            strNumero1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
                            num1 = Double.parseDouble(strNumero1);

                            strNumero2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
                            num2 = Double.parseDouble(strNumero2);

                            JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + String.format("%.2f", num1 - num2));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: Introduzca un número válido.");
                        }
                        break;
                    case 3:
                        try {
                            strNumero1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
                            num1 = Double.parseDouble(strNumero1);

                            strNumero2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
                            num2 = Double.parseDouble(strNumero2);

                            JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + String.format("%.2f", num1 * num2));
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: Introduzca un número válido.");
                        }
                        break;
                    case 4:
                        try {
                            strNumero1 = JOptionPane.showInputDialog("Introduzca el primer número: ");
                            num1 = Double.parseDouble(strNumero1);

                            strNumero2 = JOptionPane.showInputDialog("Introduzca el segundo número: ");
                            num2 = Double.parseDouble(strNumero2);

                            if (num2 != 0) {
                                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + String.format("%.2f", num1 / num2));
                            } else {
                                JOptionPane.showMessageDialog(null, "El divisor no puede ser 0.");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "Error: Introduzca un número válido.");
                        }
                        break;
                    case 5:
                        salir = true;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Introduzca un número entre 1 y 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Introduzca una opción válida.");
            }

        }
        JOptionPane.showMessageDialog(null, "Hasta pronto");
    }
}
