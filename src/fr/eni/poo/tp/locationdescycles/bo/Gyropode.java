package fr.eni.poo.tp.locationdescycles.bo;

import java.time.LocalDate;

public class Gyropode extends CycleElectrique {

	 private int tailleMinimale;
	 private static final float TARIF_LOCATION=29.9f;
	 private int nbMetres;
	 private int nbCentimetres;
	 private static int nbGyropodes=0;
	
	 
	public int getTailleMinimale() {
		return tailleMinimale;
	}

	public static float getTarifLocation() {
		return TARIF_LOCATION;
	}

	public int getNbMetres() {
		return nbMetres;
	}

	public int getNbCentimetres() {
		return nbCentimetres;
	}

	public static int getNbGyropodes() {
		return nbGyropodes;
	}

	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomieKm,int tailleMinimale) {
		super(marque, modele, dateAchat, autonomieKm);
		this.tailleMinimale=tailleMinimale;
		nbMetres=tailleMinimale/100;
		nbCentimetres=tailleMinimale%100;		
		nbGyropodes++;
		// TODO Auto-generated constructor stub
	}

	public Gyropode(String marque, String modele, LocalDate dateAchat, int autonomieKm,int tailleMinimale,int niveauCharge) {
		super(marque, modele, dateAchat, autonomieKm, niveauCharge);
		this.tailleMinimale=tailleMinimale;
		nbMetres=tailleMinimale/100;
		nbCentimetres=tailleMinimale%100;		
		nbGyropodes++;
		// TODO Auto-generated constructor stub
	}

	public int GetNombreDinstancesGyropodes() {
		return(nbGyropodes);
	}
	
	
	@Override
	public String toString() {
		return " - Gyropode "+super.toString()+"["+this.nbMetres+"m"+this.nbCentimetres+" min]    "+String.format("%.02f", TARIF_LOCATION)+"€/heure";	
	}

}
