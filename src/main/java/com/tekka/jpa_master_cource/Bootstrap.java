package com.tekka.jpa_master_cource;

import com.tekka.jpa_master_cource.model.Student;
import com.tekka.jpa_master_cource.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Bootstrap implements CommandLineRunner {

    private final StudentRepository repository;
    @Override
    public void run(String... args) throws Exception {
        loadUsers();
    }
    void loadUsers(){
        Student student = new Student();
        Student student1 = new Student();
        repository.save(student);
        repository.save(student1);

        List<Student> studentList = repository.findAll();

        for (Student s : studentList)
            System.out.println(s.getId());

    }
}
