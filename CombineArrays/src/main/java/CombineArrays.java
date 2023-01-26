import java.util.Arrays;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){

        int length = arr1.length + arr2.length;
        int [] combine = new int[length];

        System.arraycopy(arr1, 0, combine, 0, arr1.length);
        System.arraycopy(arr2, 0, combine, arr1.length, arr2.length);

        return combine;
    }
}
