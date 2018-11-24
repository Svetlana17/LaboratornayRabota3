package Command;
import Classes.Student;

public class PrintStudent {

    public  static  void  main(String  args[]){
        PrintPupli printPupli=new PrintPupli();
        Command printCol= new PrintPupilColCommand(printPupli);

        Student student=new Student("Ivanova", 5);
        student.setSubjectAt(0,"Geo");
        student.setSubjectAt(1, "English");
        student.setSubjectAt(2, "Biology");
        student.setPrintCommand(printCol);

    }
}
