package blackboard;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class BlackBoard {
    private String line;
    private List<String> shiftedLine;
    private List<String> sortedLines = new ArrayList<>();

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public List<String> getShiftedLine() {
        return shiftedLine;
    }

    public void setShiftedLine(List<String> shiftedLine) {
        this.shiftedLine = shiftedLine;
    }

    public List<String> getSortedLines() {
        return sortedLines;
    }

    public void setSortedLines(List<String> sortedLines) {
        this.sortedLines = sortedLines;
    }
}
