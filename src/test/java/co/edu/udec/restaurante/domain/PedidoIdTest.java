package co.edu.udec.restaurante.domain;

import co.edu.udec.restaurante.domain.valueobjects.PedidoId;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PedidoIdTest {

    @Test
    void debeCrearPedidoIdValido() {
        var id = PedidoId.generate();
        assertThat(id.value()).isNotBlank();
    }

    @Test
    void debeFallarConValorNulo() {
        assertThatThrownBy(() -> new PedidoId(null))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
