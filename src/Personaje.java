import java.lang.reflect.Array;

/**
 * Clase que define objetos Personaje, para definir todos los atributos de los
 * personajes. Contiene metodos que devuelve valores de los atributos o introduce nuevos valores a los atributos.
 * 
 * @author Rafael
 *
 */

public class Personaje {

	private String name;
	private String country;
	private String history;
	private String height;
	private String weight;
	private String colorHead;
	private String clothing;
	private String stage;
	private double life;
	private double speed;
	private double strength;
	private double slowKick;
	private double fastKick;
	private double slowPunch;
	private double fastPunch;
	private double slowGrip;
	private double fastGrip;
	private String nameSA1;
	private double specialAttack1;
	private String nameSA2;
	private double specialAttack2;
	private String nameSA3;
	private double specialAttack3;
	private double defense;

	public Personaje() {
		super();
	}

	public Personaje(String name) {
		super();
		this.name = name;
	}

	public Personaje(String name, String country, String history, String height, String weight, String colorHead,
			String clothing, String stage, double life, double speed, double strength, double slowKick, double fastKick,
			double slowPunch, double fastPunch, double slowGrip, double fastGrip, String nameSA1, double specialAttack1,
			String nameSA2, double specialAttack2, String nameSA3, double specialAttack3, double defense) {
		super();
		this.name = name;
		this.country = country;
		this.history = history;
		this.height = height;
		this.weight = weight;
		this.colorHead = colorHead;
		this.clothing = clothing;
		this.stage = stage;
		this.life = life;
		this.speed = speed;
		this.strength = strength;
		this.slowKick = slowKick;
		this.fastKick = fastKick;
		this.slowPunch = slowPunch;
		this.fastPunch = fastPunch;
		this.slowGrip = slowGrip;
		this.fastGrip = fastGrip;
		this.nameSA1 = nameSA1;
		this.specialAttack1 = specialAttack1;
		this.nameSA2 = nameSA2;
		this.specialAttack2 = specialAttack2;
		this.nameSA3 = nameSA3;
		this.specialAttack3 = specialAttack3;
		this.defense = defense;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getHistory() {
		return history;
	}

	public void setHistory(String history) {
		this.history = history;
	}

	public String getHeight() {
		return height;
	}

	public void setHeight(String height) {
		this.height = height;
	}

	public String getWeight() {
		return weight;
	}

	public void setWeight(String weight) {
		this.weight = weight;
	}

	public String getColorHead() {
		return colorHead;
	}

	public void setColorHead(String coloHead) {
		this.colorHead = coloHead;
	}

	public String getClothing() {
		return clothing;
	}

	public void setClothing(String clothing) {
		this.clothing = clothing;
	}

	public String getStage() {
		return stage;
	}

	public void setStage(String stage) {
		this.stage = stage;
	}

	public double getLife() {
		return life;
	}

	public void setLife(double life) {
		this.life = life;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getStrength() {
		return strength;
	}

	public void setStrength(double strength) {
		this.strength = strength;
	}

	public double getSlowKick() {
		return slowKick;
	}

	public void setSlowKick(double slowKick) {
		this.slowKick = slowKick;
	}

	public double getFastKick() {
		return fastKick;
	}

	public void setFastKick(double fastKick) {
		this.fastKick = fastKick;
	}

	public double getSlowPunch() {
		return slowPunch;
	}

	public void setSlowPunch(double slowPunch) {
		this.slowPunch = slowPunch;
	}

	public double getFastPunch() {
		return fastPunch;
	}

	public void setFastPunch(double fastPuch) {
		this.fastPunch = fastPuch;
	}

	public double getSlowGrip() {
		return slowGrip;
	}

	public void setSlowGrip(double slowGrip) {
		this.slowGrip = slowGrip;
	}

	public double getFastGrip() {
		return fastGrip;
	}

	public void setFastGrip(double fastGrip) {
		this.fastGrip = fastGrip;
	}

	public String getNameSA1() {
		return nameSA1;
	}

	public void setNameSA1(String nameSA1) {
		this.nameSA1 = nameSA1;
	}

	public double getSpecialAttack1() {
		return specialAttack1;
	}

	public void setSpecialAttack1(double specialAttack1) {
		this.specialAttack1 = specialAttack1;
	}

	public String getNameSA2() {
		return nameSA2;
	}

	public void setNameSA2(String nameSA2) {
		this.nameSA2 = nameSA2;
	}

	public double getSpecialAttack2() {
		return specialAttack2;
	}

	public void setSpecialAttack2(double specialAttack2) {
		this.specialAttack2 = specialAttack2;
	}

	public String getNameSA3() {
		return nameSA3;
	}

	public void setNameSA3(String nameSA3) {
		this.nameSA3 = nameSA3;
	}

	public double getSpecialAttack3() {
		return specialAttack3;
	}

	public void setSpecialAttack3(double specialAttack3) {
		this.specialAttack3 = specialAttack3;
	}

	public double getDefense() {
		return defense;
	}

	public void setDefense(double defense) {
		this.defense = defense;
	}

	public String toString() {
		return "Personaje [name=" + name + ", country=" + country + ", history=" + history + ", height=" + height
				+ ", weight=" + weight + ", coloHead=" + colorHead + ", clothing=" + clothing + ", stage=" + stage
				+ ", life=" + life + ", speed=" + speed + ", strength=" + strength + ", slowKick=" + slowKick
				+ ", fastKick=" + fastKick + ", slowPunch=" + slowPunch + ", fastPunch=" + fastPunch + ", slowGrip="
				+ slowGrip + ", fastGrip=" + fastGrip + ", nameSA1=" + nameSA1 + ", specialAttack1=" + specialAttack1
				+ ", nameSA2=" + nameSA2 + ", specialAttack2=" + specialAttack2 + ", nameSA3=" + nameSA3
				+ ", specialAttack3=" + specialAttack3 + ", defense=" + defense + "]";
	}

}
