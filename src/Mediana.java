import java.lang.reflect.Array;
import java.util.Arrays;

public class Mediana {

    public void mediana(int[] arr)
    {

        Arrays.sort(arr);
        int median = arr.length/2;
        System.out.print("A mediana é: " + arr[median]);
    }
}
