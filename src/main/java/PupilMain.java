import Classes.Pupil;
import Command.Student;

public class PupilMain {

    public static  void  main(String args[]){
//Main Class Chain of Responsibility
        Pupil student =new Student("Petrov" ,4);
        student.setSubjectAt(0,"Geo");
        student.setSubjectAt(1, "English");
//        student.setSubjectAt(2, "Biology");
//        student.setSubjectAt(3, "OOP");
        student.setMarkAt(0,5);
        student.setMarkAt(1,3);
//        student.setMarkAt(2,3);
//        student.setMarkAt(3,3);
        PupilChain col = new PrintPupilCol();
        PupilChain row = new PrintPupilRow();
        col.setNextChain(row);
        col.printField(student);
        col.setNextChain(row);
        col.printField(student);
/////++++++
       row.setNextChain(col);
       row.printField(student);

    }
}

