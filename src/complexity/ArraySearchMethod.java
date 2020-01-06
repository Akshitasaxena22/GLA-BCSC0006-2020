/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 07/01/20
 *   Time: 12:15 AM
 */

package complexity;

public class ArraySearchMethod {
    /*
     * If the target is not present in the array, then the for loop body will be executed x.length
     * times. If the target is present, it could be anywhere. If we consider the average over all cases
     * where the target is present, then the loop body will execute x.length/2 times. Therefore, the
     * total execution time is directly proportional to x.length .
     * */
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return the index at which the target was found
            }
        }
        return -1;  //  return -1 if the target was not found
    }
}
