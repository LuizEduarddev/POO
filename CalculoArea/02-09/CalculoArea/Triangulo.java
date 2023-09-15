package CalculoArea;

public class Triangulo 
{
    double area;
    double base;
    double altura;
    double perimetro;
    double lado1;
    double lado2;
    double lado3;

    public void calculoArea()
    {
        area = (base * altura) / 2;
        System.out.printf("A area do triangulo é %f.2\n", area);
    }

    public void calculoPerimetro()
    {
        perimetro = lado1 + lado2 + lado3;
        System.out.printf("O perimetro do triangulo é %f.2\n", perimetro); 
    }
}
