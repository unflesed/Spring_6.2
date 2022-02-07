package homework.persistence.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Counter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long controller_name;
    private int quantity;

}
