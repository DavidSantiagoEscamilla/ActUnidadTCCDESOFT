package co.edu.udec.restaurante.domain.valueobjects;

import java.util.UUID;

public record PedidoId(String value) {
    public PedidoId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("PedidoId no puede estar vacío");
        }
    }
    public static PedidoId generate() {
        return new PedidoId(UUID.randomUUID().toString());
    }
}
