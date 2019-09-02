package fr.calculersurface;

public class Rectangle extends Forme{
	double longueur; 
	double largeur; 
	
	public Rectangle(double longueur, double largeur) {
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double calculerSurface() {
		// TODO Auto-generated method stub
		return this.largeur*this.longueur;
	}

	@Override
	public double calculerPerimetre() {
		// TODO Auto-generated method stub
		return 2*(longueur+ largeur);
	}

	public double getLongueur() {
		return longueur;
	}

	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	public double getLargeur() {
		return largeur;
	}

	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

	
}
