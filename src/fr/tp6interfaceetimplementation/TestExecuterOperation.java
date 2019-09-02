package fr.tp6interfaceetimplementation;

public class TestExecuterOperation {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int a = 2, b = 3;
        IOperation i1 = new Multiplication();
        IOperation i2 = new Addition();
        ExecuterOperation ex1 = new ExecuterOperation();
        System.out.println(ex1.execute(a, b, i1));
        ExecuterOperation ex2 = new ExecuterOperation();
        System.out.println(ex2.execute(a, b, i2));

    }

}
