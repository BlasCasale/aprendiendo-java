package persistence;

import java.util.ArrayList;
import java.util.List;
import logic.Career;
import logic.Student;
import logic.Subject;

public class PersistenceController {

    StudentJpaController studentJpa = new StudentJpaController();
    CareerJpaController careerJpa = new CareerJpaController();
    SubjectJpaController subjectJpa = new SubjectJpaController();

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
            careerJpa.delete(id);
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

    public void createSubject(Subject subject) {
        subjectJpa.create(subject);
    }

    public Subject findSubject(int id) {
        return subjectJpa.findSubject(id);
    }
    
    public void deleteSubject(int id) {
        subjectJpa.delete(id);
    }
    
    public void editSubject (Subject subject) {
        subjectJpa.update(subject);
    }

    public ArrayList<Subject> getListSubjects() {
        List<Subject> list = subjectJpa.findAllSubjects();
        ArrayList<Subject> listSubjects = new ArrayList<Subject>(list);

        return listSubjects;
    }

}
