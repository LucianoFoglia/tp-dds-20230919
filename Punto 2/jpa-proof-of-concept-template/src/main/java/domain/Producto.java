package domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "producto")
@DiscriminatorColumn(name="tipo")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Getter
@Setter
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

    public abstract Double precio();
    public abstract Integer stock();
}
