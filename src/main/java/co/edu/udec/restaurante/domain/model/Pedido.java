package co.edu.udec.restaurante.domain.model;

import co.edu.udec.restaurante.domain.valueobjects.PedidoId;
import co.edu.udec.restaurante.domain.enums.EstadoPedido;
import co.edu.udec.restaurante.domain.exceptions.PedidoException;
import java.util.List;

public class Pedido {
    private final PedidoId id;
    private final Cliente cliente;
    private final Mesa mesa;
    private List<MenuItem> items;
    private EstadoPedido estado;

    public Pedido(PedidoId id, Cliente cliente, Mesa mesa, List<MenuItem> items) {
        if (items == null || items.isEmpty())
            throw new PedidoException("El pedido debe contener al menos un ítem");
        this.id = id;
        this.cliente = cliente;
        this.mesa = mesa;
        this.items = items;
        this.estado = EstadoPedido.CREADO;
    }

    public void agregarItem(MenuItem item) {
        if (estado != EstadoPedido.CREADO)
            throw new PedidoException("No se pueden modificar pedidos en estado: " + estado);
        this.items.add(item);
    }

    public void cambiarEstado(EstadoPedido nuevoEstado) {
        this.estado = nuevoEstado;
    }

    public PedidoId getId() { return id; }
    public EstadoPedido getEstado() { return estado; }
    public List<MenuItem> getItems() { return items; }
}
