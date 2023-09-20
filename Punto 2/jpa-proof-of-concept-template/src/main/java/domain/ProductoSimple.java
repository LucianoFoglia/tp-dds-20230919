package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@DiscriminatorValue("producto_simple")
@Setter
@Getter
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
}