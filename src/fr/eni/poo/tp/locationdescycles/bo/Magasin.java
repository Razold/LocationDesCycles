package fr.eni.poo.tp.locationdescycles.bo;

public class Magasin {


		private Cycle[] cyclesEnstock;// association entre Magasin ---- 0..6 -> Cycle

		public Magasin(Cycle[] cyclesEnstock) {
			super();
			this.cyclesEnstock = cyclesEnstock;
		}

		public Cycle[] getCyclesEnstock() {
			return cyclesEnstock;
		}

		public void setCyclesEnstock(Cycle[] cyclesEnstock) {
			this.cyclesEnstock = cyclesEnstock;
		}
		
		// TODO Auto-generated constructor stub	
}
