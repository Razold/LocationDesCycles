package fr.eni.poo.tp.locationdescycles.bo;


import java.time.LocalDate;

public class Velo extends Cycle{
	
	private int nbVitesses;
	private static final float TARIF_LOCATION=4.9f;
	private static int nbVelos=0;

	public int getNbVitesses() {
		return nbVitesses;
	}

	public static int getNbVelos() {
		return nbVelos;
	}

	public Velo(String marque, String modele, LocalDate dateAchat, int nbVitesses) {
		super(marque, modele, dateAchat);
		this.nbVitesses=nbVitesses;
		nbVelos++;
		// TODO Auto-generated constructor stub
	}
	
	public int GetNombreDinstancesVelos() {
		return(nbVelos);
	}
	
	public String toString() {
		//return " - Velo "+this.marque+" "+this.modele+" ("+nombreAnneesDetention(dateAchat)+"an) "+this.nbVitesses+" vitesses			        "+String.format("%.02f", TARIF_LOCATION)+"€/heure";		
		return " - Velo "+super.toString()+this.nbVitesses+" vitesses			        "+String.format("%.02f", TARIF_LOCATION)+"€/heure";		
	}
}
