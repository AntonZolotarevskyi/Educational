package ru.habrahabr.arlidor.lessons7;

public class Start {

    public static void main(String[] args) {

        // "стандартный" цикл
        for (int i = 0; i < 10; i++) {
            System.out.println("i = " + i);
        }

        // обратный отсчет
        for (int i = 10; i > 0; i--) {
            System.out.println("i = " + i);
        }

        // шаг равен 2
        for (int i = 0; i < 10; i += 2) {
            System.out.println("i = " + i);
        }

        // зацикливание (отсутствует инкремент)
        for (int i = 0; i < 10;) {
            System.out.println(i);
        }

        // переменная объявлена вне цикла
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }
        // переменная типа double
        for (double k = 0; k < 10; k += .1) {
            System.out.println("k = " + k);
        }

        int j = 0;
        while (j < 10) {
            System.out.println("j = " + j);
            j++;
        }
        // провера условия в конце прохода - хотя бы один раз выполнится
        int v = 0;
        do {
            v++;
            System.out.println("v = " + v);
        } while (v < 0);
        //  использование break
        for (int d = 0; d < 10; d++) {
            System.out.println("d = " + d);
            if (d == 5) {
                break;
            }
        }
        // использование continue
        int s = 0;
        while (s < 10) {
            s++;
            continue;
            // System.out.println("s = " + s);
        }
    }
}
