package pipe_filter;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class KWIC {
    public static void main(String[] args) throws Exception {
        Filter output = new Output(null);
        Pipe outputPipe = new Pipe(output);

        Filter alphabetizer = new Alphabetizer(outputPipe);
        Pipe alphabetizerPipe = new Pipe(alphabetizer);

        Filter circularShift = new CircularShift(alphabetizerPipe);
        Pipe circularShiftPipe = new Pipe(circularShift);

        Filter input = new Input(circularShiftPipe);
        input.apply("input.txt");
    }
}
