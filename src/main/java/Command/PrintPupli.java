package Command;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import Command.Student;

public class PrintPupli {

    public  void  printCol(Student student) throws IOException {
     PrintPupli printPupli=new PrintPupli();
     PrintPupilColCommand printPupilColCommand=new PrintPupilColCommand(printPupli);
     System.out.println("col");
        File file=new File("command");

        FileWriter fileWriter=new FileWriter(file, true);

        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        bufferedWriter.newLine();
        bufferedWriter.write("___________");
        bufferedWriter.newLine();
        bufferedWriter.write(student.getSecondName());
        bufferedWriter.newLine();
        bufferedWriter.write(student.getSubjectAt(1));
        bufferedWriter.newLine();
        bufferedWriter.write(student.getMarkAt(1)+ " ");
        bufferedWriter.newLine();
        bufferedWriter.close();
    }
    public  void  printRow(Student student){
        PrintPupli printPupli=new PrintPupli();
        PrintPupliRowCommand pupliRowCommand=new PrintPupliRowCommand(printPupli);
        System.out.println("row");

        File file = new File("command");
        try {
//            if(file.createNewFile()){
            String s="";
            for(int i=0; i<student.getSubjectsCount(); i++){
                s=s+ " "+ student.getSubjectAt(i);
            }
            String mark = "";
            for(int i=0; i<student.getSubjectsCount(); i++){
                mark=mark+ " "+ student.getMarkAt(i);
            }
            FileWriter fileWriter = new FileWriter(file, true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.newLine();
            bufferedWriter.write("___________");
            bufferedWriter.newLine();
            bufferedWriter.write(student.getSecondName() + " " + mark + " "  + s);
            bufferedWriter.newLine();
            ////++++++++++++++++++++++
//            bufferedWriter.write(student.getMarkAt(1)+ " ");
//            bufferedWriter.newLine();
//            bufferedWriter.write(student.getSubjectAt(1));
//            bufferedWriter.newLine();
            /////+++++++++++++++
            bufferedWriter.write("___________");
            bufferedWriter.close();
            //  }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
