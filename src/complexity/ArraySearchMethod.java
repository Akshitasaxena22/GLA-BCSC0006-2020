/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 07/01/20
 *   Time: 12:15 AM
 */

package complexity;

public class ArraySearchMethod {
    public static int search(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i; // return the index at which the target was found
            }
        }
        return -1;  //  return -1 if the target was not found
    }
}
