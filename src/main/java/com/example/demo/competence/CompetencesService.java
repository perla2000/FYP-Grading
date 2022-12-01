//package com.example.demo.student;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.transaction.Transactional;
//import java.util.List;
//import java.util.Objects;
//import java.util.Optional;
//
//@Service //@Component   //to use Autowired @Service or @Component are the same thing
//public class StudentService {
//    @Autowired
//    private final StudentRepository studentRepository;
//
//    public StudentService(StudentRepository studentRepository) {
//        this.studentRepository = studentRepository;
//    }
//
//    public List<Student> getStudents(){
//            return studentRepository.findAll(); // implemented in the JPARepository
//    }
//    public Optional<Student> getStudent(Long studentId){
//        Optional<Student> student = studentRepository.findById(studentId);
//        if (!student.isPresent()) {
//            throw new IllegalStateException("Student with the Id \""+studentId+"\" was not found");
//
//        }
//        return student;
//    }
//
//    public void addNewStudent(Student student) {
//        Optional<Student> studentByEmail = studentRepository.findStudentByEmail (student. getEmail());
//        if (studentByEmail.isPresent()) {
//            throw new IllegalStateException("email taken");
//
//        }
//        studentRepository.save(student) ;
//
//
//    }
//
//    public void deleteStudent(Long studentId) {
//        boolean exists=studentRepository.existsById(studentId);
//        if(!exists) {
//            throw new IllegalStateException(
//                    "student with id " + studentId + " does not exist");
//        }
//        studentRepository.deleteById(studentId) ;
//
//    }
//
//
//
//    @Transactional
//    public void updateStudent(Long studentId,
//                              String firstName,
//                              String LastName,
//                              String email) {
//        Student student = studentRepository.findById(studentId)
//                .orElseThrow(() -> new IllegalStateException(
//                        "student with id " + studentId + " does not exist"));
//
//        if (firstName != null && firstName.length() > 0 && !Objects.equals(student.getFirstName(), firstName) &&
//                LastName != null && LastName.length() > 0 && !Objects.equals(student.getLastName(), LastName)) {
//
//            student.setFirstName(firstName);
//            student.setLastName(LastName);
//
//            if (email != null &&
//                    email.length() > 0 &&
//                    !Objects.equals(student.getEmail(), email)) {
//                Optional<Student> studentOptional = studentRepository
//                        .findStudentByEmail(email);
//                if (studentOptional.isPresent()) {
//                    throw new IllegalStateException("email taken");
//                }
//                student.setEmail(email);
//
//            }
//        }
//    }
//}
