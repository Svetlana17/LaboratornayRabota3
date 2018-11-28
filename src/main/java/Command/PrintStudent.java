package Command;


import java.io.IOException;

public class PrintStudent {

    public  static  void  main(String  args[]) throws IOException {
        PrintPupli printPupli=new PrintPupli();
        Command printCol= new PrintPupilColCommand(printPupli);
        Command printRow =new PrintPupliRowCommand(printPupli);
        Student student=new Student("Ivanova", 5);
        student.setSubjectAt(0,"Geo");
        student.setSubjectAt(1, "English");
        student.setSubjectAt(2, "Biology");

        student.setMarkAt(0,5);
        student.setMarkAt(1,5);
        student.setPrintCommand(printCol);
        student.setPrintCommand(printRow);
    }
}
