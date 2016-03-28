package implicit_invocation;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class KWIC {
    public static void main(String[] args) throws Exception {
        List<String> lines = new ArrayList<>();
        try (BufferedReader reader = Files.newBufferedReader(Paths.get("input.txt"), StandardCharsets.UTF_8)) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }

        Alphabetizer alphabetizer = new Alphabetizer();
        CircularShift circularShift = new CircularShift(alphabetizer);
        TextLine textLine = new TextLine(circularShift);
        textLine.setLines(lines);

        System.out.println(lines);
    }
}
