package pipe_filter;

/**
 * Created by troyeagle on 2/26/2016.
 */
public abstract class Filter {
    private Pipe pipe;

    public Filter(Pipe pipe) {
        this.pipe = pipe;
    }

    public void apply(Object arg) throws Exception {
        if (pipe != null) pipe.apply(arg);
    }
}
