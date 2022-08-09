package pl.marcin.savingsapi;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@Entity
@Table(name = "CATEGORY")
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @OneToMany(mappedBy="category")
    private List<Transaction> referringTransactions;
}
