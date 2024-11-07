package logic;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Career implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    @Basic
    private String name;
    private int subjects;
    @OneToMany(mappedBy = "career")
    private LinkedList<Subject> subjectsList;

    public Career(String name, int subjects, LinkedList<Subject> subjectsList) {
        this.name = name;
        this.subjects = subjects;
        this.subjectsList = subjectsList;
    }

    public Career() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSubjects() {
        return subjects;
    }

    public void setSubjects(int subjects) {
        this.subjects = subjects;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(LinkedList<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

}
