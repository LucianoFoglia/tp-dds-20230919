package domain;

import javax.persistence.*;

@Entity
@DiscriminatorValue("producto_simple")
public class ProductoSimple extends Producto {

    @Column(name = "precio")
    private Double precio;

    @Column(name = "stock")
    private Integer stock;

    @Override
    public Double precio() {
        return this.precio;
    }

    @Override
    public Integer stock() {
        return this.stock;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }
}