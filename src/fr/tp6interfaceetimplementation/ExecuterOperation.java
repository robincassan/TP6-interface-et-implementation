package fr.tp6interfaceetimplementation;

public class ExecuterOperation {

    int execute(int a, int b, IOperation i) {
        return i.calcul(a, b);

    }

}
