package Udemy;

public class AreaTriangulo {
    public double a;
    public double b;
    public double c;

    double area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double perimetro() {
        return a + b + c;
    }
}