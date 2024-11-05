package persistence;

import java.util.ArrayList;
import java.util.List;
import logic.Career;
import logic.Student;

public class PersistenceController {

    StudentJpaController studentJpa = new StudentJpaController();
    CareerJpaController careerJpa = new CareerJpaController();

    public void createStudent(Student student) {
        studentJpa.create(student);
    }

    public void deleteStudent(int id) {
        studentJpa.destroy(id);
    }

    public void editStudent(Student student) {
        studentJpa.update(student);
    }

    public Student findStudent(int id) {
        return studentJpa.findStudent(id);
    }

    public ArrayList<Student> getListStudents() {
        List<Student> list = studentJpa.findAllStudents();
        ArrayList<Student> listStudents = new ArrayList<Student>(list);

        return listStudents;
    }

    public void createCareer(Career career) {
        careerJpa.create(career);
    }

    public void deleteCareer(int id) {
        try {
            careerJpa.destroy(id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void editCareer(Career career) {
        try {
            careerJpa.update(career);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public Career findCareer(int id) {
        return careerJpa.findCareer(id);
    }

    public ArrayList<Career> getListCareer() {
        List<Career> list = careerJpa.findAllCareers();
        ArrayList<Career> listCareers = new ArrayList<Career>(list);

        return listCareers;
    }

}
