import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.yaml.snakeyaml.Yaml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class VeiculoEletrico {
    private String modelo;
    private String marca;
    private int autonomia;
    private int velocidadeMaxima;
    private double precoSugerido;

    // Construtor e métodos getters/setters

    // Getters e setters
    // ...

    @Override
    public String toString() {
        return "VeiculoEletrico{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", autonomia=" + autonomia +
                ", velocidadeMaxima=" + velocidadeMaxima +
                ", precoSugerido=" + precoSugerido +
                '}';
    }
}

class UnidadeFederativa {
    private String nome;
    private String sigla;
    private String capital;
    private String coordenadasGeograficas;
    private long populacaoUltimoSenso;
    private double area;
    private double densidade;
    private List<String> tresMaioresCidades;

    // Construtor e métodos getters/setters

    // Getters e setters
    // ...

    @Override
    public String toString() {
        return "UnidadeFederativa{" +
                "nome='" + nome + '\'' +
                ", sigla='" + sigla + '\'' +
                ", capital='" + capital + '\'' +
                ", coordenadasGeograficas='" + coordenadasGeograficas + '\'' +
                ", populacaoUltimoSenso=" + populacaoUltimoSenso +
                ", area=" + area +
                ", densidade=" + densidade +
                ", tresMaioresCidades=" + tresMaioresCidades +
                '}';
    }
}

public class Main {
    public static void main(String[] args) {
        // Criação de objetos para teste
        VeiculoEletrico veiculo = new VeiculoEletrico();
        veiculo.setModelo("Model S");
        veiculo.setMarca("Tesla");
        veiculo.setAutonomia(600);
        veiculo.setVelocidadeMaxima(250);
        veiculo.setPrecoSugerido(80000.0);

        UnidadeFederativa uf = new UnidadeFederativa();
        uf.setNome("São Paulo");
        uf.setSigla("SP");
        uf.setCapital("São Paulo");
        uf.setCoordenadasGeograficas("23.5505° S, 46.6333° W");
        uf.setPopulacaoUltimoSenso(46131758);
        uf.setArea(248222.962);
        uf.setDensidade(185.81);
        List<String> cidades = new ArrayList<>();
        cidades.add("São Paulo");
        cidades.add("Campinas");
        cidades.add("Guarulhos");
        uf.setTresMaioresCidades(cidades);

        // Solicita ao usuário o formato desejado
        String formato = "XML"; // Mude para o formato desejado (XML, JSON ou YAML)

        // Converte o objeto para o formato escolhido
        String resultado = formatarInformacao(veiculo, uf, formato);

        // Exibe o resultado no terminal
        System.out.println(resultado);
    }

    public static String formatarInformacao(VeiculoEletrico veiculo, UnidadeFederativa uf, String formato) {
        switch (formato) {
            case "XML":
                return formatarParaXML(veiculo, uf);
            case "JSON":
                return formatarParaJSON(veiculo, uf);
            case "YAML":
                return formatarParaYAML(veiculo, uf);
            default:
                return "Formato não suportado.";
        }
    }

    public static String formatarParaXML(VeiculoEletrico veiculo, UnidadeFederativa uf) {
        XmlMapper xmlMapper = new XmlMapper();
        try {
            String veiculoXML = xmlMapper.writeValueAsString(veiculo);
            String ufXML = xmlMapper.writeValueAsString(uf);
            return veiculoXML + "\n" + ufXML;
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao formatar para XML.";
        }
    }

    public static String formatarParaJSON(VeiculoEletrico veiculo, UnidadeFederativa uf) {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            String veiculoJSON = objectMapper.writeValueAsString(veiculo);
            String ufJSON = objectMapper.writeValueAsString(uf);
            return veiculoJSON + "\n" + ufJSON;
        } catch (IOException e) {
            e.printStackTrace();
            return "Erro ao formatar para JSON.";
        }
    }

    public static String formatarParaYAML(VeiculoEletrico veiculo, UnidadeFederativa uf) {
        Yaml yaml = new Yaml();
        String veiculoYAML = yaml.dump(veiculo);
        String ufYAML = yaml.dump(uf);
        return veiculoYAML + "\n" + ufYAML;
    }
}