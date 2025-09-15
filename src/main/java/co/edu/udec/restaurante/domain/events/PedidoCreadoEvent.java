package co.edu.udec.restaurante.domain.events;

import java.time.Instant;

public record PedidoCreadoEvent(String pedidoId, Instant fecha, String clienteNombre) {}
