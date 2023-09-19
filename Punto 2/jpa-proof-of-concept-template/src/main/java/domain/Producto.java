package domain;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@DiscriminatorColumn(name="tipo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Producto {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "marca")
    private String marca;

    @Column(name = "nombre")
    private String nombre;

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract Double precio();
    public abstract Integer stock();
}
