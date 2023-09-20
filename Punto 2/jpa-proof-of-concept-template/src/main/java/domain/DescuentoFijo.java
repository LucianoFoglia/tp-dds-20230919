package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("descuento_fijo")
public class DescuentoFijo extends Decorado {
    @Column(name = "valor")
    private Double valor;

    public DescuentoFijo(Producto producto, Double valor) {
        super(producto);
        this.valor = valor;
    }

    public DescuentoFijo() {
        super();
    }

    @Override
    public Double precio() {
        return super.producto.precio() - this.valor;
    }
}

