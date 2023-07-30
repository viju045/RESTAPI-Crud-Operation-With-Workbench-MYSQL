/**
 * Created By VijayKumar Moohite
 * Date : 7/30/2023
 * Time : 3:55 PM
 * Project : RESTAPI-Crud-Operation
 **/

package org.mahagan.controller;

import org.mahagan.domain.Student;
import org.mahagan.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//To build REST API in a declarative way.
@RequestMapping("students")//to map web requests onto specific handler classes and/or handler methods.
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    // retrieve all student from database
    @GetMapping("all")
    public List<Student> getAllStudent()
    {
        List<Student> student=(List<Student>) studentRepository.findAll();
        return student;
    }

    // insert new student into database
    @PostMapping("add")
    /*@RequestBod deserialize a request body into an object. This object is passed as a parameter in the handler method. */
    public Student addStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    // get particular student by their ID
    @GetMapping("student/{id}")
    /* @PathVariable annotation is used to extract the value from the URI.
    It is most suitable for the RESTful web service where the URL contains some value.*/
    public Optional<Student> getStudentId(@PathVariable int id)
    {
        return studentRepository.findById(id);
    }

    // update existing student
    @PutMapping("update/{id}")
    public Student updateStudent(@RequestBody Student student)
    {
        return studentRepository.save(student);
    }

    //delete particular student from database
    @DeleteMapping("delete/{id}")
    public void deleteStudent(@PathVariable int id)
    {
        studentRepository.deleteById(id);
        System.out.println("Deleted record Successfully");
    }

}
