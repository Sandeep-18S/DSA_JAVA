package exceptional_handling;
import java.util.Arrays;
import java.util.Collections;

public class revese_the_array {
public static void main(String[] args) {
	Integer []arr= {7,9,6,4,8};
	Arrays.sort(arr,Collections.reverseOrder());
	System.out.println(Arrays.toString(arr));
}
}
