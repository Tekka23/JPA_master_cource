package com.tekka.jpa_master_cource.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Table(name = "course")
@Entity(name = "Course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "course_id_sequence")
    @SequenceGenerator(name = "course_id_sequence",
            sequenceName = "course_id_sequence")
    private Long id;
    @Column(nullable = false,
            columnDefinition = "TEXT")
    private String name;

    @Column(name = "department",
           nullable = false,
            columnDefinition = "TEXT")
    private String department;

    @OneToMany( mappedBy = "course",
                cascade = {CascadeType.PERSIST, CascadeType.REMOVE})
    private List<Enrollment> enrollments = new ArrayList<>();

}
