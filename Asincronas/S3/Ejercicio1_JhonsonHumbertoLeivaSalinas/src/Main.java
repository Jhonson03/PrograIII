import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Escribir un programa que permita ingresar una palabra y un número, e imprima la
palabra el número de veces ingresado.*/


        String frase = JOptionPane.showInputDialog("Ingrese la palabra que desea que se repita");
        String palabra = JOptionPane.showInputDialog("Ingrese el numero de veces que \nquiere que se repita la palabra");

        int num = Integer.parseInt(palabra);

        for (int i = 0; i < num; i++){
            JOptionPane.showMessageDialog(null, frase);
        }
    }
}