package fr.eni.poo.tp.locationdescycles.Application;

import java.time.LocalDate;

import fr.eni.poo.tp.locationdescycles.bo.Cycle;
import fr.eni.poo.tp.locationdescycles.bo.CycleElectrique;
import fr.eni.poo.tp.locationdescycles.bo.Gyropode;
import fr.eni.poo.tp.locationdescycles.bo.Gyroroue;
import fr.eni.poo.tp.locationdescycles.bo.Velo;

public class TestLocationDesCycles {

	public static void main(String[] args) {
		LocalDate dateVelo1=LocalDate.of(2020, 4, 25);
		LocalDate dateVelo2=LocalDate.of(2021, 2, 23);
		LocalDate dateGyropode1=LocalDate.of(2020,12 , 2);
		LocalDate dateGyropode2=LocalDate.of(2020, 6, 2);
		LocalDate dateGyroroue=LocalDate.of(2021, 3, 7);

		// TODO Auto-generated method stub
		// Velo Lapierre speed 400 (1an) 27 vitesses 4,90€/heure
		Velo velo1= new Velo("Lapierre","speed 400",dateVelo1,27);
		//- Velo Btwin riverside 900 (0an) 10 vitesses 4,90€/heure
		Velo velo2= new Velo("Btwin","riverside 900",dateVelo2,10);
		//- Gyropode Segway Ninebot Elite (0an) 40 km d'autonomie [1m50 min] 29,90€/heure
		Gyropode gyropode1= new Gyropode("Segway", "Ninebot Elite",dateGyropode1,40,150);
		
		//- Gyropode Weebot Echo (1an) 35 km d'autonomie [1m60 min] 29,90€/heure
		Gyropode gyropode2= new Gyropode("Weebot", "Echo",dateGyropode2,40,160,56);
		//- Gyroroue Immotion v8 (0an) 40 km d'autonomie 18,90€/heure
		Gyroroue gyroroue1= new Gyroroue("Immotion", "v8",dateGyroroue,40,12);
		//- Gyroroue Segway Ninebot One E+ (0an) 30 km d'autonomie 18,90€/heure 	
		Gyroroue gyroroue2= new Gyroroue("Segway","Ninebot One E+",dateGyroroue,30);

		System.out.println("Voici les cycles que nous proposons à la location :");
		System.out.format("Le nombre de velo(s) loué(s) est de: %d\n",velo2.GetNombreDinstancesVelos());
		System.out.format("Le nombre de gyropode(s) loué(s) est de: %d\n",gyropode2.GetNombreDinstancesGyropodes());
		System.out.format("Le nombre de gyroroue(s) loué(s) est de: %d\n",gyroroue2.GetNombreDinstancesGyroroues());
		int nbCycles=velo2.GetNombreDinstancesVelos()+gyropode2.GetNombreDinstancesGyropodes()+gyroroue2.GetNombreDinstancesGyroroues();
		Cycle[] cyclesEnStock=new Cycle[nbCycles];
		cyclesEnStock[0]=velo1;
		cyclesEnStock[1]=velo2;
		cyclesEnStock[2]=gyropode1;
		cyclesEnStock[3]=gyropode2;
		cyclesEnStock[4]=gyroroue1;
		cyclesEnStock[5]=gyroroue2;
		
		
		for(Cycle c: cyclesEnStock) {
			// Pour chaque cycle c de mon tableau cyclesEnStock j'affiche le cycle
			System.out.println(c);
		}
		
		//Afficher la liste des cycles électriques pouvant etre rechargés et dont la batterie est au moins à 5%
		/*if(estrechargeable){
		  	if(niveauCharge>0.05) {
		  		System.out.println(cycleEl);
		  	}	  		  
 		 }*/
		gyroroue1.Decharger(20);
		gyropode2.Decharger(98);
		for(Cycle c: cyclesEnStock) {
			// Pour chaque cycle electriquec de mon tableau cyclesEnStock j'affiche le cycle
			//System.out.println(c);//Polymorphisme
			//affichage des cycles électriques louables
			
			if(c instanceof CycleElectrique) {//on verifie si le cycle d'instance est un Cycle electrique
				CycleElectrique elec = (CycleElectrique) c;//On caste le cycle général en ne le considerant que comme un cycle électrique
				
				//charge > 5

				if(elec.getNiveauCharge() >= 5) {
					System.out.println("Cycle electriques louable");
					System.out.println(elec);
					System.out.format("Le niveau de charge est de %d ",elec.getNiveauCharge());
				}
				
			}
		}
				
		/*L'équivalent de la boucle du dessus en détail
		 System.out.println(velo1);
		System.out.println(velo2);
		System.out.println(gyropode1);
		System.out.println(gyropode2);
		System.out.println(gyroroue1);
		System.out.println(gyroroue2);*/
		

	}

}
