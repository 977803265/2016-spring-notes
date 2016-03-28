package blackboard;

/**
 * Created by troyeagle on 2/26/2016.
 */
public class KWIC {
    public static void main(String[] args) throws Exception {
        CircularShift circularShift = new CircularShift();
        Alphabetizer alphabetizer = new Alphabetizer();
        BlackBoard blackBoard = new BlackBoard();

        try (Input input = new Input("input.txt")) {
            while (input.run(blackBoard)) {
                circularShift.run(blackBoard);
                alphabetizer.run(blackBoard);
            }

            System.out.println(blackBoard.getSortedLines());
        }
    }
}
