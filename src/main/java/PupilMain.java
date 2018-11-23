import java.io.*;

public class PupilMain {

    public static  void  main(String args[]){


        Pupil student =new Student("Petrov" ,2);
        student.setSubjectAt(0,"Geo");
        student.setSubjectAt(1, "English");
        student.setMarkAt(1,2);
        student.setMarkAt(0,5);
        student.addSubjectAndMark("Math",4);
        Pupil schoolGirl=new SchoolGirl("Petrova", 3);
       schoolGirl.setSubjectAt(1, "Rus");
       schoolGirl.setMarkAt(1, 4);
       schoolGirl.addSubjectAndMark("Rus", 3);


        PupilChain col =new PrintPupilCol();
      PupilChain row=new PrintPupilRow();
      col.setNextChain(row);
      col.printField(student);


    }
}

