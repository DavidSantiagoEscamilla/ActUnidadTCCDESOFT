package co.edu.udec.restaurante.domain.valueobjects;

import java.util.UUID;

public record ClienteId(String value) {
    public ClienteId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("ClienteId no puede estar vacío");
        }
    }
    public static ClienteId generate() {
        return new ClienteId(UUID.randomUUID().toString());
    }
}
