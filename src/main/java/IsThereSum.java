
public class IsThereSum {
    /**
     * Check if there exist two numbers in an array add up to some other number.
     * You will likely need a for loop nested inside of another for loop for this problem - each for loop checking
     * sums of two different indexes of arr.
     *
     * @param arr an array of ints.
     * @param target a hypothetical sum of two numbers.
     * @return true if two separate values in the array add up to a target, false otherwise.
     */
    public boolean check(int[] arr, int target){
        // Outer loop to select first number in pair
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop to select the second number in the pair
            for (int j = i + 1; j < arr.length; j++) {
                // Check if the sum of the current pair matches the target
                if (arr[i] + arr[j] == target) {
                    return true;
                }
            }
        }
        return false;
    }
}
