package co.edu.udec.restaurante.domain.valueobjects;

public record Money(double amount, String currency) {
    public Money {
        if (amount < 0) throw new IllegalArgumentException("El monto no puede ser negativo");
        if (currency == null || currency.isBlank())
            throw new IllegalArgumentException("La moneda no puede estar vacía");
    }
}
