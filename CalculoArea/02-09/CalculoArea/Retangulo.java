package CalculoArea;

public class Retangulo 
{
    double area;
    double comprimento;
    double largura;
    double perimetro;
    
    public void calculoArea()
    {
        area = comprimento * largura;
        System.out.printf("A area do retangulo é %f.2\n", area);
    }

    public void calculoPerimetro()
    {
        perimetro = 2 * (comprimento + largura);
        System.out.printf("O perimetro do retangulo é %f.2\n", perimetro);
    }
}
