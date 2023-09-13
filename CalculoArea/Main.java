import java.util.Scanner;

// Classe para o círculo
class Circulo {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

// Classe para o quadrado
class Quadrado {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularArea() {
        return lado * lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}

// Classe para o retângulo
class Retangulo {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}

// Classe para o triângulo
class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double calcularArea() {
        return 0.5 * base * altura;
    }

    public double calcularPerimetro() {
        // Triângulo não tem um perímetro fixo, então retornamos NaN (Not-a-Number).
        return Double.NaN;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha a operação (1 para área, 2 para perímetro):");
        int operacao = scanner.nextInt();

        if (operacao != 1 && operacao != 2) {
            System.out.println("Operação inválida. Encerrando o programa.");
            return;
        }

        System.out.println("Escolha a figura geométrica (1 para círculo, 2 para quadrado, 3 para retângulo, 4 para triângulo):");
        int figura = scanner.nextInt();

        double resultado = 0.0;

        switch (figura) {
            case 1:
                System.out.print("Digite o raio do círculo: ");
                double raio = scanner.nextDouble();
                Circulo circulo = new Circulo(raio);
                resultado = (operacao == 1) ? circulo.calcularArea() : circulo.calcularPerimetro();
                System.out.println("Círculo:");
                break;
            case 2:
                System.out.print("Digite o lado do quadrado: ");
                double ladoQuadrado = scanner.nextDouble();
                Quadrado quadrado = new Quadrado(ladoQuadrado);
                resultado = (operacao == 1) ? quadrado.calcularArea() : quadrado.calcularPerimetro();
                System.out.println("Quadrado:");
                break;
            case 3:
                System.out.print("Digite o comprimento do retângulo: ");
                double comprimento = scanner.nextDouble();
                System.out.print("Digite a largura do retângulo: ");
                double largura = scanner.nextDouble();
                Retangulo retangulo = new Retangulo(comprimento, largura);
                resultado = (operacao == 1) ? retangulo.calcularArea() : retangulo.calcularPerimetro();
                System.out.println("Retângulo:");
                break;
            case 4:
                System.out.print("Digite a base do triângulo: ");
                double baseTriangulo = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                double alturaTriangulo = scanner.nextDouble();
                Triangulo triangulo = new Triangulo(baseTriangulo, alturaTriangulo);
                resultado = (operacao == 1) ? triangulo.calcularArea() : triangulo.calcularPerimetro();
                System.out.println("Triângulo:");
                break;
            default:
                System.out.println("Figura geométrica inválida. Encerrando o programa.");
                return;
        }

        String operacaoNome = (operacao == 1) ? "Área" : "Perímetro";
        System.out.println(operacaoNome + ": " + resultado);
    }
}