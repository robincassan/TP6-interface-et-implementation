package fr.calculersurface;

public abstract class Forme implements ISurface {

//	� La classe Forme va repr�senter la classe m�re de diverses formes g�om�triques.
//	o cette classe est abstraite
    @Override
    public abstract double calculerSurface();

    public abstract double calculerPerimetre();

}
