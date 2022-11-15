
import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	
		Pais qatar = new Pais ("Qatar", 0, false, "A", 7, "QAT", 1, 0, 0);
		Pais ecuador = new Pais ("Ecuador", 0, true, "A", 10, "ECU", 2, 0, 0);
		Pais senegal = new Pais ("Senegal", 0, false, "A", 3, "SEN", 3, 0, 0);
		Pais holanda = new Pais ("Holanda", 0, true, "A", 1, "HOL", 4, 0, 0);

		Pais inglaterra = new Pais ("Inglaterra", 0, true, "B", 0, "ING", 5, 0, 0);
		Pais iran = new Pais ("Iran", 0, false, "B", 0, "IRN", 6, 0, 0);
		Pais usa = new Pais ("USA", 0, true, "B", 0, "USA", 7, 0, 0);
		Pais gales = new Pais ("Gales", 0, false, "B", 0, "GAL", 8, 0, 0);

	  	Pais argentina = new Pais ("Argentina", 0, true, "C", 0, "ARG", 9, 0, 0);
		Pais arabia = new Pais ("Arabia Saudita", 0, false, "C", 0, "ARB", 10, 0, 0);
		Pais mexico = new Pais ("Mexico", 0, false, "C", 0, "MEX", 11, 0, 0);
		Pais polonia = new Pais ("Polonia", 0, true, "C", 0, "POL", 12, 0, 0);

	  	Pais francia = new Pais ("Francia", 0, true, "D", 0, "FRA", 13, 0, 0);
		Pais australia = new Pais ("Australia", 0, false, "D", 0, "AUS", 14, 0, 0);
		Pais dinamarca = new Pais ("Dinamarca", 0, true, "D", 0, "DIN", 15, 0, 0);
		Pais tunez = new Pais ("Tunez", 0, false, "D", 0, "TUN", 16, 0, 0);
	 
	 	Pais españa = new Pais ("España", 0, true, "E", 0, "ESP", 17, 0, 0);
		Pais costarica = new Pais ("Costa Rica", 0, false, "E", 0, "CRC", 18, 0, 0);
		Pais alemania = new Pais ("Alemania", 0, true, "E", 0, "ALE", 19, 0, 0);
		Pais japon = new Pais ("Japon", 0, false, "E", 0, "JAP", 20, 0, 0);

	  	Pais belgica = new Pais ("Belgica", 0, true, "F", 0, "BEL", 21, 0, 0);
		Pais canada = new Pais ("Canada", 0, false, "F", 0, "CAN", 22, 0, 0);
		Pais marruecos = new Pais ("Marruecos", 0, false, "F", 0, "MAR", 23, 0, 0);
		Pais croacia = new Pais ("Croacia", 0, true, "F", 0, "CRO", 24, 0, 0);
		
		Pais brasil = new Pais ("Brasil", 0, true, "G", 0, "BRA", 25, 0, 0);
		Pais serbia = new Pais ("Serbia", 0, false, "G", 0, "SER", 26, 0, 0);
		Pais suiza = new Pais ("Suiza", 0, true, "G", 0, "SUI", 27, 0, 0);
		Pais camerun = new Pais ("Camerun", 0, false, "G", 0, "CAM", 28, 0, 0);
		
		Pais portugal = new Pais ("Portugal", 0, true, "H", 0, "POR", 29, 0, 0);
		Pais ghana = new Pais ("Ghana", 0, false, "H", 0, "GHA", 30, 0, 0);
		Pais uruguay = new Pais ("Uruguay", 0, true, "H", 0, "URU", 31, 0, 0);
		Pais corea = new Pais ("Corea del Sur", 0, false, "H", 0, "COR", 32, 0, 0);
		
		LinkedList<Pais> paises = new LinkedList <Pais>();
		paises.add(qatar);
		paises.add(ecuador);
		paises.add(senegal);
		paises.add(holanda);
		paises.add(inglaterra);
		paises.add(usa);
		paises.add(iran);
		paises.add(gales);
		paises.add(españa);
		paises.add(alemania);
		paises.add(costarica);
		paises.add(japon);
		paises.add(belgica);
		paises.add(canada);
		paises.add(marruecos);
		paises.add(croacia);
		paises.add(argentina);
		paises.add(arabia);
		paises.add(mexico);
		paises.add(polonia);
		paises.add(francia);
		paises.add(australia);
		paises.add(dinamarca);
		paises.add(tunez);
		paises.add(brasil);
		paises.add(serbia);
		paises.add(suiza);
		paises.add(camerun);
		paises.add(portugal);
		paises.add(ghana);
		paises.add(uruguay);
		paises.add(corea);

		
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
		grupoD.add( dinamarca);
		grupoD.add(tunez);
		
		LinkedList<	Pais> grupoE = new LinkedList<Pais>();
		grupoE.add(españa);
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
		
		
		LinkedList<Pais> octavos = new LinkedList<Pais>();
		octavos.add(ecuador);
		octavos.add(holanda);
		octavos.add(inglaterra);
		octavos.add(usa);
		octavos.add(argentina);
		octavos.add(polonia);
		octavos.add(francia);
		octavos.add(dinamarca);
		octavos.add(uruguay);
		octavos.add(brasil);
		octavos.add(portugal);
		octavos.add(belgica);
		octavos.add(croacia);
		octavos.add(alemania);
		octavos.add(españa);
		octavos.add(suiza);
		
		
		LinkedList<Pais> cuartos = new LinkedList<Pais>();
		cuartos.add(holanda);
		cuartos.add(inglaterra);
		cuartos.add(argentina);
		cuartos.add(francia);
		cuartos.add(brasil);
		cuartos.add(portugal);
		cuartos.add(belgica);
		cuartos.add(españa);
		
		
		LinkedList<Pais> semi = new LinkedList<Pais>();
		semi.add(argentina);
		semi.add(francia);
		semi.add(brasil);	
		semi.add(belgica);
		
		
		LinkedList<Pais> finall = new LinkedList<Pais>();
		finall.add(argentina);
		finall.add(francia);

		
		
		Menu(paises, octavos, cuartos, semi, finall);
		}
	
		
		public static void Menu(LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Pais> cuartos, LinkedList<Pais> semi, LinkedList<Pais> finall ) { 
			Scanner entrada = new Scanner(System.in);
			System.out.println("Bienvenido al mundial de Qatar 2022");
			System.out.println("Ingrese la opcion que desea conocer");
			System.out.println("2- Equipos y partidos de los grupos");
			System.out.println("2- Posiciones de los grupos");
			System.out.println("3- Octavos de final");
			System.out.println("4- Cuartos de final");
			System.out.println("5- Semifinal");
			System.out.println("6- Final");
			int a = entrada.nextInt();
			
			switch (a) {
			case 1:
				//partidos entre si
				break;
			case 2:
				PosicionesGrupo(paises);
				break;
			case 3:
				Octavos(paises, octavos);
				break;
			case 4:
				Cuartos(paises, cuartos);
				break;
			case 5:
				Semifinal(paises, semi);
				break;
			case 6:
				Final(paises, finall);
				break;
			default:
				break;
			}
		
		
		}
		
		public static void PartidosGrupo(Pais pais, LinkedList<Pais> paises)  {
			int tot=0;
			
			for (int i = 0; i <=4; i++) {
				if (pais.getId() != 0) {
					i = pais.getId() ;
					tot++;
				}
				if (tot != 3 && ) {
					
				} else {
					
				}
				}
		}
		
		public static void PosicionesGrupo(LinkedList<Pais> grupos) {
			int max = 0;
			int max2=0;
			int pais1, pais2;
			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingrese el grupo del que desea saber las posiciones");
			String g = entrada.nextLine();
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase(g)) {
					if (pais.getPuntos()>max) {
						max = pais.getPuntos();
						pais1 = pais.getId();
					} else if (pais.getPuntos()>max2) {
						max2 = pais.getPuntos();
						pais2= pais.getId();
					}
					System.out.println("PAIS \t PTS \t GF \t GC \n " + pais.getAb() + "\t" + pais.getPuntos() + "\t" + pais.getGf() + "\t" + pais.getGc() );
				}
			}

		}
		public static void Octavos(LinkedList<Pais> paises, LinkedList<Pais> octavos) {
			System.out.println("Los paises clasificados a Octavos de final son: ");
			System.out.println(octavos);
			
		/*	Iterator<Pais> paisesIter = paises.listIterator();
			while(paisesIter.hasNext()) {
				boolean i = paisesIter.next().isClasif();
					if(i == false) { 
					paisesIter.remove();
					}
				}
			System.out.println(paises);
		*/		
		}
		
		public static void Cuartos(LinkedList<Pais> paises, LinkedList<Pais> cuartos ) {
		System.out.println("Los paises clasificados a Cuartos de final son: ");
		System.out.println(cuartos);
		
		/*	Iterator<Pais> paisesIter = paises.listIterator();
		while(paisesIter.hasNext()) {
			boolean i = paisesIter.next().isClasif();
				if(i == false) { 
				paisesIter.remove();
				}
			}
		System.out.println(paises);	
		*/	
		}
		
		

		public static void Semifinal(LinkedList<Pais> paises, LinkedList<Pais> semi) {
		System.out.println("Los paises clasificados a la Semifinal del Mudnial son: ");
		System.out.println(semi);
		/* Iterator<Pais> paisesIter = paises.listIterator();
		
		while(paisesIter.hasNext()) {
			boolean i = paisesIter.next().isClasif();
				if(i == false) { 
					paisesIter.remove();
				}
			}
		
		System.out.println(paisesIter);	
		*/
		}
		
		
		public static void Final(LinkedList<Pais> paises, LinkedList<Pais> finall) {
			

		System.out.println("Los paises clasificados a la final del Mudnial son: ");
		System.out.println(finall);
		/* Iterator<Pais> paisesIter = paises.listIterator();
		while(paisesIter.hasNext()) {
			boolean i = paisesIter.next().isClasif();
				if(i == false) { 
						paisesIter.remove();
				}
			}
		System.out.println(paises);	
		*/	
		}
	
	

		public static void Campeon(LinkedList<Pais> paises) {
		//	System.out.println("El campeon del Mundial de Qatar 2022 es: " +  );
		}
		
		
		
		
		
		/*	
		public static void Octavos(Pais pais) {
			System.out.println("Los paises clasificados a Octavos de final son: ");
			
			if (pais.getClasif==true) {
				
			}
			
		}
			/*		
			switch (g.toLowerCase()) { 
			case "a":
				System.out.println("Los paises del grupo A son: " + imprimir(grupoA);
				break;
			case "b":
				
				break;
			case "c":
	
				break;
			case "d":
	
				break;
			case "e":
	
				break;
			case "f":
	
				break;
			case "g":
	
				break;
			case "h":
	
				break;
			case "i":
	
				break;
			case "j":
	
				break;
			case "k":
	
				break;

			default:
				break;
			}
		}
		*/
		

		
		
		
		
		
		
		
		
		
		
}
