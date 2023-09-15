package CalculoArea;

public class Main 
{
    public static void main(String[] args)
    {
        Circulo circulo = new Circulo();
        circulo.area = 2;
        circulo.circuferencia = 4;
        circulo.diametro = 7;
        circulo.raio = 3.5;
        circulo.calcularArea();
        circulo.calcularPerimetro();

        System.out.println("------------------------------");

        Quadrado quadrado = new Quadrado();
        quadrado.area = 4;
        quadrado.lado = 2;
        quadrado.perimetro = 7;
        quadrado.calculoArea();
        quadrado.calculoPerimetro();

        System.out.println("------------------------------");

        Retangulo retangulo = new Retangulo();
        retangulo.area = 2;
        retangulo.comprimento = 7;
        retangulo.largura = 10;
        retangulo.perimetro = 12;
        retangulo.calculoArea();
        retangulo.calculoPerimetro();

        System.out.println("------------------------------");

        Triangulo triangulo = new Triangulo();
        triangulo.altura = 4;
        triangulo.area = 7;
        triangulo.base = 2;
        triangulo.lado1 = 2;
        triangulo.lado2 = 2;
        triangulo.lado3 = 2;
        triangulo.perimetro = 8;
        triangulo.calculoArea();
        triangulo.calculoPerimetro();
    }    
}
