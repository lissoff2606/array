import java.util.Random;

public class Array {


    public static void main(String[] args) {
                Random random = new Random();
        int[] arr = new int[20];
        System.out.println("default array");
        for(int i = 0;i<arr.length;i++){
            arr[i] = random.nextInt(555);
            System.out.print(arr[i]+" ");}


        //output
        Func func = new Func(arr);
        func.sortBubble();      //сортировка массива методом пузырька
        func.searchMinMax();    //поиск минимального и максимального числа в массиве
        func.arr2();            //создание двухмерного массива
        func.sumDiff();         //сумма и разность всех элементов в массиве




}}
/*основы git
git init                                                    инициализация в нашем проекте
git config --global user.name "name"                        инициализация имени
git config --global user.email "@gmail.com"                 инициализация адреса
git status                                                  статус проекта (отслеживаемые файлы)
создание файла .gitignore в корне проекта . в этом файле указываем файлы , которые мы не хотим отслеживать в нашей системе контроля версий (.idea/*    out/*   *.iml)
git add --all                                               добавление файлов
git commit -m "init commit"
git remote add bubble1 https://github.com/lissoff2606/array добавить адрес на github
git remote                                                  локальный репозиторий
git push bubble1 master                                     отправить файлы на репозиторий
git tag "ver_1.0"
git branch bubble2                                          создание второй ветки
git branch                                                  просмотр веток
git checkout bubble2
git merge bubble2                                           слечение веток
git log                                                     просмотр истории
*/