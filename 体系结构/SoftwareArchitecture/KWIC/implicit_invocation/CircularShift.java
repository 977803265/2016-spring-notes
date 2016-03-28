package implicit_invocation;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class CircularShift extends Observable implements Observer {
    public CircularShift(Observer observer) {
        addObserver(observer);
    }

    @Override
    public void update(Observable o, Object arg) {
        TextLine textLine = (TextLine) arg;
        List<String> lines = textLine.getLines();
        int count = lines.size();
        for (int i = 0; i < count; ++i) {
            String[] words = lines.get(i).split(" ");
            // loop length - 1 times. the original lines have already been added.
            for (int j = 0; j < words.length - 1; ++j) {
                // circular shift left
                for (int k = 0; k < words.length - 1; ++k) {
                    String tmp = words[k];
                    words[k] = words[k + 1];
                    words[k + 1] = tmp;
                }

                lines.add(String.join(" ", words));
            }
        }

        setChanged();
        notifyObservers(o);
    }
}
