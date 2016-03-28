package blackboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class CircularShift {
    public void run(BlackBoard blackBoard) {
        String line = blackBoard.getLine();
        List<String> lines = new ArrayList<>();
        lines.add(line);

        String[] words = line.split(" ");
        // loop length - 1 times. the original lines have already been added.
        for (int i = 0; i < words.length - 1; ++i) {
            // circular shift left
            for (int j = 0; j < words.length - 1; ++j) {
                String tmp = words[j];
                words[j] = words[j + 1];
                words[j + 1] = tmp;
            }

            lines.add(String.join(" ", words));
        }

        blackBoard.setShiftedLine(lines);
    }
}
