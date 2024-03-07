package cuadrado;

import javax.swing.JOptionPane;

/**
 *
 * @author jhons
 */
public class Cuadrado {
    
    private double lado;
    private double perimetro;
    private double area;
    
    public Cuadrado() {
        this.lado = 0;
        calcularPerimetro();
        calcularArea();
    }
    
    public Cuadrado(double lado) {
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }
    
    public Cuadrado(double lado1, double lado2) {
        this.lado = (lado1 + lado2) / 2; 
        calcularPerimetro();
        calcularArea();
    }
    
    private void calcularPerimetro() {
        this.perimetro = 4 * lado;
    }
    
    private void calcularArea() {
        this.area = lado * lado;
    }
    
    public double getLado() {
        return lado;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public double getArea() {
        return area;
    }
    
    public static void main(String[] args) {
        String Strlado = JOptionPane.showInputDialog("Ingrese el lado del cuadrado:");
        double lado = Double.parseDouble(Strlado);
        
        Cuadrado cuadrado = new Cuadrado(lado);
        JOptionPane.showMessageDialog(null, "Lado: " + cuadrado.getLado() +
                "\nPerímetro: " + cuadrado.getPerimetro() +
                "\nÁrea: " + cuadrado.getArea());
    }
}
