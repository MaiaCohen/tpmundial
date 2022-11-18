package tpmundial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	
		Pais qatar = new Pais ("Qatar", 0, true, "A", 0, "QAT", 0, 0, 0, 0, 0 ,0);
		Pais ecuador = new Pais ("Ecuador", 0, true, "A", 6, "ECU", 0, 0, 0, 0, 0 ,0);
		Pais senegal = new Pais ("Senegal", 0, true, "A", 3, "SEN", 0, 0, 0, 0, 0 ,0);
		Pais holanda = new Pais ("Holanda", 0, true, "A", 9, "HOL", 0, 0, 0, 0, 0 ,0);

		Pais inglaterra = new Pais ("Inglaterra", 0, true, "B", 0, "ING", 5, 0, 0, 0, 0 ,0);
		Pais iran = new Pais ("Iran", 0, true, "B", 0, "IRN", 6, 0, 0, 0, 0 ,0);
		Pais usa = new Pais ("USA", 0, true, "B", 0, "USA", 7, 0, 0, 0, 0 ,0);
		Pais gales = new Pais ("Gales", 0, true, "B", 0, "GAL", 8, 0, 0, 0, 0 ,0);

	  	Pais argentina = new Pais ("Argentina", 0, true, "C", 0, "ARG", 9, 0, 0, 0, 0 ,0);
		Pais arabia = new Pais ("Arabia Saudita", 0, true, "C", 0, "ARB", 10, 0, 0, 0, 0 ,0);
		Pais mexico = new Pais ("Mexico", 0, true, "C", 0, "MEX", 11, 0, 0, 0, 0 ,0);
		Pais polonia = new Pais ("Polonia", 0, true, "C", 0, "POL", 12, 0, 0, 0, 0 ,0);

	  	Pais francia = new Pais ("Francia", 0, true, "D", 0, "FRA", 13, 0, 0, 0, 0 ,0);
		Pais australia = new Pais ("Australia", 0, true, "D", 0, "AUS", 14, 0, 0, 0, 0 ,0);
		Pais dinamarca = new Pais ("Dinamarca", 0, true, "D", 0, "DIN", 15, 0, 0, 0, 0 ,0);
		Pais tunez = new Pais ("Tunez", 0, true, "D", 0, "TUN", 16, 0, 0, 0, 0 ,0);
	 
	 	Pais españa = new Pais ("España", 0, true, "E", 0, "ESP", 17, 0, 0, 0, 0 ,0);
		Pais costarica = new Pais ("Costa Rica", 0, true, "E", 0, "CRC", 18, 0, 0, 0, 0 ,0);
		Pais alemania = new Pais ("Alemania", 0, true, "E", 0, "ALE", 19, 0, 0, 0, 0 ,0);
		Pais japon = new Pais ("Japon", 0, true, "E", 0, "JAP", 20, 0, 0, 0, 0 ,0);

	  	Pais belgica = new Pais ("Belgica", 0, true, "F", 0, "BEL", 21, 0, 0, 0, 0 ,0);
		Pais canada = new Pais ("Canada", 0, false, "F", 0, "CAN", 22, 0, 0, 0, 0 ,0);
		Pais marruecos = new Pais ("Marruecos", 0, false, "F", 0, "MAR", 23, 0, 0, 0, 0 ,0);
		Pais croacia = new Pais ("Croacia", 0, true, "F", 0, "CRO", 24, 0, 0, 0, 0 ,0);
		
		Pais brasil = new Pais ("Brasil", 0, true, "G", 0, "BRA", 25, 0, 0, 0, 0 ,0);
		Pais serbia = new Pais ("Serbia", 0, true, "G", 0, "SER", 26, 0, 0, 0, 0 ,0);
		Pais suiza = new Pais ("Suiza", 0, true, "G", 0, "SUI", 27, 0, 0, 0, 0 ,0);
		Pais camerun = new Pais ("Camerun", 0, true, "G", 0, "CAM", 28, 0, 0, 0, 0 ,0);
		
		Pais portugal = new Pais ("Portugal", 0, true, "H", 0, "POR", 29, 0, 0, 0, 0 ,0);
		Pais ghana = new Pais ("Ghana", 0, true, "H", 0, "GHA", 30, 0, 0, 0, 0 ,0);
		Pais uruguay = new Pais ("Uruguay", 0, true, "H", 0, "URU", 31, 0, 0, 0, 0 ,0);
		Pais corea = new Pais ("Corea del Sur", 0, true, "H", 0, "COR", 32, 0, 0, 0, 0 ,0);
		
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

		
		LinkedList<Partido> partidoa = new LinkedList<>();
		LinkedList<Partido> partidob = new LinkedList<>();
		LinkedList<Partido> partidoc = new LinkedList<>();
		LinkedList<Partido> partidod = new LinkedList<>();
		LinkedList<Partido> partidoe = new LinkedList<>();
		LinkedList<Partido> partidof = new LinkedList<>();
		LinkedList<Partido> partidog = new LinkedList<>();
		LinkedList<Partido> partidoh = new LinkedList<>();
		int id;
		
		PartidosGrupo(partidoa, grupoA, id=0);
		PartidosGrupo(partidob, grupoB, id=6);
		PartidosGrupo(partidoc, grupoC, id=12);
		PartidosGrupo(partidod, grupoD, id=18);
		PartidosGrupo(partidoe, grupoE, id=24);
		PartidosGrupo(partidof, grupoF, id=30);
		PartidosGrupo(partidog, grupoG, id=36);
		PartidosGrupo(partidoh, grupoH, id=42);
		LinkedList<Partido> partidos = new LinkedList<>();
		partidos.addAll(partidoa);
		partidos.addAll(partidob);
		partidos.addAll(partidoc);
		partidos.addAll(partidod);
		partidos.addAll(partidoe);
		partidos.addAll(partidof);
		partidos.addAll(partidog);
		partidos.addAll(partidoh);
		
		
		LinkedList<Pais> grupos = new LinkedList<>();
		grupos.addAll(grupoA);
		grupos.addAll(grupoB);
		grupos.addAll(grupoC);
		grupos.addAll(grupoD);
		grupos.addAll(grupoE);
		grupos.addAll(grupoF);
		grupos.addAll(grupoG);
		grupos.addAll(grupoH);
		
		
		
		Menu(paises, octavos, cuartos, semi, finall, grupoA, partidos);
		
	}
	
		
		public static void Menu(LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Pais> cuartos, LinkedList<Pais> semi, LinkedList<Pais> finall, LinkedList<Pais> grupoA, LinkedList<Partido> partidos) { 
			Scanner entrada = new Scanner(System.in);
			System.out.println("Bienvenido al mundial de Qatar 2022");
			System.out.println("Ingrese la opcion que desea conocer");
			System.out.println("1- Equipos y partidos de los grupos");
			System.out.println("2- Posiciones de los grupos");
			System.out.println("3- Octavos de final");
			System.out.println("4- Cuartos de final");
			System.out.println("5- Semifinal");
			System.out.println("6- Final");
			int a = entrada.nextInt();
			switch (a) {
			case 1:
				String op;
				System.out.println("Ingrese el grupo del que desea ver los partidos");
				entrada.nextLine();
				op = entrada.nextLine();
				System.out.println("Los partidos del grupo " + op + " son: ");
				for (int i = 0; i < partidos.size(); i++) {
					if (partidos.get(i).getPais().getGrupo().equalsIgnoreCase(op)) {
						System.out.println(partidos.get(i));
					}
				}
				
				
				String asd;
				System.out.println("desea sajdhas");
				asd = entrada.nextLine();
				if (asd.equalsIgnoreCase("si")) {
					result(partidos, paises);
				}
				else {
					System.out.println("no hay nada para ver");
				}
				break;
			case 2:
				PosicionesGrupo(paises, grupoA);
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
		
		public static void PartidosGrupo(LinkedList<Partido> partidos, LinkedList<Pais> paises, int id)  {
			Scanner entrada = new Scanner(System.in);
			int tot=0;
			Partido partido;
			String op;
			
			for (int i = 1; i <4; i++) {
				if (tot <3) {
					id++;
					partido = new Partido(0, id, 0, paises.get(0), paises.get(i));
					partidos.add(partido);
					tot++;
					if (tot == 3) {
						i=0;
					}
				} else if (i != 1 && tot<5) {
					id++;
					partido = new Partido(0, id, 0, paises.get(1), paises.get(i));
					partidos.add(partido);
					tot++;
					if (tot == 5) {
						i=2;
					}
				} else if (i != 1 && i !=2 ) {
					id++;
					partido = new Partido(0, id, 0, paises.get(2), paises.get(i));
					partidos.add(partido);
				}
				}
			
			
			
			
		}
		
		
		
		public static void result(LinkedList<Partido> partidos, LinkedList<Pais> paises) {
			Scanner entrada = new Scanner(System.in);
			int ga, gb;
			
			System.out.println("Ingrese los resultados de los partidos del mundial");
				
				for (int j = 1; j < 4; j++) {
					System.out.println("El partido es: " + partidos.get(j-1));
					System.out.println("Ingrese los goles del Equipo A: "); 
					ga = entrada.nextInt();
					ga = paises.get(0).getGf() + ga;
					paises.get(0).setGf(ga);
					//
					System.out.println("Ingrese los goles del Equipo B: "); 
					gb = entrada.nextInt();
					gb = paises.get(j).getGf() + gb;
					paises.get(j).setGf(gb);
					if (ga>gb) {
						paises.get(0).setPuntos(paises.get(0).getPuntos()+3);
						paises.get(0).setPg(paises.get(0).getPg()+1);
					} else if (gb>ga) {
						paises.get(j).setPuntos(paises.get(j).getPuntos()+3);
						paises.get(j).setPg(paises.get(j).getPg()+1);
					} else {
						paises.get(0).setPe(paises.get(0).getPg()+1);
						paises.get(j).setPe(paises.get(j).getPg()+1);
					} 
				}
				for (int m = 2; m < 4; m++) {
					System.out.println("El partido es: " + partidos.get(m+1));
					System.out.println("Ingrese los goles del Equipo A: "); 
					ga = entrada.nextInt();
					ga = paises.get(1).getGf() + ga;
					paises.get(1).setGf(ga);
					// set ga en gf
					System.out.println("Ingrese los goles del Equipo B: "); 
					gb = entrada.nextInt();
					gb = paises.get(m).getGf() + gb;
					paises.get(m).setGf(gb);
					if (ga>gb) {
						paises.get(1).setPuntos(paises.get(1).getPuntos()+3);
						paises.get(1).setPg(paises.get(1).getPg()+1);
					} else if (gb>ga) {
						paises.get(m).setPuntos(paises.get(m).getPuntos()+3);
						paises.get(m).setPg(paises.get(m).getPg()+1);
					} else {
						paises.get(1).setPe(paises.get(1).getPg()+1);
						paises.get(m).setPe(paises.get(m).getPg()+1);
					} 
				}
				System.out.println("El partido es: " + partidos.get(5));
				System.out.println("Ingrese los goles del Equipo A: "); 
				ga = entrada.nextInt();
				ga = paises.get(2).getGf() + ga;
				paises.get(2).setGf(ga);
				// set ga en gf
				System.out.println("Ingrese los goles del Equipo B: "); 
				gb = entrada.nextInt();
				gb = paises.get(3).getGf() + gb;
				paises.get(3).setGf(gb);
				if (ga>gb) {
					paises.get(2).setPg(paises.get(2).getPg()+1);
				} else if (gb>ga) {
					paises.get(3).setPg(paises.get(3).getPg()+1);
				} else {
					paises.get(2).setPe(paises.get(2).getPe()+1);
					paises.get(3).setPe(paises.get(3).getPe()+1);
				} 
		
		}
		
	
			

			
		public static void PosicionesGrupo(LinkedList<Pais> grupos, LinkedList<Pais> grupoA) {
		
			int pais1, pais2;
			Scanner entrada = new Scanner(System.in);
			
			
			
			System.out.println("Ingrese el grupo del que desea saber las posiciones");
			String g = entrada.nextLine();
			int asd, aa, auxx;
			System.out.println("PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n " );
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase(g)) {
					/*
					for (int i = 0; i < 3; i++) {
						for (int j = 0; j < 3; j++) {
							if (grupoA.get(j).getPuntos() < grupoA.get(j+1).getPuntos() ) {
								asd = grupoA.get(j).getPuntos();
								aa = grupoA.get(j+1).getPuntos();
								auxx = asd;
								asd = aa;
								aa = auxx;
							} 
						}
					}
					*/
					System.out.println(pais.getAb() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPe() + "\t" + pais.getPp() + "\t" + pais.getGf() + "\t" + pais.getGc() );
				}
			}
			// System.out.println(grupoA);

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
