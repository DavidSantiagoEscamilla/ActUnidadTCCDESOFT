package co.edu.udec.restaurante.domain.valueobjects;

import java.util.UUID;

public record MenuItemId(String value) {
    public MenuItemId {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("MenuItemId no puede estar vacío");
        }
    }
    public static MenuItemId generate() {
        return new MenuItemId(UUID.randomUUID().toString());
    }
}
