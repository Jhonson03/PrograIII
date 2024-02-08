import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       /*Escribir un programa que ingresado el radio de una circunferencia, calcule el área y
       volumen tomando en cuenta la fórmula del área de un círculo a = pi X r X r. Para el valor
       de PI, utilizar 3.141592653*/

        final double PI = 3.141592653; //final significa que la variable es constante

        String frase1 = JOptionPane.showInputDialog("Ingrese el radio de la circunferencia:");
        double radio = Double.parseDouble(frase1);

        double area = PI * Math.pow(radio, 2);
        double volumen = (4.0 / 3.0) * PI * Math.pow(radio, 3);

        JOptionPane.showMessageDialog(null, "El área de la circunferencia es: " + area);
        JOptionPane.showMessageDialog(null, "El volumen de la esfera con radio igual al de la circunferencia es: " + volumen);
    }
}