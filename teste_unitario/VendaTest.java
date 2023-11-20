import static org.junit.Assert.*;
import org.junit.Test;
import java.util.ArrayList;
import java.util.List;

public class VendaTest {

    @Test
    public void testCalcularValorTotalSemDesconto() {
        // Arrange
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto1", 20.0, 2.0));
        itens.add(new ItemVenda("Produto2", 30.0, 3.0));
        Venda venda = new Venda("Cliente1", itens, 0.0);

        // Act
        double valorTotal = venda.calcularValorTotal();

        // Assert
        assertEquals(2 * 20.0 + 3 * 30.0, valorTotal, 0.01);
    }

    @Test
    public void testCalcularValorTotalComDesconto() {
        // Arrange
        List<ItemVenda> itens = new ArrayList<>();
        itens.add(new ItemVenda("Produto1", 20.0, 2.0));
        itens.add(new ItemVenda("Produto2", 30.0, 3.0));
        Venda venda = new Venda("Cliente1", itens, 10.0);

        // Act
        double valorTotal = venda.calcularValorTotal();

        // Assert
        assertEquals((2 * 20.0 + 3 * 30.0) * 0.9, valorTotal, 0.01);
    }

    @Test
    public void testAdicionarItemVenda() {
        // Arrange
        List<ItemVenda> itens = new ArrayList<>();
        Venda venda = new Venda("Cliente1", itens, 0.0);

        // Act
        venda.adicionarItemVenda(new ItemVenda("Produto1", 20.0, 2.0));
        venda.adicionarItemVenda(new ItemVenda("Produto2", 30.0, 3.0));

        // Assert
        assertEquals(2, venda.getItens().size());
        assertEquals("Produto1", venda.getItens().get(0).getDescricao());
        assertEquals("Produto2", venda.getItens().get(1).getDescricao());
    }
}