package javaPersistanceAPI;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import logic.Career;
import logic.Controller;
import logic.Student;
import logic.Subject;

public class JavaPersistenceAPI {

    public static void main(String[] args) {
        /*
        es un ORM (Object Relational Mapping) que tiene como objetivo
        lograr la persistencia de datos entre una aplicacion desarrollada
        en Java y una bdd
        
        JPA busca traducir el modelado de las clases a un modelo relacional
        en una bdd, posibilitando al programador elegir que clases u objetos
        que quiere persistir
        
        JPA se vale de una serie de mapeos que se deben realizar sobre cada
        uno de los elementos de una clase, los mismos, se representan
        mediante annotations (@)
        
        JPA cuenta con proveedores de JPA, entre ellos: Eclipselink, Hibernate
        Toplink.....
        
        nos permite comunicar la app con la bdd
        
        clases = entidades
         */

 /*
        anotaciones mas usadas
        
        . @Entity: especifica la creacion de una entidad. se coloca al inicio de la definicion de una clase
        
        . @Id: pk de la entidad
        - @GenerateValue(strategy = GenerationType.SEQUENCE): establece que la ID se va a generar de forma
        automatica y secuencial
        
        . @Baszic: para hacer referencia a atributos comunes
        
        . @Temporal se usa normalmente en fechas
        - si se quiere tener en cuenta la hora se utiliza: @Temporal(TemporalType.TIMESTAMP)
        - si solo se tiene en cuenta la fecha (DATE): @Temporal(TemporalType.DATE)
        
        @OneToMany: 1 a n
        
        @OneToOne: 1 a 1
        
        @ManyToMany: n a n
         */
        Controller controller = new Controller();
        /*
        Student student = new Student(22, "Jazmin", "Aranda", new Date());
        controller.createStudent(student);
        controller.deleteStudent(22);
        
        student.setName("Jazmin Maria Ayelen");
        
        controller.editStudent(student);
         */

        // Student student = new Student(32, "Nicolas", "Galdos", new Date());
        /*
        controller.createStudent(student);
        System.out.println(controller.findStuden(15).getName());

        ArrayList<Student> listStudent = controller.getListStudents();

        for (Student stud : listStudent) {
            System.out.println(stud.getName() + " " + stud.getLastName());
        }
         */
        LinkedList<Subject> subjectList = new LinkedList<Subject>();

        Career career = new Career("Lic en sistemas", 37, subjectList);
        controller.createCareer(career);

        Subject cadp = new Subject("CADP", "Cuatrimestral", career);
        Subject oc = new Subject("OC", "Cuatrimestral", career);
        controller.createSubject(oc);
        controller.createSubject(cadp);
        subjectList.add(cadp);
        subjectList.add(oc);

        career.setSubjectsList(subjectList);

        controller.editCareer(career);

        controller.createStudent(new Student(22, "Blas", "Casale", new Date(), career));
        System.out.println(controller.findStudent(22).getCareer().getName());
    }
}
