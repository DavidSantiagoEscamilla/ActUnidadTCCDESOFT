package co.edu.udec.restaurante.domain;

import co.edu.udec.restaurante.domain.model.MenuItem;
import co.edu.udec.restaurante.domain.model.Pedido;
import co.edu.udec.restaurante.domain.model.Cliente;
import co.edu.udec.restaurante.domain.model.Mesa;
import co.edu.udec.restaurante.domain.valueobjects.Money;
import co.edu.udec.restaurante.domain.valueobjects.MenuItemId;
import co.edu.udec.restaurante.domain.valueobjects.PedidoId;
import co.edu.udec.restaurante.domain.valueobjects.ClienteId;
import co.edu.udec.restaurante.domain.valueobjects.MesaId;
import co.edu.udec.restaurante.domain.services.CalculoPropinaService;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

class CalculoPropinaServiceTest {

    @Test
    void debeCalcularPropinaCorrectamente() {
        var cliente = new Cliente(ClienteId.generate(), "Juan");
        var mesa = new Mesa(MesaId.generate(), 5);
        var item = new MenuItem(MenuItemId.generate(), "Pizza", new Money(50000, "COP"));
        var pedido = new Pedido(PedidoId.generate(), cliente, mesa, List.of(item));
        var service = new CalculoPropinaService();
        var propina = service.calcularPropina(pedido, 10);
        assertThat(propina.amount()).isEqualTo(5000);
    }
}
