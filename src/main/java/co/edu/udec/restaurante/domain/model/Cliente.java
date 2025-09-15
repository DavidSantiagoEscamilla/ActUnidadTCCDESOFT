package co.edu.udec.restaurante.domain.model;

import co.edu.udec.restaurante.domain.valueobjects.ClienteId;

public class Cliente {
    private final ClienteId id;
    private final String nombre;

    public Cliente(ClienteId id, String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del cliente no puede estar vacío");
        }
        this.id = id;
        this.nombre = nombre;
    }

    public ClienteId getId() { return id; }
    public String getNombre() { return nombre; }
}
