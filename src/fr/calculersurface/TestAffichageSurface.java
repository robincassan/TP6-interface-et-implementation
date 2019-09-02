package fr.calculersurface;

public class TestAffichageSurface {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        ISurface isurfaceforme = new Rectangle(2, 3);
        System.out.println(isurfaceforme.calculerSurface());

        Piece p1 = new Piece(0, 2);
        Chambre chambre1 = new Chambre(1, 20);
        Salon salon = new Salon(1, 20);
        Cuisine cuisine = new Cuisine(0, 5);
        SalleDebain salleDeBain = new SalleDebain(1, 8);
        Chambre chambre2 = new Chambre(0, 12);
        Wc wc = new Wc(1, 2);

        p1.setEtage(10);
        chambre1.setSuperficie(15);
        salon.setSuperficie(300);

        Piece[] array = new Piece[] { p1, chambre1, salon, cuisine, salleDeBain, chambre2, wc };
        ISurface isurfaceMaison = new Maison(array);
        System.out.println(isurfaceMaison.calculerSurface());

    }

}
