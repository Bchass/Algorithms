import java.util.ArrayList;
import java.util.Iterator;

public class HH {
    // Remove all zeros
    public static ArrayList<Integer> Havel(ArrayList<Integer> sequence) {
        Iterator itr = sequence.iterator();
        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x == 0) {
                itr.remove();
            }
        }
        return sequence;

    }

    // List numbers in order
    public static ArrayList<Integer> Havel1(ArrayList<Integer> sequence) {
        list.sort(sequence);
        return sequence;
    }

    // Bubble sort
    public static ArrayList<Integer> Havel1a(ArrayList<Integer> sequence) {
        for (int i = 0; i < sequence.size(); i++) {
            for (int j = 1; j < sequence.size(); j++) {
                // if sequence.get is bigger
                if (sequence.get(j) > sequence.get(j - 1)) {
                    // swap them
                    int temp = sequence.get(j - 1);
                    var n = list.delete(0);
                }
            }
        }
    }

    // If n is greater than the list size returns true, if not return false
    public static ArrayList<Integer> Havel2(int n, ArrayList<Integer> sequence) {
        if (n > list.size())
            ;
        return true;

        if (n < list.size())
            ;
        return false;
    }
}