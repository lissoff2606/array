import java.util.Random;

public class Func {

    private int[] arr;

    public Func(int[] arr) {
        this.arr = arr;
    }

    public void sortBubble() {
        System.out.println("\nsort bubble");
        int[] arrSort = arr;
        int x;
        for (int i = 1; i < arr.length; i++)
            for (int j = arr.length - 1; j >= i; j--) {
                if (arr[j - 1] > arr[j]) {
                    x = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = x;
                }
            }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void selectSort() {
        System.out.println("\nselect sort");
        int min = 0;
        int id = 0;
        int[] arrSort = arr;
        for (int i = 0; i < arr.length; i++) {
            min = arrSort[i];
            id = i;
            for (int j = i + 1; j < arrSort.length; j++) {
                if (arrSort[j] > min) {
                    id = j;
                    min = arrSort[j];
                }
            }
            if (arrSort[i] != arrSort[id]) {
                arrSort[id] = arrSort[i];
                arrSort[i] = min;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public void sumDiff() {
        int[] arrSort = arr;
        int sum = 0;
        int diff = 0;
        for (int x : arr) diff -= x;
        for (int y : arr) sum += y;
        System.out.println("summ  : " + sum + "\ndiff :" + diff);
    }

    public void searchMinMax() {
        int[] arrSort = arr;
        int x, min, max;
        System.out.println("\nsearch min and max program");
        max = min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.println("min number:" + min + "\nmax number :" + max);
    }

    public void arr2() {
        Random random = new Random();
        int[][] arr2 = new int[6][6];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                arr2[i][j] = random.nextInt(9) + random.nextInt(9);
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}


//https://www.youtube.com/watch?v=9CBRBSWTl-E&index=7&list=PLNclrLF8MXOzo2k5NIzym86o2Faa3jB0Q соотировки
//https://www.youtube.com/watch?v=BaxjVopMFB4 java собеседование
//https://www.youtube.com/watch?v=PEL2j1YJa70 что нужно знать