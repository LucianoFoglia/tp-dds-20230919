package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("packaging")
public class Packaging extends Decorado {
    @Column(name = "precio")
    private Double precio;

    public Packaging(Producto producto, Double precio) {
        super(producto);
        this.precio = precio;
    }

    public Packaging() {
        super();
    }

    @Override
    public Double precio() {
        return super.producto.precio() + this.precio;
    }
}
