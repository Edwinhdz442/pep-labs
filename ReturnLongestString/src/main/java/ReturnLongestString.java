
public class ReturnLongestString {
    /**
     * Return the longest String out of arr.
     * Remember that you can get the length of String with str.length().
     *
     * @param arr an array of Strings.
     * @return the longest String within arr. You can assume that there are no ties for the longest string.
     */
    public String longest(String[] arr){
        String txt = " ";
        for(int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length() > arr[i +1].length()) {
                txt = arr[i];
            } else if (arr[i].length() < arr[i + 1].length()) {
                txt = arr[i + 1];
            }
        }
        return txt;
    }
}
