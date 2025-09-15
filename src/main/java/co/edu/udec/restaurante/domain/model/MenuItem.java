package co.edu.udec.restaurante.domain.model;

import co.edu.udec.restaurante.domain.valueobjects.MenuItemId;
import co.edu.udec.restaurante.domain.valueobjects.Money;

public class MenuItem {
    private final MenuItemId id;
    private final String nombre;
    private final Money precio;

    public MenuItem(MenuItemId id, String nombre, Money precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public MenuItemId getId() { return id; }
    public double getPrecio() { return precio.amount(); }
    public String getNombre() { return nombre; }
}
