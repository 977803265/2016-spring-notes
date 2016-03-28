package pipe_filter;

import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class CircularShift extends Filter {
    public CircularShift(Pipe pipe) {
        super(pipe);
    }

    @Override
    public void apply(Object arg) throws Exception {
        List<String> lines = (List<String>) arg;

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

        super.apply(arg);
    }
}
