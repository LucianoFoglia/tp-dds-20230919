package domain;

import javax.persistence.Entity;

@Entity
public abstract class Decorado extends Producto{

    Long id;
    protected Producto producto;

    public Decorado(Producto producto){
        this.producto = producto;
    }

    @Override
    public Integer stock(){
        return this.producto.stock();
    }
}
