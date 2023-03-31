package co.develhope.Email01.services;

import co.develhope.Email01.entities.Student;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    /** Metto studenti finti dato che la repository viene esposta su GitHub **/
    static List<Student> students = Arrays.asList(
            new Student("1","Lelle","Lelli","lello123@gmail.com"),
            new Student("2","Memo","Memi","lello123@gmail.com"),
            new Student("3","Giuan","Verdi","lello123@gmail.com"),
            new Student("4","Annarita","Gialli","lello123@gmail.com")
    );

    public Student getStudentById(String studentId) {
        Optional<Student> studentFromDb = students.stream().filter(student -> student.getId().equals(studentId)).findAny();
        if(studentFromDb.isPresent()){
            return studentFromDb.get();
        } else {
            return null;
        }
    }
}
