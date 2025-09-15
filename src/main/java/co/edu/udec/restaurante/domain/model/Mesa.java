package co.edu.udec.restaurante.domain.model;

import co.edu.udec.restaurante.domain.valueobjects.MesaId;

public class Mesa {
    private final MesaId id;
    private final int numero;

    public Mesa(MesaId id, int numero) {
        if (numero <= 0) {
            throw new IllegalArgumentException("El número de mesa debe ser positivo");
        }
        this.id = id;
        this.numero = numero;
    }

    public MesaId getId() { return id; }
    public int getNumero() { return numero; }
}
