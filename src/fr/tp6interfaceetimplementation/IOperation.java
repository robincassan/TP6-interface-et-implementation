package fr.tp6interfaceetimplementation;

/**
 * Cette interface impose une signature � toute classe souhaitant effectuer une
 * op�ration sur 2 entiers
 *
 * @author DIGINAMIC
 *
 */
public interface IOperation {
    /**
     * Cette m�thode effectue un calcul sur 2 entiers et retourne un r�sultat
     *
     * @param a entier
     * @param b entier
     * @return int
     */
    int calcul(int a, int b);
}
