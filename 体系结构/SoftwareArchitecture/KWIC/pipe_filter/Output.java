package pipe_filter;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class Output extends Filter {
    public Output(Pipe pipe) {
        super(pipe);
    }

    @Override
    public void apply(Object arg) throws Exception {
        System.out.println(arg);
        super.apply(arg);
    }
}
