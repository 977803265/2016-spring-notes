package pipe_filter;

/**
 * Created by troyeagle on 2/26/2016.
 */
public final class Pipe {
    private Filter filter;

    public Pipe(Filter filter) {
        this.filter = filter;
    }

    public void apply(Object arg) throws Exception {
        filter.apply(arg);
    }
}
