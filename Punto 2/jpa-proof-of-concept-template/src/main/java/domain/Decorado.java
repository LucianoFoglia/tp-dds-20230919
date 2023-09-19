package domain;

import javax.persistence.*;

// TODO: mapear Decorado y sus subclases
@Entity
@DiscriminatorValue("producto_simple")
public abstract class Decorado extends Producto{

    @Id
    @GeneratedValue
    private Long id;
    protected Producto producto;

    public Decorado(Producto producto){
        this.producto = producto;
    }

    @Override
    public Integer stock(){
        return this.producto.stock();
    }
}
