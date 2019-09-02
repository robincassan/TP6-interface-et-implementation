package fr.calculersurface;

public class TestMaison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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

		Maison maison = new Maison(array);

		// Afichage du tableau de Piece puisque la methode toString() et deepToString()
		// ne marche pas...
//		System.out.println(Arrays.toString(maison));
		for (int j = 0; j < maison.tab.length; j++) {
			System.out.println("classe : " + maison.tab[j].getClass().getName() + "  étage :  " + maison.tab[j].etage
					+ "  superficie  : " + maison.tab[j].superficie);
		}
		// Test de la méthode ajouterPiece()
		System.out.println("		// Test de la méthode ajouterPiece() \n");
		maison.ajouterPiece(salon);
		maison.ajouterPiece(salon);
		maison.ajouterPiece(salon);
		// affichage
		for (int j = 0; j < maison.tab.length; j++) {
			System.out.println("classe : " + maison.tab[j].getClass().getName() + "  étage :  " + maison.tab[j].etage
					+ "  superficie  : " + maison.tab[j].superficie);
		}

		// Test de la méthode getSuperficieTotale()
		System.out.println("\n		// Test de la méthode getSuperficieTotale() \n");
		System.out.println(maison.calculerSurface());

		// Test de la méthode getSuperficieParEtage()
		System.out.println("\n Test de la méthode getSuperficieParEtage() \n ");
		System.out.println(maison.getSuperficieParEtage(0));
		System.out.println(maison.getSuperficieParEtage(1));
		System.out.println(maison.getSuperficieParEtage(2));
		System.out.println(maison.getSuperficieParEtage(3));
		System.out.println(maison.getSuperficieParEtage(4));
		System.out.println(maison.getSuperficieParEtage(5));
		System.out.println(maison.getSuperficieParEtage(6));
		System.out.println(maison.getSuperficieParEtage(7));
		System.out.println(maison.getSuperficieParEtage(8));
		System.out.println(maison.getSuperficieParEtage(9));
		System.out.println(maison.getSuperficieParEtage(10));

		// Test de la méthode getSuperficieParTypeDePiece()
		System.out.println("\n Test de la méthode getSuperficieParTypeDePiece() \n ");
		System.out.println(maison.getSuperficieParTypeDePiece(chambre1));
		System.out.println(maison.getSuperficieParTypeDePiece(salon));
		System.out.println(maison.getSuperficieParTypeDePiece(cuisine));
		System.out.println(maison.getSuperficieParTypeDePiece(salleDeBain));
		System.out.println(maison.getSuperficieParTypeDePiece(wc));

//		Test de la méthode getNbPiecesParTypePiece()
		System.out.println("\n Test de la méthode getNbPiecesParTypePiece() \n ");

		System.out.println(maison.getNbPiecesParTypePiece(wc));
		System.out.println(maison.getNbPiecesParTypePiece(chambre1));
		System.out.println(maison.getNbPiecesParTypePiece(salon));
		System.out.println(maison.getNbPiecesParTypePiece(cuisine));
		System.out.println(maison.getNbPiecesParTypePiece(salleDeBain));

	}

}
