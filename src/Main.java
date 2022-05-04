import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	/**
	 * 
	 * Programa de simulación de combate con personajes de Street Fighter.
	 * 
	 * El programa funciona con la clase `Personaje´, del cual se crea un Array de 8
	 * posiciones para los 8 personajes.
	 * 
	 * Se toma varios atributos a escoger de los personajes
	 * 
	 * String Name -> nombre del personaje. String country -> pais del personaje.
	 * String history -> historia del personaje. String height -> altura del
	 * personaje. String weight -> peso del personaje. String colorHead -> color de
	 * cabello del personaje. String clothing -> ropa del personaje. String stage ->
	 * escenario de combate del personaje. double life -> vida del personaje. double
	 * speed -> velocidad del personaje(No se tuvo en cuenta este parametro debido a
	 * su metodo combate que da uso de la aleatoriedad). double strength -> fuerza
	 * del personaje. double slowKick -> ataque del personaje, patada lenta. double
	 * fastKick -> ataque del personaje, patada rapido. double slowPunch -> ataque
	 * del personaje, puñetazo lento. double fastPunch -> ataque del personaje,
	 * puñetazo rapido. double slowGrip -> ataque del personaje, agarre lento.
	 * double fastGrip -> ataque del personaje, agarre rapido. String nameSA1 ->
	 * nombre del ataque especial 1 del personaje. double specialAttack1 -> ataque
	 * especial 1 del personaje. String nameSA2 -> nombre del ataque especial 2 del
	 * personaje. double specialAttack2 -> ataque especial 2 del personaje. String
	 * nameSA3 -> nombre del ataque especial 3 del personaje. double specialAttack3
	 * -> ataque especial 3 del personaje. double defense -> defensa del personaje.
	 * 
	 * El daño del ataque dependerá de la fuerza del personaje
	 * 
	 * Valores de Fuerza: 1-10 El valor de la fuerza multiplica el valor del daño
	 * 
	 * El daño viene determinado por el tipo de ataque
	 * 
	 * Puño rápido – Daño x0.3 Puño lento – Daño x0.7 Patada rápida– Daño x0.5
	 * Patada lenta– Daño x1 Agarre rápido – Daño x3 Agarre lento – Daño x5 Ataque
	 * especial 1 – Daño x1.5 Ataque especial 2 – Daño x2 Ataque especial 3 – Daño
	 * x3
	 * 
	 * @author Rafael
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Scanner sn = new Scanner(System.in);

		int opc1 = 0;
		int opc2 = 0;

		// Datos a introducir en Arrays de doble, String y personajes.
		Personaje[] personajes = new Personaje[8];
		String[] names = { "Ryu", "E.Honda", "Blanka", "Guile", "Ken", "Chun-Li", "Zangief", "Dhalsim" };
		String[] countrys = { "Japan", "Japan", "Brazil", "EE.UU", "EE.UU", "China", "Soviet Union", "India" };
		String[] historys = { "Karateka japonés que trata de perfeccionar todas sus habilidades.",
				"Luchador de sumo venido desde Japón.",
				"Mutante con forma de bestia que creció en la jungla de Brasil.",
				"Antiguo miembro militar estadounidense.", "Rival de Ryu, originario de los Estados Unidos.",
				"Artista marcial china que trabaja para la Interpol.",
				"un luchador profesional de la (antigua) Unión Soviética.", "Maestro de yoga de India." };
		String[] heights = { "180 cm", "185 cm", "192 cm", "182 cm", "180.3 cm", "170 cm", "214 cm", "176 cm" };
		String[] weights = { "76 kg", "137 kg", "98 kg", "99 kg", "77 kg", "Secret", "115 kg", "48 kg" };
		String[] colorHeads = { "Black", "Black", "Orange", "Blonde", "Yellow", "Brown", "Black", "bald" };
		String[] clothings = { "rojo", "azul", "verde", "amarillo", "naranja", "morado", "negro", "turquesa" };
		String[] stages = { "Japan", "Japan", "Brazil", "EE.UU", "EE.UU", "China", "Soviet Union", "India" };
		double[] lifes = { 100, 100, 100, 100, 100, 100, 100, 100 };
		double[] speeds = { 3.4, 3, 8.7, 5.9, 9.8, 3.9, 10, 4.5 };
		double[] strengths = { 8, 5, 8, 10, 4, 5, 3.3, 9.3 };
		double[] slowKicks = { 1, 1, 1, 1, 1, 1, 1, 1 };
		double[] fastKicks = { 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5 };
		double[] slowPunchs = { 0.7, 0.7, 0.7, 0.7, 0.7, 0.7, 0.7, 0.7 };
		double[] fastPunchs = { 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3, 0.3 };
		double[] slowGrips = { 5, 5, 5, 5, 5, 5, 5, 5 };
		double[] fastGrips = { 3, 3, 3, 3, 3, 3, 3, 3 };
		String[] nameSA1s = { "Hadoken", "Hundred Hand Slap", "Electric Thunder", "Sonic Boom", "Hadoken",
				"Hyakuretsukyaku", "Spinning Piledriver", "Yoga Fire" };
		double[] specialAttacks1 = { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5 };
		String[] nameSA2s = { "Shoryuken", "Sumo Headbutt", "Rolling Attack", "Flash Kick", "Shakunetsu Hadoken",
				"Kikoken", "Flying Stomach", "Yoga Flame" };
		double[] specialAttacks2 = { 2, 2, 2, 2, 2, 2, 2, 2 };
		String[] nameSA3s = { "Tatsumaki Senpukyaku", "Sumo Smash", "Vertical Roll", "Opening Gambit", "Shoryuken",
				"Hazanshu", "Banishing Flat", "Yoga Blast" };
		double[] specialAttacks3 = { 3, 3, 3, 3, 3, 3, 3, 3 };
		double[] defenses = { 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5, 1.5 };

		Main.setUpCharacter(personajes, names, countrys, historys, heights, weights, colorHeads, clothings, stages,
				lifes, speeds, strengths, slowKicks, fastKicks, slowPunchs, fastPunchs, slowGrips, fastGrips, nameSA1s,
				specialAttacks1, nameSA2s, specialAttacks2, nameSA3s, specialAttacks3, defenses);
		boolean ok = false;

		// bucle que no finaliza si el booleano ok es igual a true.
		while (ok != true) {
			System.out.println("Selecciona el personaje 1");
			// metodo que devuelve el menu de seleccion.
			System.out.println(Main.menu());
			opc1 = sn.nextInt();
			// if que comprueba que selecciona una opcion correcta, si opc es mayor o igual
			// que 1 y menor de 9, si no es asi avisara de un error y volvera a pedir la
			// opcion. El int opc1 se resta 1 para la posicion del array de personajes.
			if (opc1 >= 1 && opc1 < 9) {
				opc1--;
				ok = true;
			} else {
				System.out.println("elige un personaje de la lista.");
			}
		}

		ok = false;
		// bucle que no finaliza si el booleano ok es igual a true.
		while (ok != true) {

			System.out.println("Selecciona el personaje 2");
			// metodo que devuelve el menu de seleccion.
			System.out.println(Main.menu());
			opc2 = sn.nextInt();
			// if que comprueba que selecciona una opcion correcta, si opc es mayor o igual
			// que 1 y menor de 9, si no es asi avisara de un error y volvera a pedir la
			// opcion. El int opc2 se resta 1 para la posicion del array de personajes.
			if (opc2 >= 1 && opc2 < 9) {
				opc2--;
				ok = true;
			} else {
				System.out.println("elige un personaje de la lista.");
			}
		}

		// Systems que muestra los personajes seleccionados, sus respetivas vidas y
		// escenario del personaje 1.
		System.out.println(personajes[opc1].getName() + " VS " + personajes[opc2].getName());
		System.out.println("Life: " + personajes[opc1].getLife() + " " + personajes[opc2].getLife());
		System.out.println("Scenario: " + personajes[opc1].getStage());

		// metodo que simula el combate.
		Main.combat(personajes, opc1, opc2);

	}

	/**
	 * Metodo que genera el menu de seleccion de personajes.
	 * 
	 * @return devuelve un String del menu para seleccionar personaje.
	 * @author Rafael
	 */

	public static String menu() {
		return "1. Ryu\r\n" + "2. E. Honda\r\n" + "3. Blanka\r\n" + "4. Guille\r\n" + "5. Ken\r\n" + "6. Chun-Li\r\n"
				+ "7. Zangief\r\n" + "8. Dhalsim";
	}// Cierre del constructor.

	/**
	 * Metodo que genera los personajes, pasamos todos los datos al metodo para
	 * posterior añadirlos al array de personajes del objeto Personaje
	 * 
	 * 
	 * @param personajes      Array en el que se añadiran los personajes.
	 * @param names           Array de String con nombre de personajes para añadir
	 *                        al array de personajes.
	 * @param countrys        Array de String con paises para añadir al array de
	 *                        personajes.
	 * @param historys        Array de String con paises para añadir al array de
	 *                        personajes.
	 * @param heights         Array de String con altura para añadir al array de
	 *                        personajes.
	 * @param weights         Array de String con peso para añadir al array de
	 *                        personajes.
	 * @param colorHeads      Array de String con colores de pelo para añadir al
	 *                        array de personajes.
	 * @param clothings       Array de String con nombre de ropas para añadir al
	 *                        array de personajes.
	 * @param stages          Array de String con nombre de escenarios para añadir
	 *                        al array de personajes.
	 * @param lifes           Array de double con vida de los personajes para añadir
	 *                        al array de personajes.
	 * @param speeds          Array de double con velocidad para añadir al array de
	 *                        personajes.
	 * @param strengths       Array de double con velocidad para añadir al array de
	 *                        personajes.
	 * @param slowKicks       Array de double con valor de patadas lentas para
	 *                        añadir al array de personajes.
	 * @param fastKicks       Array de double con valor de patadas rapidas para
	 *                        añadir al array de personajes.
	 * @param slowPunchs      Array de double con valor de puñetazos lentas para
	 *                        añadir al array de personajes.
	 * @param fastPunchs      Array de double con valor de puñetazos rapidos para
	 *                        añadir al array de personajes.
	 * @param slowGrips       Array de double con valor de agarre lento para añadir
	 *                        al array de personajes.
	 * @param fastGrips       Array de double con valor de agarre rapido para añadir
	 *                        al array de personajes.
	 * @param nameSA1s        rray de String con nombre del ataque especial 1 para
	 *                        añadir al array de personajes.
	 * @param specialAttacks1 Array de double con valor ataque especial 1 para
	 *                        añadir al array de personajes.
	 * @param nameSA2s        rray de String con nombre del ataque especial 2 para
	 *                        añadir al array de personajes.
	 * @param specialAttacks2 Array de double con valor ataque especial 2 para
	 *                        añadir al array de personajes.
	 * @param nameSA3s        rray de String con nombre del ataque especial 3 para
	 *                        añadir al array de personajes.
	 * @param specialAttacks3 Array de double con valor ataque especial 3 para
	 *                        añadir al array de personajes.
	 * @param defenses        Array de double con valor de defensa para añadir al
	 *                        array de personajes.
	 */

	public static void setUpCharacter(Personaje[] personajes, String[] names, String[] countrys, String[] historys,
			String[] heights, String[] weights, String[] colorHeads, String[] clothings, String[] stages,
			double[] lifes, double[] speeds, double[] strengths, double[] slowKicks, double[] fastKicks,
			double[] slowPunchs, double[] fastPunchs, double[] slowGrips, double[] fastGrips, String[] nameSA1s,
			double[] specialAttacks1, String[] nameSA2s, double[] specialAttacks2, String[] nameSA3s,
			double[] specialAttacks3, double[] defenses) {

		for (int i = 0; i < personajes.length; i++) {

			personajes[i] = new Personaje(names[i], countrys[i], historys[i], heights[i], weights[i], colorHeads[i],
					clothings[i], stages[i], lifes[i], speeds[i], strengths[i], slowKicks[i], fastKicks[i],
					slowPunchs[i], fastPunchs[i], slowGrips[i], fastGrips[i], nameSA1s[i], specialAttacks1[i],
					nameSA2s[i], specialAttacks2[i], nameSA3s[i], specialAttacks3[i], defenses[i]);

		} // Cierre del constructor.

	}

	/**
	 * Metodo que realiza la simulacion del combate. Los parametros de entrada seria
	 * el Array de personajes, un int opc1 que seria el jugador 1 con un numero del
	 * 0 al 8, el que escoga el usuario y un int opc2 que seria el jugador 2 con un
	 * numero del 0 al 8, el que escoga el usuario.
	 * 
	 * @param personajes Array en el que contiene los personajes.
	 * @param opc1       int que indica la posicion del personaje en el array de
	 *                   personajes.
	 * @param opc2       int que indica la posicion del personaje en el array de
	 *                   personajes.
	 */

	public static void combat(Personaje[] personajes, int opc1, int opc2) {
		Random rand = new Random();

		// Se genera numeros int random.

		// action1 -> int random de 0 a 1, dependiendo de su valor es que realiza la
		// primera accion del personaje 1.
		int action1 = new Random().nextInt(2);
		// action2 -> int random de 0 a 1, dependiendo de su valor es que realiza la
		// primera accion del personaje 2.
		int action2 = new Random().nextInt(2);
		// dodge -> int random de 0 a 1, dependiendo de su valor indica si el personaje
		// esquiva el ataque.
		int dodge = new Random().nextInt(2);
		// block -> int random de 0 a 1, dependiendo de su valor indica si el personaje
		// bloquea el ataque.
		int block = new Random().nextInt(2);
		// atack -> int random de 0 a 1, dependiendo de su valor indica si el personaje
		// ataca.
		int atack = new Random().nextInt(2);
		// atackSelect -> int random de 0 a 1, dependiendo de su valor indica el ataque
		// que va a realizar el personaje, este se introduce en un Array que contiene
		// los ataques multiplicado por su respetiva fuerza de los personajes
		// seleccionados
		int atackSelect = new Random().nextInt(9);

		// atacksCh1 -> Array de doubles de 8 posiciones que almacena el porcentaje de
		// daño de cada ataque del personaje 1.
		double[] atacksCh1 = { (personajes[opc1].getSlowKick() * personajes[opc1].getStrength()),
				(personajes[opc1].getFastKick() * personajes[opc1].getStrength()),
				(personajes[opc1].getSlowPunch() * personajes[opc1].getStrength()),
				(personajes[opc1].getFastPunch() * personajes[opc1].getStrength()),
				(personajes[opc1].getSlowGrip() * personajes[opc1].getStrength()),
				(personajes[opc1].getFastGrip() * personajes[opc1].getStrength()),
				(personajes[opc1].getSpecialAttack1() * personajes[opc1].getStrength()),
				(personajes[opc1].getSpecialAttack2() * personajes[opc1].getStrength()),
				(personajes[opc1].getSpecialAttack3() * personajes[opc1].getStrength()) };

		// atacksCh1 -> Array de doubles de 8 posiciones que almacena el porcentaje de
		// daño de cada ataque del personaje 2.
		double[] atacksCh2 = { (personajes[opc2].getSlowKick() * personajes[opc2].getStrength()),
				(personajes[opc2].getFastKick() * personajes[opc2].getStrength()),
				(personajes[opc2].getSlowPunch() * personajes[opc2].getStrength()),
				(personajes[opc2].getFastPunch() * personajes[opc2].getStrength()),
				(personajes[opc2].getSlowGrip() * personajes[opc2].getStrength()),
				(personajes[opc2].getFastGrip() * personajes[opc2].getStrength()),
				(personajes[opc2].getSpecialAttack1() * personajes[opc2].getStrength()),
				(personajes[opc2].getSpecialAttack2() * personajes[opc2].getStrength()),
				(personajes[opc2].getSpecialAttack3() * personajes[opc2].getStrength()) };

		// while que comprueba la vida de los personajes, no deja de repetirse hasta que
		// uno de los jugadores su vida llegue a 0 o menos de 0(numeros negativos)
		while (!(personajes[opc1].getLife() <= 0 || personajes[opc2].getLife() <= 0)) {
			// if que comprueba si el personaje 1 realiza la primera accion, al ser un
			// random de 0 o 1, solo se ejecutara si action1 es 1, para realizar una de las
			// siguientes acciones de esquivar, atacar o atacar pero el enemigo bloque el
			// ataque y asi restar el daño que aflige el personaje 1 al personaje 2,
			// seria golpe menos defensa dividido entre 2.
			if (action1 == 1) {
				action1 = 0;
				action2 = 0;
				// if que combruba si int dodge es igual a 1, que realiza la accion de esquivar
				// el ataque y no recibir daño. mostrando un mensaje de que a realizado dicha
				// accion.
				if (dodge == 1) {
					System.out.println(personajes[opc2].getName() + " esquivo el ataque.");
					// Lo seteamos a cero para mas adelante volver a realizar random.
					dodge = 0;
					// if que comprueba si el personaje ataca y el enemigo no bloquea.
				} else if (atack == 1 && block == 0) {
					personajes[opc2].setLife(personajes[opc2].getLife() - atacksCh1[atackSelect]);
					// ifs que comprueban que ataque que usa el personaje 1 y cuanto daño realizan
					if (atackSelect == 0) {
						System.out.println(personajes[opc1].getName() + " utilizo patada lenta. \n" + "Hit: "
								+ (atacksCh1[0] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 1) {
						System.out.println(
								personajes[opc1].getName() + " utilizo patada rapida.\n" + "Hit: " + atacksCh1[1]);
					}
					if (atackSelect == 2) {
						System.out.println(
								personajes[opc1].getName() + " utilizo puñetazo lento.\n" + "Hit: " + atacksCh1[2]);
					}
					if (atackSelect == 3) {
						System.out.println(
								personajes[opc1].getName() + " utilizo puñetazo rapido.\n" + "Hit: " + atacksCh1[3]);
					}
					if (atackSelect == 4) {
						System.out.println(
								personajes[opc1].getName() + " utilizo agarre lento.\n" + "Hit: " + atacksCh1[4]);
					}
					if (atackSelect == 5) {
						System.out.println(
								personajes[opc1].getName() + " utilizo agarre rapido.\n" + "Hit: " + atacksCh1[5]);
					}
					if (atackSelect == 6) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA1()
								+ "Hit: " + atacksCh1[6]);
					}
					if (atackSelect == 7) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA2()
								+ "\n" + "Hit: " + atacksCh1[7]);
					}
					if (atackSelect == 8) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA3()
								+ "\n" + "Hit: " + atacksCh1[8]);
					}
					// Los seteamos a cero para mas adelante volver a realizar random.
					atack = 0;
					atackSelect = 0;
					// if que comprueba si la vida del jugador es igual a 0 o menor de 0, si fuera
					// menor de setearia la vida del personaje2 a 0
					if (personajes[opc2].getLife() <= 0) {
						personajes[opc2].setLife(0);
					}
					// if que comprueba si el personaje ataca y el enemigo bloquea.
				} else if (atack == 1 && block == 1) {
					personajes[opc2].setLife(personajes[opc2].getLife()
							- (atacksCh1[atackSelect] - (personajes[opc2].getDefense() / 2)));
					// ifs que comprueban que ataque que usa el personaje 1 y cuanto daño a
					// realizado ya reducido por la defensa del personaje 2
					if (atackSelect == 0) {
						System.out.println(personajes[opc1].getName() + " utilizo patada lenta. \n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[0] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 1) {
						System.out.println(personajes[opc1].getName() + " utilizo patada rapida.\n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[1] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 2) {
						System.out.println(personajes[opc1].getName() + " utilizo puñetazo lento.\n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[2] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 3) {
						System.out.println(personajes[opc1].getName() + " utilizo puñetazo rapido.\n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[3] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 4) {
						System.out.println(personajes[opc1].getName() + " utilizo agarre lento.\n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[4] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 5) {
						System.out.println(personajes[opc1].getName() + " utilizo agarre rapido.\n"
								+ personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[5] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 6) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA1()
								+ "\n" + personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[6] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 7) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA2()
								+ "\n" + personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[7] - (personajes[opc2].getDefense() / 2)));
					}
					if (atackSelect == 8) {
						System.out.println(personajes[opc1].getName() + " utilizo " + personajes[opc1].getNameSA3()
								+ "\n" + personajes[opc2].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[8] - (personajes[opc2].getDefense() / 2)));
					}
					// Los seteamos a cero para mas adelante volver a realizar random.
					atack = 0;
					block = 0;
					atackSelect = 0;
					// if que comprueba si la vida del jugador es igual a 0 o menor de 0, si fuera
					// menor de setearia la vida del personaje2 a 0
					if (personajes[opc2].getLife() <= 0) {
						personajes[opc2].setLife(0);
					}

				}
				// if que comprueba si el personaje 2 realiza la primera accion, al ser un
				// random de 0 o 1, solo se ejecutara si action1 es 1, para realizar una de las
				// siguientes acciones de esquivar, atacar o atacar pero el enemigo bloque el
				// ataque y asi restar el daño que aflige el personaje 1 al personaje 2,
				// seria golpe menos defensa dividido entre 2.
			} else if (action2 == 1) {
				action1 = 0;
				action2 = 0;
				// if que combruba si int dodge es igual a 1, que realiza la accion de esquivar
				// el ataque y no recibir daño. mostrando un mensaje de que a realizado dicha
				// accion.
				if (dodge == 1) {
					System.out.println(personajes[opc1].getName() + " esquivo el ataque.");
					dodge = 0;
					// if que comprueba si el personaje ataca y el enemigo no bloquea.
				} else if (atack == 1 && block == 0) {
					personajes[opc1].setLife(personajes[opc1].getLife() - atacksCh2[atackSelect]);
					// ifs que comprueban que ataque que usa el personaje 2 y cuanto daño realizan
					if (atackSelect == 0) {
						System.out.println(
								personajes[opc2].getName() + " utilizo patada lenta.\n" + "Hit: " + atacksCh1[0]);
					}
					if (atackSelect == 1) {
						System.out.println(
								personajes[opc2].getName() + " utilizo patada rapida.\n" + "Hit: " + atacksCh1[1]);
					}
					if (atackSelect == 2) {
						System.out.println(
								personajes[opc2].getName() + " utilizo puñetazo lento.\n" + "Hit: " + atacksCh1[2]);
					}
					if (atackSelect == 3) {
						System.out.println(
								personajes[opc2].getName() + " utilizo puñetazo rapido.\n" + "Hit: " + atacksCh1[3]);
					}
					if (atackSelect == 4) {
						System.out.println(
								personajes[opc2].getName() + " utilizo agarre lento.\n" + "Hit: " + atacksCh1[4]);
					}
					if (atackSelect == 5) {
						System.out.println(
								personajes[opc2].getName() + " utilizo agarre rapido.\n" + "Hit: " + atacksCh1[5]);
					}
					if (atackSelect == 6) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA1()
								+ "\n" + "Hit: " + atacksCh1[6]);
					}
					if (atackSelect == 7) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA2()
								+ "\n" + "Hit: " + atacksCh1[7]);
					}
					if (atackSelect == 8) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA3()
								+ "\n" + "Hit: " + atacksCh1[8]);
					}
					// Los seteamos a cero para mas adelante volver a realizar random.
					atack = 0;
					atackSelect = 0;
					// if que comprueba si la vida del jugador es igual a 0 o menor de 0, si fuera
					// menor de setearia la vida del personaje 1 a 0
					if (personajes[opc1].getLife() <= 0) {
						personajes[opc1].setLife(0);
					}
				} else if (atack == 1 && block == 1) {
					// ifs que comprueban que ataque que usa el personaje 2 y cuanto daño a
					// realizado ya reducido por la defensa del personaje 1
					personajes[opc1].setLife(personajes[opc1].getLife()
							- (atacksCh2[atackSelect] - (personajes[opc1].getDefense() / 2)));
					if (atackSelect == 0) {
						System.out.println(personajes[opc2].getName() + " utilizo patada lenta.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[0] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 1) {
						System.out.println(personajes[opc2].getName() + " utilizo patada rapida.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[1] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 2) {
						System.out.println(personajes[opc2].getName() + " utilizo puñetazo lento.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[2] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 3) {
						System.out.println(personajes[opc2].getName() + " utilizo puñetazo rapido.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[3] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 4) {
						System.out.println(personajes[opc2].getName() + " utilizo agarre lento.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[4] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 5) {
						System.out.println(personajes[opc2].getName() + " utilizo agarre rapido.\n"
								+ personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[5] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 6) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA1()
								+ "\n" + personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[6] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 7) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA2()
								+ "\n" + personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[7] - (personajes[opc1].getDefense() / 2)));
					}
					if (atackSelect == 8) {
						System.out.println(personajes[opc2].getName() + " utilizo " + personajes[opc1].getNameSA3()
								+ "\n" + personajes[opc1].getName() + " bloqueo el ataque.\n" + "Hit: "
								+ (atacksCh1[8] - (personajes[opc1].getDefense() / 2)));
					}
					// Los seteamos a cero para mas adelante volver a realizar random.
					atack = 0;
					block = 0;
					atackSelect = 0;
					// if que comprueba si la vida del jugador es igual a 0 o menor de 0, si fuera
					// menor de setearia la vida del personaje 1 a 0
					if (personajes[opc1].getLife() <= 0) {
						personajes[opc1].setLife(0);
					}
				}
			}
			// Seteamos los int a un numero random.
			action1 = new Random().nextInt(2);
			action2 = new Random().nextInt(2);
			dodge = new Random().nextInt(2);
			block = new Random().nextInt(2);
			atack = new Random().nextInt(2);
			atackSelect = new Random().nextInt(9);
		} // Fin del bucle while al cumplri las condiciones

		// If que comprueba si la vida del personaje 1 es mayor que la del personaje 2 y
		// muestra un mensaje de quien es el ganador y la vida que les quedo
		if (personajes[opc1].getLife() > personajes[opc2].getLife()) {
			System.out.println("Gana " + personajes[opc1].getName());
			System.out.println(personajes[opc1].getName() + " Life: " + personajes[opc1].getLife());
			System.out.println(personajes[opc2].getName() + " Life: " + personajes[opc2].getLife());
		}

		// If que comprueba si la vida del personaje 2 es mayor que la del personaje 1 y
		// muestra un mensaje de quien es el ganador y la vida que les quedo
		if (personajes[opc2].getLife() > personajes[opc1].getLife()) {
			System.out.println("Gana " + personajes[opc2].getName());
			System.out.println(personajes[opc2].getName() + " Life: " + personajes[opc2].getLife());
			System.out.println(personajes[opc1].getName() + " Life: " + personajes[opc1].getLife());
		}

	}

}
