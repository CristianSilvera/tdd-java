package br.com.tddjava.tddjava.services;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import br.com.tddjava.tddjava.modules.courses.entities.Course;
import br.com.tddjava.tddjava.modules.courses.services.CreateCourseService;

public class CreateCourseServiceTest {

        @Test
        public void should_be_able_to_create_a_new_course() {
                // Crear un nuevo curso
                // Crear tabla curso (Entidad)
                // ID, description, name, workload

                Course course = new Course();
                course.setDescription("Curso_Description_Test");
                course.setName("Curso_Name");
                course.setWorkload(100);

                // Crear un nuevo service
                CreateCourseService createCourseService = new CreateCourseService();
                Course createdCourse = createCourseService.execute(course);

                // Crear un repositorio de curso

                assertNotNull(createdCourse.getId());

        }

}
