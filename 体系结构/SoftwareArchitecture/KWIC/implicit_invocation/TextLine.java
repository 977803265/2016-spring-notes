package implicit_invocation;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class TextLine extends Observable {
    private List<String> lines;

    public TextLine(Observer observer) {
        addObserver(observer);
    }

    public List<String> getLines() {
        return lines;
    }

    public void setLines(List<String> lines) {
        this.lines = lines;
        setChanged();
        notifyObservers(this);
    }
}
