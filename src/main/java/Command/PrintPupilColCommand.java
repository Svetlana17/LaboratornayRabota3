package Command;

import java.io.IOException;

public class PrintPupilColCommand implements  Command {
    PrintPupli printPupli;
    public PrintPupilColCommand(PrintPupli printPupli) {this.printPupli=printPupli;
    }
    @Override
    public void execute(Student student) throws IOException {
            printPupli.printCol(student);
        }
    }

