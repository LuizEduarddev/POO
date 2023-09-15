package CalculoArea;

public class Quadrado 
{
    double area;
    double lado;
    double perimetro;

    public void calculoArea()
    {
        area = lado * lado;
        System.out.printf("A area do quadrado é %f.2\n", area);
    }

    public void calculoPerimetro()
    {
        perimetro = lado * 4;
        System.out.printf("O perimetro do quadrado é %f.2\n", perimetro);
    }
}
