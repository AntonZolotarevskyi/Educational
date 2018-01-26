package ru.habrahabr.arlidor.lessons5;

public class Test {

    public static void main(String[] args) {
        new Test().testMethod(2);
    }

    public void testMethod(int count) {
        if (count > 5) {
            count += 1;
        } else if (count < 0) {
            count = -10;
        } else {
            count += 5;
        }

        switch (count) {
            case 5:
                test2();
                break;
            case 10:
                test3();
                break;
            default:
        }
        System.out.println(count);

        count = count > 0 ? count + 1 : count + 5;
        System.out.println(count);
    }

    private void test3() {
        System.out.println("test3");
    }

    private void test2() {
        System.out.println("test2");
    }
}
