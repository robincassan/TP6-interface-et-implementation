package fr.calculersurface;

public abstract class Forme implements ISurface {

//	• La classe Forme va représenter la classe mère de diverses formes géométriques.
//	o cette classe est abstraite
    @Override
    public abstract double calculerSurface();

    public abstract double calculerPerimetre();

}
