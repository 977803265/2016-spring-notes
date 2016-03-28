package implicit_invocation;

import java.util.Comparator;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Alphabetizer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        TextLine textLine = (TextLine) arg;
        List<String> lines = textLine.getLines();
        lines.sort(Comparator.naturalOrder());
    }
}
