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
    public static ArrayList<Integer> Havel1(ArrayList<Integer> sequence){
        list.sort(sequence);
        return sequence;
    }

}