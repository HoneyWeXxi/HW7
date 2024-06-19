import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int toadEyesCount = 0;          //Жабьи глаза
        int ghoulTearsCount = 0;        //Слезы вурдалака
        int ravenBonesCount = 0;        //Кости ворона
        int dumplingsCount = 0;         //Пельмени(а почему, собственно нет? xD )
        boolean isCanCook = false;
        //todo реализовать ввод пользователем кол-ва ингредиентов.
        System.out.println("Введите кол-во жабьих глаз: ");
        toadEyesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во слез вурдалака: ");
        ghoulTearsCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во костей ворона: ");
        ravenBonesCount = new Scanner(System.in).nextInt();
        System.out.println("Введите кол-во пельменей: ");
        dumplingsCount = new Scanner(System.in).nextInt();
        //Рецепты Эликсиров:
        // 1. 3 Жабьих глаза + 1 кость ворона - Эликсир зоркости
        // 2. 2 кости ворона + 4 пельменя - Эликсир стойкости
        // 3. 7 слез вурдалака + 1 пельмень + 2 жабьих глаза - Эликсир скрытности
        // 4. 5 слез вурдалака + 10 пельменей + 4 жабьих глаза + 3 кости ворона - Запретный эликсир

        //todo дописать логику программы сюда
        while (!isCanCook) {
            if (toadEyesCount >= 3 && ravenBonesCount >= 1) {
                System.out.println("Элексир зоркости");
                isCanCook = true;
            }
            if (ravenBonesCount >= 2 && dumplingsCount >= 4) {
                System.out.println("Элексир стойкости");
                isCanCook = true;
            }
            if (ghoulTearsCount >= 7 && dumplingsCount >= 1 && toadEyesCount >= 2) {
                System.out.println("Элексир скрытности");
                isCanCook = true;
            }
            if (ghoulTearsCount >= 5 && dumplingsCount >= 10 && toadEyesCount >= 4 && ravenBonesCount >= 3) {
                System.out.println("Элексир Запретный");
                isCanCook = true;
            }
            if (!isCanCook) {
                System.out.println("Ни один эликсир нельзя приготовить");
                isCanCook = true;
            }
        }
    }
}
