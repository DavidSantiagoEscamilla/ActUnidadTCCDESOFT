package co.edu.udec.restaurante.domain.valueobjects;

import java.util.UUID;

public record MesaId(String value) {
    public MesaId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("MesaId no puede estar vacío");
        }
    }
    public static MesaId generate() {
        return new MesaId(UUID.randomUUID().toString());
    }
}
