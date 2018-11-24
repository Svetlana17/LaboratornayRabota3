package Command;

public class PrintPupliRowCommand implements  Command {
PrintPupli printPupli;

    public PrintPupliRowCommand(PrintPupli printPupli) {
        this.printPupli = printPupli;
    }

    @Override
    public void execute() {
        printPupli.printRow();
    }
}
