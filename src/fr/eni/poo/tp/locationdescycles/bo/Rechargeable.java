package fr.eni.poo.tp.locationdescycles.bo;


public interface Rechargeable  {
	
	 static final int CHARGE_MIN=0;
	 static final int CHARGE_MAX=100;
	 
	 void Recharger(int chargeAdditionnelle);
	 void Decharger(int chargeSoustraite);
     int getNiveauCharge();
     boolean estLouable();

}
