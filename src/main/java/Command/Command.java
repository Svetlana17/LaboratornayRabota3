package Command;

import java.io.IOException;

public interface Command{
    void execute(Student student) throws IOException;
}
