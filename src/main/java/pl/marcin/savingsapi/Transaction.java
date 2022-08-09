package pl.marcin.savingsapi;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import javax.persistence.*;
import java.time.LocalDate;



@Data
@Entity
@Table(name = "TRANSACTION")
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated
    private TransactionType transactionType;
    @NotNull
    private double amount;
    @DateTimeFormat(pattern = "dd.MM.yyyy")
    private LocalDate date;
    @ManyToOne
    @JoinColumn(name="category_id", nullable = false)
    private Category category;
    private String description;
}
