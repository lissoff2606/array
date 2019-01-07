import java.util.Random;

public class CreateRandom {

void randomArray(int size)
{
    Random random = new Random();
    int[]arr = new int[size];
    for(int i = 0;i<arr.length;i++){
    arr[i] = random.nextInt(100);
    System.out.print(arr[i]+" ");}
}


}
