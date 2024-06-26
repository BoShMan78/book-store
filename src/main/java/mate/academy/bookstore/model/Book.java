package mate.academy.bookstore.model;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String author;
    @Column(nullable = false)
    private BigDecimal price;
    @Column(nullable = false, unique = true)
    private String isbn;
    private String description;
    private String coverImage;
}
