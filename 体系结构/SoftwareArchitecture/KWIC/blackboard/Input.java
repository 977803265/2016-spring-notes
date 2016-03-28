package blackboard;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Input implements AutoCloseable {
    private BufferedReader reader;

    public Input(String fileName) throws Exception {
        reader = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8);
    }

    public boolean run(BlackBoard blackBoard) throws Exception {
        String line = reader.readLine();
        blackBoard.setLine(line);
        return line != null;
    }

    @Override
    public void close() throws Exception {
        reader.close();
    }
}
