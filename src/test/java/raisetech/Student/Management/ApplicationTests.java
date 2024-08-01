package raisetech.Student.Management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@SpringBootApplication
@RestController
class ApplicationTests {

    @Autowired
    private StudentRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @GetMapping("/student")
    public List<Student> getStudentList() {
        return repository.search();
    }

    //@PostMapping("/student")
    //public void registerStudent(String name, int age) {

      //  repository.registerStudent(name, age);
    //}

   //@PatchMapping("/student")
    //public void updateStudentName(String name,int age){
 //repository.updateStudent(name, age);
   //}

//@DeleteMapping("/student")
  //  public void deleteStudent(String name) {
    //    repository.deleteStudent(name);
//}
}
