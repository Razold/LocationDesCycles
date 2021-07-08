package fr.eni.poo.tp.locationdescycles.bo;


import java.time.LocalDate;
import java.time.Period;

public abstract class Cycle {
	protected String marque;
	protected String modele;
	protected LocalDate dateAchat;
	
	
	
	public Cycle(String marque, String modele, LocalDate dateAchat) {
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
	}
	public String getMarque() {
		return marque;
	}
	public String getModele() {
		return modele;
	}
	public LocalDate getDateAchat() {
		return dateAchat;
	}
	public int nombreAnneesDetention(LocalDate dateAchat){
		LocalDate dateActuelle=java.time.LocalDate.now();
		Period dureeRestante=Period.between(dateAchat, dateActuelle);
		
		//LocalDate dureeRestante=dateActuelle-dateAchat;//On peut faire ça aussi avec getDateAchat.until
		//utilser pour cela le package java.time.temporal.ChronoUnit
		int nbAnnees=dureeRestante.getYears();
		return nbAnnees;
	}
	
	public  String toString() {

			return this.marque+" "+this.modele+" ("+nombreAnneesDetention(dateAchat)+"an) ";		

	}
}
