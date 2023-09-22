
public class Lab {
    /**
     * @param arr the array we're getting data from.
     * @return the length of arr.
     */
    public int getLengthOfArray(int[] arr){
        return arr.length; // Return the actual length of the array
    }

    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to return.
     *          Indexes in arrays start counting from zero.
     * @return the element at index n of arr.
     */
    public int getNthElementOfArray(int[] arr, int n){
        if (n >= 0 && n < arr.length) {
            return arr[n]; // Return the element at index n
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    /**
     * @param arr the array we're getting data from.
     * @param n the index (number) of the element we're looking to modify.
     *          Indexes in arrays start counting from zero.
     * @param val the value that we will assign to a spot in the array.
     * @return nothing. Because of pass-by-reference, any change to the array will be reflected across our java program.
     */
    public void setNthElementOfArray(int[] arr, int n, int val){
        if (n >= 0 && n < arr.length) {
            arr[n] = val; // Set the element at index n to the specified value
        } else {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
    }

    /**
     * @param n the size of the array we wish to create
     * @return a new int array that can contain n elements.
     */
    public int[] returnNewArraySizeN(int n){
        return new int[n]; // Create a new int array of size n
    }
}