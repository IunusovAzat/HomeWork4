public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Задание 1.
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }
        System.out.println();
        for (int b = 10; b > 0; b--) {
            System.out.print(b + " ");
        }
        System.out.println();

        // Задание 2
        for (int friDay = 2; friDay <= 31; friDay = friDay + 7) {
            System.out.println("Сегодня пятница, " + friDay + " - е число. Необходимо подготовить отчет");
        }


        // Задание 3.
        int presentDay = 2022;
        int start = presentDay - 200;
        int end = presentDay + 100;
        for (int g = start; g <= end; g++) {
            if (g % 79 == 0) {
                System.out.println("Комета пролетала (или будет пролетать) над землей " + g);
            }
        }
    }
}
