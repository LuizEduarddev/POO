import java.util.Scanner;

// Classe base para representar uma operação comercial
class OperacaoComercial {
    private String tipo;
    private double valor;

    public OperacaoComercial(String tipo, double valor) {
        this.tipo = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String toString() {
        return "Tipo: " + tipo + "\nValor: R$" + valor;
    }
}

// Classe para calcular o ISS
class ISS {
    private static final double ALIQUOTA = 0.046;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}

// Classe para calcular o ICMS
class ICMS {
    private static final double ALIQUOTA = 0.17;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}

// Classe para calcular o IPI
class IPI {
    private static final double ALIQUOTA = 0.25;

    public static double calcularImposto(double valor) {
        return valor * ALIQUOTA;
    }
}

public class CalculadoraImpostos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha o tipo de serviço:");
        System.out.println("1 - Produto");
        System.out.println("2 - Produtos e Serviços");
        System.out.println("3 - Serviços");

        int escolha = scanner.nextInt();
        scanner.nextLine(); // Limpar a quebra de linha

        double valorOperacao;
        String tipoOperacao;

        switch (escolha) {
            case 1:
                valorOperacao = 100.0; // Valor do produto
                tipoOperacao = "Produto";
                break;
            case 2:
                valorOperacao = 200.0; // Valor de produtos e serviços
                tipoOperacao = "Produtos e Serviços";
                break;
            case 3:
                valorOperacao = 150.0; // Valor do serviço
                tipoOperacao = "Serviço";
                break;
            default:
                System.out.println("Escolha inválida.");
                return;
        }

        // Cálculo de impostos
        double imposto;

        if (escolha == 1 || escolha == 2) {
            imposto = ICMS.calcularImposto(valorOperacao);
        } else {
            imposto = ISS.calcularImposto(valorOperacao);
        }

        // Resultados
        System.out.println("Detalhes da Operação:");
        System.out.println("Tipo: " + tipoOperacao);
        System.out.println("Valor Original: R$" + valorOperacao);

        if (escolha == 1 || escolha == 2) {
            System.out.println("ICMS: R$" + imposto);
        } else {
            System.out.println("ISS: R$" + imposto);
        }

        System.out.println("Total: R$" + (valorOperacao + imposto));

        scanner.close();
    }
}