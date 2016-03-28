package pipe_filter;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Input extends Filter {
    public Input(Pipe pipe) {
        super(pipe);
    }

    @Override
    public void apply(Object arg) throws Exception {
        String fileName = (String) arg;
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get(fileName), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        super.apply(lines);
    }
}
