package com.tekka.jpa_master_cource.model;

import javax.persistence.*;

@Entity(name = "StudentCard")
@Table(name = "Student_card")
public class StudentCard {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_card_id_sequence"
    )
    @SequenceGenerator(
            name = "student_card_id_sequence",
            sequenceName = "student_card_id_sequence",
            allocationSize = 20)
    private Long id;

    @Column(name = "card_num",
            nullable = false,
            length = 15)
    private String cardNum;

    @OneToOne(
            cascade = {CascadeType.REMOVE, CascadeType.PERSIST})
    @JoinColumn(name = "student_id",
                referencedColumnName = "id",
                foreignKey = @ForeignKey(name = "student_id_card_student_id_fk"))
    private Student student;
}
