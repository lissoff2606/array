import java.util.Random;

public class Bubble {


    public static void main(String[] args) {

        SortBubble sort = new SortBubble();
        sort.SortBubble();

        /*Random random = new Random();
        int[] arr = new int[10];
        System.out.println("random array");
        for(int i = 0;i<arr.length;i++)
        {
        arr[i] = random.nextInt(100);
        System.out.print(arr[i] +" ");
        }

        SortBubble sort1 = new SortBubble();
        sort1.SortBubble(3);*/
    }



}
/*основы git
git init                                                    инициализация в нашем проекте
git config --global user.name "name"                        инициализация имени
git config --global user.email "@gmail.com"                 инициализация адреса
git status                                                  статус проекта (отслеживаемые файлы)
создание файла .gitignore в корне проекта . в этом файле указываем файлы , которые мы не хотим отслеживать в нашей системе контроля версий (.idea/*    out/*   *.iml)
git add --all                                               добавление файлов
git commit -m "Init commit"

*/