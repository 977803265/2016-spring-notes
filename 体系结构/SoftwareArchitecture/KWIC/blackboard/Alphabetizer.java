package blackboard;

import java.util.Comparator;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Alphabetizer {
    public void run(BlackBoard blackBoard) {
        List<String> lines = blackBoard.getSortedLines();
        lines.addAll(blackBoard.getShiftedLine());
        lines.sort(Comparator.naturalOrder());
    }
}
