package co.edu.udec.restaurante.domain.services;

import co.edu.udec.restaurante.domain.model.Pedido;
import co.edu.udec.restaurante.domain.model.MenuItem;
import co.edu.udec.restaurante.domain.valueobjects.Money;

public class CalculoPropinaService {
    public Money calcularPropina(Pedido pedido, double porcentaje) {
        double total = pedido.getItems().stream()
                .mapToDouble(MenuItem::getPrecio)
                .sum();
        return new Money(total * porcentaje / 100, "COP");
    }
}
