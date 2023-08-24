package br.com.tddjava.tddjava.modules.courses.services;

import org.springframework.beans.factory.annotation.Autowired;
import br.com.tddjava.tddjava.modules.courses.entities.Course;
import br.com.tddjava.tddjava.modules.courses.repositories.CourseJPARepository;

public class CreateCourseService {

    @Autowired
    private CourseJPARepository repository;


    public Course execute (Course course) {

        // Validar sí el curso existe por el nombre

        Course existedCourse = repository.findByName(course.getName());

        // Si existe - retorna error

        if (existedCourse != null) {

            throw new Error("Curso ya existe!");
            
        }

        // Si no - Salvar y retorna nuevo curso
        return repository.save(course);

    }

}
