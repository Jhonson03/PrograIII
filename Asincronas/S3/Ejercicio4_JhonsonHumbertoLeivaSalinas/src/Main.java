import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que calcule el perímetro y área de un rectángulo, pidiendo los
        valores de los lados. La formula del perimetro es P=2*L + 2*W, la fórmula del área es
        A=L*W, donde L y W son los lados del rectángulo.*/

        String frase1 = JOptionPane.showInputDialog("Ingrese el primer lado del rectángulo:");
        double lado1 = Double.parseDouble(frase1);

        String frase2 = JOptionPane.showInputDialog("Ingrese el segundo lado del rectángulo:");
        double lado2 = Double.parseDouble(frase2);

        double perimetro = 2 * (lado1 + lado2);
        double area = lado1 * lado2;

        JOptionPane.showMessageDialog(null, "El perímetro del rectángulo es: " + perimetro);
        JOptionPane.showMessageDialog(null, "El área del rectángulo es: " + area);
    }
}