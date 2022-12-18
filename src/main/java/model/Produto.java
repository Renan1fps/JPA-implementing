package model;

import javax.persistence.*;
import java.math.BigDecimal;

// @Entity = Minha entidade que será mapeada para o tabela no banco de daoos
// @Table(name = "tb_products") = Apenas falando que a tabela do banco é a que passei no name
@Entity
@Table(name = "tb_products")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "str_name")
    private String name;
    @Column(name = "str_description")
    private String description;
    @Column(name = "int_prince")
    private BigDecimal price;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
