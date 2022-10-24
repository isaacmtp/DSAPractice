import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ClassSort {
    ClassSort()
    {
        int arr[] = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            for(int i=0;i<arr.length;i++){
                arr[i] =Integer.parseInt(br.readLine());
            }
            Arrays.sort(arr);
            for(int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }
        catch (Exception E){
            System.out.println(E);
        }
    }
}
