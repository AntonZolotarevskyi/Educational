package ru.habrahabr.arlidor.lesson9;

public class Start implements StartInterface {

    private int varTmp = 1;

    @Override
    public void test() {
        method1();

    }

    private void method1() {
        varTmp = DEFAULT_VALUE;
    }

    @Override
    public void test2() {

    }

}
