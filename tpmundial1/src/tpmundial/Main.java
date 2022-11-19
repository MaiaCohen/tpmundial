package tpmundial;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		
	
		Pais qatar = new Pais ("Qatar", 0, true, "A", 0, "QAT", 1, 0, 0, 0, 0 ,0);
		Pais ecuador = new Pais ("Ecuador", 0, true, "A", 0, "ECU", 2, 0, 0, 0, 0 ,0);
		Pais senegal = new Pais ("Senegal", 0, true, "A", 0, "SEN", 3, 0, 0, 0, 0 ,0);
		Pais holanda = new Pais ("Holanda", 0, true, "A", 0, "HOL", 4, 0, 0, 0, 0 ,0);

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
		LinkedList<Pais> cuartos = new LinkedList<Pais>();
		LinkedList<Pais> semi = new LinkedList<Pais>();
		LinkedList<Pais> finall = new LinkedList<Pais>();

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
		
		
		
	//	Octavos(paises, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
		//Cuartos(paises, cuartos, semi);
		//Semifinal(paises, semi, finall);
		
		Scanner entrada = new Scanner(System.in);
		int m=0;
		do {
			Menu(paises, octavos, cuartos, semi, finall, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH, partidos);
			System.out.println("Ingrese 9 para salir, cualquier otra tecla para volver al menu y continuar");
			m= entrada.nextInt();
			
		} while (m!=9);
	}
	
		
		public static void Menu(LinkedList<Pais> paises, LinkedList<Pais> octavos, LinkedList<Pais> cuartos, LinkedList<Pais> semi, LinkedList<Pais> finall, LinkedList<Pais> grupoA,  LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH, LinkedList<Partido> partidos) { 
			Scanner entrada = new Scanner(System.in);

			
			
			System.out.println("Bienvenido al mundial de Qatar 2022");
			System.out.println("Ingrese la opcion que desea conocer");
			System.out.println("Si es la primera vez que ingresa debera tocar la opcion 1 y asginar los resultados");
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
				System.out.println("Podra asignar los resultados segun le guste. Ingrese si para continuar");
				asd = entrada.nextLine();
				if (asd.equalsIgnoreCase("si")) {
					Resultados(partidos, paises);
				}
				else {
					System.out.println("No hay nada para ver");
				}
				break;
			case 2:
				System.out.println("El resultado del grupo es: ");
				pos(grupoA);
				PosicionesGrupo(paises, grupoA);
				break;
			case 3:
				Octavos(paises, octavos, cuartos, grupoA, grupoB, grupoC, grupoD, grupoE, grupoF, grupoG, grupoH);
				break;
			case 4:
				Cuartos(paises, cuartos, semi);
				break;
			case 5:
				Semifinal(paises, semi, finall);
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
		
		public static void Resultados(LinkedList<Partido> partidos, LinkedList<Pais> paises) {
			Scanner entrada = new Scanner(System.in);
			int ga, gb;
			
			System.out.println("Ingrese los resultados de los partidos del mundial");
			
			for (int i = 0; i < partidos.size(); i++) {
				System.out.println("El partido es: " + partidos.get(i));
				
				for (int j = 1; j < 4; j++) {
					System.out.println("----------------" );
					ga=0;
					gb=0;
					System.out.println("Ingrese los goles del Equipo A: "); 
					ga = entrada.nextInt();
					ga = paises.get(0).getGf() + ga;
					paises.get(0).setGf(ga);
					
					System.out.println("Ingrese los goles del Equipo B: "); 
					gb = entrada.nextInt();
					gb = paises.get(j).getGf() + gb;
					paises.get(j).setGf(gb);
					//goles en contra
					ga = paises.get(j).getGc() + ga;
					paises.get(j).setGc(ga);
					gb = paises.get(0).getGc() + gb;
					paises.get(0).setGc(gb);
					
					if (ga>gb) {
						paises.get(0).setPuntos(paises.get(0).getPuntos()+3);
						paises.get(0).setPg(paises.get(0).getPg()+1);
						paises.get(j).setPp(paises.get(j).getPp()+1);
					} else if (gb>ga) {
						paises.get(j).setPuntos(paises.get(j).getPuntos()+3);
						paises.get(j).setPg(paises.get(j).getPg()+1);
						paises.get(0).setPp(paises.get(0).getPp()+1);
					} else if (ga==gb) {
						paises.get(0).setPe(paises.get(0).getPe()+1);
						paises.get(0).setPuntos(paises.get(0).getPuntos()+1);
						paises.get(j).setPe(paises.get(j).getPe()+1);
						paises.get(j).setPuntos(paises.get(j).getPuntos()+1);
					} 
				}
				
				for (int m = 2; m < 4; m++) {
					System.out.println("----------------" );
					ga=0;
					gb=0;
					System.out.println("El partido es: " + partidos.get(m+1));
					System.out.println("Ingrese los goles del Equipo A: "); 
					ga = entrada.nextInt();
					ga = paises.get(1).getGf() + ga;
					paises.get(1).setGf(ga);
					System.out.println("Ingrese los goles del Equipo B: "); 
					gb = entrada.nextInt();
					gb = paises.get(m).getGf() + gb;
					paises.get(m).setGf(gb);
					// goles en contra
					ga = paises.get(m).getGc() + ga;
					paises.get(m).setGc(ga);
					gb = paises.get(1).getGc() + gb;
					paises.get(1).setGc(gb);
					
					if (ga>gb) {
						paises.get(1).setPuntos(paises.get(1).getPuntos()+3);
						paises.get(1).setPg(paises.get(1).getPg()+1);
						paises.get(m).setPp(paises.get(m).getPp()+1);
					} else if (gb>ga) {
						paises.get(m).setPuntos(paises.get(m).getPuntos()+3);
						paises.get(m).setPg(paises.get(m).getPg()+1);
						paises.get(1).setPp(paises.get(1).getPp()+1);
					} else if (ga==gb) {
						paises.get(1).setPe(paises.get(1).getPe()+1);
						paises.get(1).setPuntos(paises.get(1).getPuntos()+1);
						paises.get(m).setPe(paises.get(m).getPe()+1);
						paises.get(m).setPuntos(paises.get(m).getPuntos()+1);
					} 
				}
				
				ga=0;
				gb=0;
				System.out.println("----------------" );
				System.out.println("El partido es: " + partidos.get(5));
				System.out.println("Ingrese los goles del Equipo A: "); 
				ga = entrada.nextInt();
				ga = paises.get(2).getGf() + ga;
				paises.get(2).setGf(ga);
				System.out.println("Ingrese los goles del Equipo B: "); 
				gb = entrada.nextInt();
				gb = paises.get(3).getGf() + gb;
				paises.get(3).setGf(gb);
				// goles en contra
				ga = paises.get(3).getGc() + ga;
				paises.get(3).setGc(ga);
				gb = paises.get(2).getGc() + gb;
				paises.get(2).setGc(gb);
				
				if (ga>gb) {
					paises.get(2).setPuntos(paises.get(2).getPuntos()+3);
					paises.get(2).setPg(paises.get(2).getPg()+1);
					paises.get(3).setPp(paises.get(3).getPp()+1);
				} else if (gb>ga) {
					paises.get(3).setPuntos(paises.get(3).getPuntos()+3);
					paises.get(3).setPg(paises.get(3).getPg()+1);
					paises.get(2).setPp(paises.get(2).getPp()+1);
				} else if (ga==gb) {
					paises.get(2).setPe(paises.get(2).getPe()+1);
					paises.get(2).setPuntos(paises.get(2).getPuntos()+1);
					paises.get(3).setPe(paises.get(3).getPe()+1);
					paises.get(3).setPuntos(paises.get(3).getPuntos()+1);
				} 
				
			}
			}
		

		
		public static void pos(LinkedList<Pais> grupoA) {
			int max=-1, max2=-1, max3=-1, max4=-1;
			
			Pais pais1=null;
			Pais pais2=null;
			Pais pais3=null;
			Pais pais4=null;
			
			for (int i = 0; i <4; i++) {
				if (grupoA.get(i).getPuntos()>max) {
					max = grupoA.get(i).getPuntos();
					pais1 = grupoA.get(i); 
				} else if (grupoA.get(i).getPuntos() == max) {
					if (grupoA.get(i).getGf() > pais1.getGf()) {
						pais1 = grupoA.get(i);
					} else {
						pais1 = pais1;
					}
				}
			}
			for (int j = 0; j < 4; j++) {
				if (grupoA.get(j).getPuntos()>max2 && grupoA.get(j) != pais1 ) {
						max2 = grupoA.get(j).getPuntos();
						pais2= grupoA.get(j);
				} else if (grupoA.get(j).getPuntos() == max2 && grupoA.get(j) != pais1 ) {
					if (grupoA.get(j).getGf() > pais2.getGf()) {
						pais2 = grupoA.get(j);
					} else {
						pais2 = pais2;
					}
				}
			}
			for (int j2 = 0; j2 < 4; j2++) {
					if (grupoA.get(j2).getPuntos()>max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
							max3 = grupoA.get(j2).getPuntos();
							pais3= grupoA.get(j2);
					} else if (grupoA.get(j2).getPuntos() == max3 && grupoA.get(j2) != pais1 && grupoA.get(j2) != pais2) {
						if (grupoA.get(j2).getGf() > pais3.getGf()) {
							pais3 = grupoA.get(j2);
						} else {
							pais3 = pais3;
						}
					}
			}
			for (int x = 0; x < 4; x++) {
				if (grupoA.get(x) != pais1 && grupoA.get(x) != pais2 && grupoA.get(x) != pais3) {
					
					max4 = grupoA.get(x).getPuntos();
					pais4= grupoA.get(x);
				} 
				}

			grupoA.clear();
			grupoA.add(pais1);
			grupoA.add(pais2);
			grupoA.add(pais3);
			grupoA.add(pais4);
	
			System.out.println("Grupo ordenado por puntos: " + grupoA);
			
		}
		
		public static void PosicionesGrupo(LinkedList<Pais> grupos, LinkedList<Pais> grupoA) {
			int pais1, pais2;
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Ingrese el grupo del que desea saber las posiciones");
			String g = entrada.nextLine();	
			System.out.println("PAIS \t PTS \t PG \t PE \t PP \t GF \t GC \n " );
			for (Pais pais : grupos) {
				if (pais.getGrupo().equalsIgnoreCase(g)) {
					//	PAISES ORDENADOR POR PUNTOS SI O SI
					System.out.println(pais.getAb() + "\t" + pais.getPuntos() + "\t" + pais.getPg() + "\t" + pais.getPe() + "\t" + pais.getPp() + "\t" + pais.getGf() + "\t" + pais.getGc() );
				}
			}
			
		}
		
		public static void Octavos(LinkedList<Pais> paises, LinkedList<Pais> octavos,  LinkedList<Pais> cuartos, LinkedList<Pais> grupoA, LinkedList<Pais> grupoB, LinkedList<Pais> grupoC, LinkedList<Pais> grupoD, LinkedList<Pais> grupoE, LinkedList<Pais> grupoF, LinkedList<Pais> grupoG, LinkedList<Pais> grupoH ) {
			Scanner entrada = new Scanner(System.in);

			octavos.add(grupoA.get(0));
			octavos.add(grupoA.get(1));
			octavos.add(grupoB.get(0));
			octavos.add(grupoB.get(1));
			octavos.add(grupoC.get(0));
			octavos.add(grupoC.get(1));
			octavos.add(grupoD.get(0));
			octavos.add(grupoD.get(1));
			octavos.add(grupoE.get(0));
			octavos.add(grupoE.get(1));
			octavos.add(grupoF.get(0));
			octavos.add(grupoF.get(1));
			octavos.add(grupoG.get(0));
			octavos.add(grupoG.get(1));
			octavos.add(grupoH.get(0));
			octavos.add(grupoH.get(1));
			
			System.out.println("Los paises clasificados a Octavos de final son: ");
			System.out.println(octavos);
			
			int p;
			
			System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoA.get(0) + " - " + grupoB.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoA.get(0));
			} else if (p==2) {
				cuartos.add(grupoB.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoB.get(0) + " - " + grupoA.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoB.get(0));
			} else if (p==2) {
				cuartos.add(grupoC.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoC.get(0) + " - " + grupoD.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoC.get(0));
			} else if (p==2) {
				cuartos.add(grupoD.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoD.get(0) + " - " + grupoC.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoD.get(0));
			} else if (p==2) {
				cuartos.add(grupoC.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoE.get(0) + " - " + grupoF.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoE.get(0));
			} else if (p==2) {
				cuartos.add(grupoF.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoF.get(0) + " - " + grupoE.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoF.get(0));
			} else if (p==2) {
				cuartos.add(grupoE.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoG.get(0) + " - " + grupoH.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoG.get(0));
			} else if (p==2) {
				cuartos.add(grupoH.get(1));
			} else {
				System.out.println("opcion invalida");
			}
			
			System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
			System.out.println(grupoH.get(0) + " - " + grupoG.get(1));
			entrada.nextInt();
			p = entrada.nextInt();
			if (p==1) {
				cuartos.add(grupoH.get(0));
			} else if (p==2) {
				cuartos.add(grupoG.get(1));
			} else {
				System.out.println("opcion invalida");
			}

		}
		
		public static void Cuartos(LinkedList<Pais> paises, LinkedList<Pais> cuartos, LinkedList<Pais> semi ) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Los paises clasificados a Cuartos de final son: ");
		System.out.println(cuartos);
		
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(cuartos.get(0) + " - " + cuartos.get(1));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(0));
		} else if (p==2) {
			semi.add(cuartos.get(1));
		} else {
			System.out.println("opcion invalida");
		}
		
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(cuartos.get(2) + " - " + cuartos.get(3));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(2));
		} else if (p==2) {
			semi.add(cuartos.get(3));
		} else {
			System.out.println("opcion invalida");
		}
		
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(cuartos.get(4) + " - " + cuartos.get(5));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(4));
		} else if (p==2) {
			semi.add(cuartos.get(5));
		} else {
			System.out.println("opcion invalida");
		}
		
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(cuartos.get(6) + " - " + cuartos.get(7));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			semi.add(cuartos.get(6));
		} else if (p==2) {
			semi.add(cuartos.get(7));
		} else {
			System.out.println("opcion invalida");
		}

		}
		
		

		public static void Semifinal(LinkedList<Pais> paises, LinkedList<Pais> semi, LinkedList<Pais> finall) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Los paises clasificados a la Semifinal del Mudnial son: ");
		System.out.println(semi);
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(semi.get(0) + " - " + semi.get(1));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			finall.add(semi.get(0));
		} else if (p==2) {
			finall.add(semi.get(1));
		} else {
			System.out.println("opcion invalida");
		}
		
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(semi.get(0) + " - " + semi.get(1));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			finall.add(semi.get(0));
		} else if (p==2) {
			finall.add(semi.get(1));
		} else {
			System.out.println("opcion invalida");
		}
		}
		
		
		public static void Final(LinkedList<Pais> paises, LinkedList<Pais> finall) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Los paises clasificados a la final del Mudnial son: ");
		System.out.println(finall);
		int p;
		
		System.out.println("A continuacion ingresara los ganadores de cada cruce: ");
		System.out.println("Indique el ganador del cruce. /n 1-Equipo A /n 2-Equipo B");
		System.out.println(finall.get(0) + " - " + finall.get(1));
		entrada.nextInt();
		p = entrada.nextInt();
		if (p==1) {
			System.out.println("El ganador del Mundial es: " + finall.get(0));
		} else if (p==2) {
			System.out.println("El ganador del Mundial es: " + finall.get(1));
		} else {
			System.out.println("opcion invalida");
		}

		}

}
