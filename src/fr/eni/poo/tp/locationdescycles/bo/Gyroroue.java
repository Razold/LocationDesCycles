package fr.eni.poo.tp.locationdescycles.bo;

import java.time.LocalDate;

public class Gyroroue extends CycleElectrique {

	private static final float TARIF_LOCATION=18.9f;
	private static int nbGyroroues=0;
	
	 public static float getTarifLocation() {
		return TARIF_LOCATION;
	}

	public static int getNbGyroroues() {
		return nbGyroroues;
	}

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomieKm) {
		super(marque, modele, dateAchat, autonomieKm);
		nbGyroroues++;
		// TODO Auto-generated constructor stub
	}

	public Gyroroue(String marque, String modele, LocalDate dateAchat, int autonomieKm,int niveauCharge) {
		super(marque, modele, dateAchat, autonomieKm, niveauCharge);
		nbGyroroues++;
		// TODO Auto-generated constructor stub
	}
		public int GetNombreDinstancesGyroroues() {
			return nbGyroroues;
		}
			 
	@Override
	public String toString() {
		return " - Gyroroue "+super.toString()+"             "+String.format("%.02f", TARIF_LOCATION)+"€/heure";	
	}

}
