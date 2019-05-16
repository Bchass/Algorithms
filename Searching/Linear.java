package Searching;

public class Linear<T> {
    public T LinearSearch(T[] list, T target) {
        int index = 0;
        boolean found = false;
        // Loop through array to find target
        while (!found && index < list.length) {
            if (list[index].equals(target))
                found = true;
            else
                index++;
        }
        if (found)
            return list[index];
        else
            return null;
    }
}