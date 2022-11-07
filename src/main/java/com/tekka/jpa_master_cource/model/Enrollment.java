package com.tekka.jpa_master_cource.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "Enrollment")
@Table(name = "enrollment")
public class Enrollment {

    @EmbeddedId
    private EnrollmentId enrollmentId;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name = "student_id",
                foreignKey = @ForeignKey(name = "enrollment_student_fk"))
    private Student student;
    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name = "course_id",
                foreignKey = @ForeignKey(name = "enrollment_course_fk"))
    private Course course;

    @Column(name = "created_at", nullable = false, insertable = false)
    private LocalDateTime createdAt;
}
