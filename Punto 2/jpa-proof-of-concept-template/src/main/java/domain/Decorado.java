package domain;

import javax.persistence.*;

// TODO: mapear Decorado y sus subclases
public abstract class Decorado extends Producto{

    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    @JoinColumn(name = "producto_decorado_id", referencedColumnName = "id")
    protected Producto producto;

    public Decorado(Producto producto){
        this.producto = producto;
    }

    public Decorado() {
        super();
    }

    @Override
    public Integer stock(){
        return this.producto.stock();
    }
}
