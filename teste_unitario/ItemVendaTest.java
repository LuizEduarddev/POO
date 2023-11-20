import static org.junit.Assert.*;
import org.junit.Test;

public class ItemVendaTest {

    @Test
    public void testCalcularValorTotalItem() {
        // Arrange
        ItemVenda item = new ItemVenda("Produto1", 20.0, 2.0);

        // Act
        double valorTotal = item.calcularValorTotalItem();

        // Assert
        assertEquals(20.0 * 2.0, valorTotal, 0.01);
    }

    @Test
    public void testCriarItemVenda() {
        // Act
        ItemVenda item = new ItemVenda("Produto1", 20.0, 2.0);

        // Assert
        assertEquals("Produto1", item.getDescricao());
        assertEquals(20.0, item.getValorUnitario(), 0.01);
        assertEquals(2.0, item.getQuantidade(), 0.01);
    }
}