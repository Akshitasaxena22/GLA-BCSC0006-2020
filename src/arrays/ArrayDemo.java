/*
 *   Created by IntelliJ IDEA.
 *   User: divyanshb
 *   Date: 05/01/20
 *   Time: 11:15 PM
 */

package arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        /*
         * 1. Declare and initialize an array of 10 primitive integers
         * Notice, the "[]" brackets are written after the data-type declaration,
         * this is how Java expects programmers to write array notation.
         *
         * The "magic number" 10 inside the brackets on the right-hand side is
         * the size of the array, this tells us how many elements can be stored inside
         * the array. As a rule, the magic number should be used as little as possible in
         * the code.
         * */
        int[] array = new int[10];

        /*
        * 2. How to insert values in an array
        * SIMPLE! WE USE A LOOP
        * For simplicity, this example uses a for loop.
        * Notice how the loop runs till the `length` of the loop
        * */
        for (int i = 0; i < array.length; i++) {
            array[i] = (i + 1);
            // here, we are setting the value of all the elements of the array
            // as the index + 1
        }

        /*
        * 3. Traversing an array (Simply put, it is just going to each and every location once)
        * We can use a simple for loop to do this.
        * */
        for (int i = 0; i < array.length; i++) {
            System.out.println("index: " + i + ", value: " + array[i]);
        }
    }
}