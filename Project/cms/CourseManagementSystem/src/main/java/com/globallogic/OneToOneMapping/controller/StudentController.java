package com.globallogic.OneToOneMapping.controller;

import com.globallogic.OneToOneMapping.modal.Course;
import com.globallogic.OneToOneMapping.modal.FinalProject;
import com.globallogic.OneToOneMapping.modal.Student;
import com.globallogic.OneToOneMapping.repo.CourseRepository;
import com.globallogic.OneToOneMapping.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    StudentRepository studentRepo;

    @Autowired
    CourseRepository courseRepository;

    @PostMapping("/students")
    public ResponseEntity<Student> addStudent(@RequestBody Student student){
        List<Course> courses = student.getCourses();
        List<Course> course = new ArrayList<>();
        for(Course c : courses){
            c.setStudent(student);
            course.add(c);
        }

        student.setCourses(course);
        studentRepo.save(student);
        System.out.println(2);
        //return student;
        return new ResponseEntity<>(student, HttpStatus.CREATED);
    }

    @GetMapping("/students/{studentId}")
    public ResponseEntity<Student> getStudentById(@PathVariable Integer studentId){
        return new ResponseEntity<>(studentRepo.findById(studentId).get(), HttpStatus.OK);
    }

    @GetMapping("/students")
    public ResponseEntity<List<Student>> getAllStudents(){
        return new ResponseEntity<>(studentRepo.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/students/{studentId}")
    public ResponseEntity<String> deleteStudentById(@PathVariable Integer studentId){
        studentRepo.deleteById(studentId);
        return new ResponseEntity<>("Student successfully deleted", HttpStatus.OK);
    }

    @PutMapping("/students/{studentId}")
    public ResponseEntity<Student> updateStudentById(@PathVariable Integer studentId, @RequestBody Student student ){

        Student existingStudent = studentRepo.findById(studentId).get();
        existingStudent.setStudentName(student.getStudentName());
        existingStudent.setCourse(student.getCourse());
        existingStudent.setStudentaddress(student.getStudentaddress());
        List<Course> existingCourses = courseRepository.findByStudent(existingStudent);
        List<Course> courses = student.getCourses();
        List<Course> updatedCourse = null;
        if(existingCourses.size()==courses.size()){
                updatedCourse = new ArrayList<>();
                int count=0;
                for(Course c: courses){
                    Course course = existingCourses.get(count);
                    course.setCourseName(c.getCourseName());
                    course.setCourseDuration(c.getCourseDuration());
                    course.setCourseFees(c.getCourseFees());
                    course.setStudent(existingStudent);
                    updatedCourse.add(course);
                    count++;
                }
        } else if(existingCourses.size()<courses.size()){
            updatedCourse = new ArrayList<>();
            int maxCount = existingCourses.size();
            System.out.println("IN LINE 81");
            System.out.println("MAX COUNT IS "+maxCount);
            int count=0;
            for(Course c: courses){
                if(count<maxCount){
                    System.out.println("COUNT IS "+count);
                    Course course = existingCourses.get(count);
                    course.setCourseName(c.getCourseName());
                    course.setCourseDuration(c.getCourseDuration());
                    course.setCourseFees(c.getCourseFees());
                    course.setStudent(existingStudent);
                    updatedCourse.add(course);
                    count++;
                } else {
                    Course course = new Course();
                    course.setCourseName(c.getCourseName());
                    course.setCourseDuration(c.getCourseDuration());
                    course.setCourseFees(c.getCourseFees());
                    course.setStudent(existingStudent);
                    updatedCourse.add(course);
                    System.out.println("SIZE IS "+updatedCourse.size());
                }
            }
        } else{
            updatedCourse = new ArrayList<>();
            int maxCount = existingCourses.size();
            System.out.println("MaxCount is "+maxCount);
            int count=0;
            for(Course c: courses){
                System.out.println("Count is "+count);
                Course course = existingCourses.get(count);
                course.setCourseName(c.getCourseName());
                course.setCourseDuration(c.getCourseDuration());
                course.setCourseFees(c.getCourseFees());
                course.setStudent(existingStudent);
                updatedCourse.add(course);
                System.out.println("New list size"+updatedCourse.size());
                count++;
            }
            while(maxCount>count){
                System.out.println("!22 count is :"+count);
                courseRepository.deleteById(existingCourses.get(count).getCourseId());
                count++;
            }
        }
        existingStudent.setCourses(updatedCourse);
        FinalProject p = existingStudent.getProject();
        FinalProject project = student.getProject();
        p.setProjectName(project.getProjectName());
        p.setDomain(project.getDomain());
        existingStudent.setProject(p);
        studentRepo.save(existingStudent);
        return new ResponseEntity<>(existingStudent, HttpStatus.ACCEPTED);
    }
}
