import java.util.Scanner;


public class main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /**
     * task1
     * #10
     * Дана строка. Вывести строку, содержащую те же символы, но расположенные в обратном порядке.
     */
    private static void task1() {

        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        for (int i = text.length() - 1; i >= 0; i--) {
            System.out.print(text.charAt(i));
        }
    }

    /**
     * task2
     * #33
     * Даны строки S и S0. Удалить из строки S первую подстроку, совпадающую с S0.
     * Если совпадающих подстрок нет, то вывести строку S без изменений.
     */


    private static void task2() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        String s0 = scanner.next();
        s = s.replace(s0, "");
        System.out.print(s);
    }


    /**
     * task3
     * #56
     * Дана строка-предложение заданное кириллицей. Вывести самое короткое слово в предложении.
     */
    private static void task3() {
        String string = "Это предложение для третьей лабораторной работы по кросс-платформенному программированию";
        String word = "", small = "";
        String[] words = new String[100];
        int length = 0;
        string = string + " ";

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                word = word + string.charAt(i);
            } else {
                words[length] = word;
                length++;
                word = "";
            }
        }

        small = words[0];

        for (int k = 0; k < length; k++) {

            if (small.length() > words[k].length())
                small = words[k];
        }

        System.out.println("Smallest word: " + small);
    }

}

