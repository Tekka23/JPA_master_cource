package com.tekka.jpa_master_cource.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity(name = "Book")
@Table(name = "book")
@Getter
@Setter
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
    generator = "book_id_sequence")
    @SequenceGenerator(name = "book_id_sequence",
                       sequenceName = "book_id_sequence")
    private Long id;
    @ManyToOne
    @JoinColumn(name = "student_id",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "book_id_student_id_fk"))
    private Student student;
    @Column(nullable = false)
    private String name;
    @Column(name = "created_at",
            updatable = false,
            nullable = false,
            columnDefinition = "TIMESTAMP WITHOUT TIME ZONE")
    private LocalDateTime createdAt;
}
