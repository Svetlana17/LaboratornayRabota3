import Classes.Pupil;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PrintPupilRow implements  PupilChain {
    private PupilChain pupilChain;
    @Override
    public void setNextChain(PupilChain nextChain) {
     this.pupilChain=nextChain;
    }
    @Override
    public void printField(Pupil pupil) {
      System.out.println(pupil.getSubjectsCount());
        if (pupil.getSubjectsCount() <= 3) {
            File file = new File("test");
            try {
//            if(file.createNewFile()){
                String s="";
                for(int i=0; i<pupil.getSubjectsCount(); i++){
                    s=s+ " "+ pupil.getSubjectAt(i);
                }
                String mark = "";
                for(int i=0; i<pupil.getSubjectsCount(); i++){
                    mark=mark+ " "+ pupil.getMarkAt(i);
                }
                FileWriter fileWriter = new FileWriter(file, true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                bufferedWriter.newLine();
                bufferedWriter.write("___________");
                bufferedWriter.newLine();
                bufferedWriter.write(pupil.getSecondName() + " " + mark + " "  + s);
                bufferedWriter.newLine();
                ////++++++++++++++++++++++
//                bufferedWriter.write(pupil.getMarkAt(1)+ " ");
//                bufferedWriter.newLine();
//                bufferedWriter.write(pupil.getSubjectAt(1));
//                bufferedWriter.newLine();
                /////+++++++++++++++
                bufferedWriter.write("___________");
                bufferedWriter.close();
                //  }
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.print(pupil.getSecondName());
            System.out.print(pupil.getSubjectAt(1));
            System.out.print(pupil.getMarkAt(1));
        } else {
            if (this.pupilChain != null) {
                this.pupilChain.printField(pupil);
            }
        }
    }
}
