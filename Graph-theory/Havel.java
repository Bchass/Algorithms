
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Havel {
    // Remove all zeros
    public static ArrayList<Integer> HH(ArrayList<Integer> order) {
        Iterator<Integer> itr = order.iterator();
        while (itr.hasNext()) {
            int x = (int) itr.next();
            if (x == 0) {
                itr.remove();
            }
        }
        return order;

    }

    // List numbers in order
    public static ArrayList<Integer> Havel1(ArrayList<Integer> order) {
        Collections.sort(order);
        return order;
    }

    // Bubble sort
    public static ArrayList<Integer> Havel1a(ArrayList<Integer> order) {
        for (int i = 0; i < order.size(); i++) {
            for (int j = 1; j < order.size(); j++) {
                // if sequence.get is bigger
                if (order.get(j) > order.get(j - 1)) {
                    // swap them
                    int temp = order.get(j - 1);
                    var n = order.remove(0);
                }
            }
        }
        return order;
    }

    // If n is greater than the order size returns true, if not return false
    public static boolean Havel2(int n, ArrayList<Integer> order) {
        return n > order.size();

    }

    // Return the final result from subtracting 1
    public static ArrayList<Integer> Havel3(int n, ArrayList<Integer> order) {

        for (int i = 0; i < n; i++) {
            order.set(i, order.get(i) - 1);
        }
        return order;
    }
}