package sk.energodata.DataBridge;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class HelloWorldJob {

    @Autowired
    private BranchOneToManyTestRepository testRepository;

    @Scheduled(fixedRate = 60000)
    public void sayHelloWorld() {

    //    Iterable<Branch> list = testRepository.findAll();

        Branch branch = new Branch();
        branch.setBranchShortName("CSE");
        branch.setBranchName("Computer Science and Engineering");
        branch.setDescription("CSE department offers courses under ambitious curriculam in computer science and computer engineering..");
        Set<Student> students = new HashSet<>();
        students.add(getStudent1());
        students.add(getStudent2());
        branch.setStudents(students);
        Branch createdBranch = testRepository.save(branch);
        System.err.println(createdBranch);

        System.out.println("Cau Mirko!");
    }

    private static Student getStudent1() {
        Student student = new Student();
        student.setFirstName("Rosy");
        student.setLastName("Larsen");
        student.setContactNo("+1-408-575-1317");
        return student;
    }
    private static Student getStudent2() {
        Student student = new Student();
        student.setFirstName("Rosy");
        student.setLastName("Larsen");
        student.setContactNo("+1-408-575-1219");
        return student;
    }
}