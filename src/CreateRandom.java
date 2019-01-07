import java.util.Random;

public class SortBubble {

void SortBubble()
{
    Random random = new Random();
    int[]arr = new int[10];
    for(int i = 0;i<arr.length;i++){
    arr[i] = random.nextInt(100);
    System.out.print(arr[i]+" ");
}
}}
