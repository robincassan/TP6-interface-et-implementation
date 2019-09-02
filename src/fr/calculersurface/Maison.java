package fr.calculersurface;

public class Maison implements ISurface {
    Piece[] tab;

    public Maison(Piece[] tab) {
        this.tab = tab;
    }

    public Piece[] getTab() {
        return tab;
    }

    public void setTab(Piece[] tab) {
        this.tab = tab;
    }

    public void ajouterPiece(Piece piece) {
        Piece[] tab2 = new Piece[tab.length + 1];
        for (int i = 0; i < tab.length; i++) {
            tab2[i] = tab[i];
        }
        tab2[tab.length] = piece;
        tab = tab2;
    }

    @Override
    public double calculerSurface() {
        double superficieTot = 0;
        for (int i = 0; i < tab.length; i++) {
            superficieTot += tab[i].superficie;
        }
        return superficieTot;

    }

    double getSuperficieParEtage(int etage) {
        double superficieParEtage = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].etage == etage) {
                superficieParEtage += tab[i].superficie;
            }
        }
        return superficieParEtage;
    }

//	@Override
//	public String toString() {
//		return "Maison [tab=" + Arrays.deepToString(tab) + "]";
//	}

    double getSuperficieParTypeDePiece(Piece type) {

        double superficieParTypeDePiece = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getClass().equals(type.getClass())) {
                superficieParTypeDePiece += tab[i].superficie;
            }
        }
        return superficieParTypeDePiece;
    }

    int getNbPiecesParTypePiece(Piece type) {
        int nbPiecesParTypePiece = 0;
        for (int i = 0; i < tab.length; i++) {
            if (tab[i].getClass().equals(type.getClass())) {
                nbPiecesParTypePiece++;
            }
        }
        return nbPiecesParTypePiece;
    }

}
