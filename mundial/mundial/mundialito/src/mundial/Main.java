package mundial;

import java.util.LinkedList;



public class Main {

	public static void main(String[] args) {
	

		Pais qatar = new Pais ("Qatar", 0, true, "A");
		Pais ecuador = new Pais ("Ecuador", 0, true, "A");
		Pais senegal = new Pais ("Senegal", 0, true, "A");
		Pais holanda = new Pais ("Netherlands", 0, true, "A");

		Pais inglaterra = new Pais ("Inglaterra", 0, true, "B");
		Pais iran = new Pais ("Iran", 0, true, "B");
		Pais usa = new Pais ("USA", 0, true, "B");
		Pais gales = new Pais ("Gales", 0, true, "B");

		

	  	Pais argentina = new Pais ("Argentina", 0, true, "C");
		Pais arabia = new Pais ("Arabia Saudita", 0, true, "C");
		Pais mexico = new Pais ("Mexico", 0, true, "C");
		Pais polonia = new Pais ("Polonia", 0, true, "C");



	  	Pais francia = new Pais ("Francia", 0, true, "D");
		Pais australia = new Pais ("Australia", 0, true, "D");
		Pais dianamarca = new Pais ("Dinamarca", 0, true, "D");
		Pais tunez = new Pais ("Tunez", 0, true, "D");

	 
	 	Pais espa�a = new Pais ("Espa�a", 0, true, "E");
		Pais costarica = new Pais ("Costa Rica", 0, true, "E");
		Pais alemania = new Pais ("Alemania", 0, true, "E");
		Pais japon = new Pais ("Japon", 0, true, "E");

	  	Pais belgica = new Pais ("Belgica", 0, true, "F");
		Pais canada = new Pais ("Canada", 0, true, "F");
		Pais marruecos = new Pais ("Marruecos", 0, true, "F");
		Pais croacia = new Pais ("Croacia", 0, true, "F");
		
		Pais brasil = new Pais ("Brasil", 0, true, "G");
		Pais serbia = new Pais ("Serbia", 0, true, "G");
		Pais suiza = new Pais ("Suiza", 0, true, "G");
		Pais camerun = new Pais ("Camerun", 0, true, "G");
		
		Pais portugal = new Pais ("Portugal", 0, true, "H");
		Pais ghana = new Pais ("Ghana", 0, true, "H");
		Pais uruguay = new Pais ("Uruguay", 0, true, "H");
		Pais corea = new Pais ("Corea del Sur", 0, true, "H");
		
		
		LinkedList<	Pais> grupoA = new LinkedList<Pais>();
		grupoA.add(qatar);
		grupoA.add(ecuador);
		grupoA.add(senegal);
		grupoA.add(holanda);
	
		LinkedList<	Pais> grupoB = new LinkedList<Pais>();
		grupoB.add(inglaterra);
		grupoB.add(iran);
		grupoB.add(usa);
		grupoB.add(gales);

		LinkedList<	Pais> grupoC = new LinkedList<Pais>();
		grupoC.add(argentina);
		grupoC.add(arabia);
		grupoC.add(mexico);
		grupoC.add(polonia);
		
		LinkedList<	Pais> grupoD = new LinkedList<Pais>();
		grupoD.add(francia);
		grupoD.add(australia);
		grupoD.add( dianamarca);
		grupoD.add(tunez);
		
		LinkedList<	Pais> grupoE = new LinkedList<Pais>();
		grupoE.add(espa�a);
		grupoE.add(costarica);
		grupoE.add(alemania);
		grupoE.add(japon);
		
		LinkedList<	Pais> grupoF = new LinkedList<Pais>();
		grupoF.add(belgica);
		grupoF.add(canada);
		grupoF.add(marruecos);
		grupoF.add(croacia);
		
		LinkedList<	Pais> grupoG = new LinkedList<Pais>();
		grupoG.add(brasil);
		grupoG.add(serbia);
		grupoG.add(suiza);
		grupoG.add(camerun);
		
		LinkedList<	Pais> grupoH = new LinkedList<Pais>();
		grupoH.add(portugal);
		grupoH.add(ghana);
		grupoH.add(uruguay);
		grupoH.add(corea);
		
		
	}

}
