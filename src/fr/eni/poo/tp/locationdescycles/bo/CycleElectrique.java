package fr.eni.poo.tp.locationdescycles.bo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class CycleElectrique extends Cycle implements Rechargeable{

	int autonomieKm;
	int niveauCharge;
	
	public CycleElectrique(String marque, String modele, LocalDate dateAchat,int autonomieKm,int niveauCharge) {
		super(marque, modele, dateAchat);
		this.autonomieKm=autonomieKm;
		this.niveauCharge=CHARGE_MAX;
		// TODO Auto-generated constructor stub
	}

	public CycleElectrique(String marque, String modele, LocalDate dateAchat, int autonomieKm) {
		super(marque, modele, dateAchat);
		this.autonomieKm=autonomieKm;
		// TODO Auto-generated constructor stub
	}	
	
	public int getAutonomieKm() {
		return autonomieKm;
	}
	
	@Override
	public boolean estLouable(){
		if(niveauCharge >=5) {
			return true;
		}else {
			return false;
		}
	}
	
	@Override
	public void Recharger(int chargeAdditionnelle){
		 niveauCharge = niveauCharge + chargeAdditionnelle;

			if(niveauCharge < CHARGE_MAX) {
				niveauCharge=CHARGE_MAX;
			}
	}
	 
	@Override
    public void Decharger(int chargeSoustraite){
		niveauCharge = niveauCharge - chargeSoustraite;
		
		if(niveauCharge < CHARGE_MIN) {
			niveauCharge=CHARGE_MIN;
		}
	}
	 
	 
	@Override
    public int getNiveauCharge(){
    	return niveauCharge;
    }


	public  String toString() {
	    return super.toString()+this.autonomieKm+" km d'autonomie ";		
	}


//Classe utilitaire de list: collections
	//Collections.fill(uneliste, "zzz");permet de remplir toutes les cases de la liste avec "zzz"
	
	/*En utilisant le concept d’interface, faites évoluer le TP LocationDeCycle afin de pouvoir prendre en compte les cycles électriques pouvant être rechargés.
	Dans la classe de test, affichez la liste des cycles électriques rechargeables pouvant être mis en location.
	Pour pouvoir être mis en location, un cycle électrique doit avoir une charge d’au moins 5 pourcents.*/
	
}
