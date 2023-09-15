package CalculoArea;

public class Circulo
{
    final double pi = 3.14159;
    double raio;
    double area;
    double circuferencia;
    double diametro;

    public void calcularArea()
    {
        area = pi * raio * raio;
        System.out.printf("A area do circulo é %f.2\n", area);
    }

    public void calcularPerimetro()
    {
        circuferencia = pi * diametro;
        System.out.printf("O perimetro do circulo é %f.2\n", circuferencia);
    }
}