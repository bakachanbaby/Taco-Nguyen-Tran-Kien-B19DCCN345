package tacos;

import com.sun.istack.NotNull;
import lombok.Data;


import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@Entity
public class Taco {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @NotNull
    private String name;
    private Date createdAt;
    @ManyToMany(targetEntity= tacos.Ingredient.class)
    private List<tacos.Ingredient> ingredients;
    @PrePersist
    void createdAt() {
        this.createdAt = new Date();
    }
}