package fr.calculersurface;

public class Cercle extends Forme {
double rayon;

public Cercle(double rayon) {
	this.rayon = rayon;
}
public double getRayon() {
	return rayon;
}

public void setRayon(double rayon) {
	this.rayon = rayon;
}


@Override
public double calculerSurface() {
	// TODO Auto-generated method stub
	return Math.PI*this.rayon*this.rayon;
}

@Override
public double calculerPerimetre() {
	// TODO Auto-generated method stub
	return 2*Math.PI*this.rayon;
} 

}
