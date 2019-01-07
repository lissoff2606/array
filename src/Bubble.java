import java.util.Random;

public class Bubble {


    public static void main(String[] args) {

        Random random = new Random();
        int[] arr = new int[10];
        System.out.println("random array");
        for(int i = 0;i<arr.length;i++)
        {
        arr[i] = random.nextInt(100);
        System.out.print(arr[i] +" ");
        }

    }



}
/*основы git
git init                                                    инициализация в нашем проекте
git config --global user.name "lissoff2606"                 инициализация имени
git config --global user.email "lissoff2606@gmail.com"      инициализация адреса
git status                                                  статус проекта (отслеживаемые файлы)
создание файла .gitignore в корне проекта . в этом файле указываем файлы , которые мы не хотим отслеживать в нашей системе контроля версий (.idea/*    out/*   *.iml)

