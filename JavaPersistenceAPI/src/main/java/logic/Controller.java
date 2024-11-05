package logic;

import java.util.ArrayList;
import persistence.PersistenceController;

public class Controller {

    PersistenceController persisController = new PersistenceController();

    public void createStudent(Student student) {
        persisController.createStudent(student);
    }

    public void deleteStudent(int id) {
        persisController.deleteStudent(id);
    }

    public void editStudent(Student student) {
        persisController.editStudent(student);
    }

    public Student findStudent(int id) {
        return persisController.findStudent(id);
    }

    public ArrayList<Student> getListStudents() {
        return persisController.getListStudents();
    }

    public void createCareer(Career career) {
        persisController.createCareer(career);
    }

    public void deleteCareer(int id) {
        persisController.deleteCareer(id);
    }

    public void editCareer(Career career) {
        persisController.editCareer(career);
    }

    public Career findCareer(int id) {
        return persisController.findCareer(id);
    }

    public ArrayList<Career> getListCareer() {
        return persisController.getListCareer();
    }

}
