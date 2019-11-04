import java.lang.reflect.Array;
import java.util.Arrays;

public class Home {

    public static void main(String[] args) {

        biggestValueFromArray();
    }

    public static void biggestValueFromArray() {

        int[] myArray = {1,5,7,9,2,6};
        System.out.println(Arrays.toString(myArray));
        Arrays.sort(myArray);
        System.out.println(Arrays.toString(myArray));
        System.out.println(myArray[myArray.length-1]);


    }
}
