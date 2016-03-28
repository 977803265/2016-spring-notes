package pipe_filter;

import java.util.Comparator;
import java.util.List;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Alphabetizer extends Filter {
    public Alphabetizer(Pipe pipe) {
        super(pipe);
    }

    @Override
    public void apply(Object arg) throws Exception {
        List<String> lines = (List<String>) arg;
        lines.sort(Comparator.naturalOrder());
        super.apply(arg);
    }
}
