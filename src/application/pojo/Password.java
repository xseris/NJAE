package application.pojo;

public class Password {
	String value;
	double strength = 0;
	int length;
	int specials = 0;
	int lower = 0;
	int upper = 0;
	int digits = 0;

	public Password(String pass) {
		this.value = pass;
		this.length = pass.length();
		for (int i = 0; i < this.length; i++) {
			Character current = pass.charAt(i);
			if (current >= 'a' && current <= 'z') {
				this.lower++;
			} else if (current >= 'A' && current <= 'Z') {
				this.upper++;
			} else if (current >= '0' && current <= '9') {
				this.digits++;
			} else {
				this.specials++;
			}
		}
		this.strength += Math.min(this.length / 8.0, 3) * 0.35;
		this.strength += Math.min(this.lower / 1.0, 1) * 0.05;
		this.strength += Math.min(this.upper / 1.0, 1) * 0.2;
		this.strength += Math.min(this.digits / 1.0, 1) * 0.2;
		this.strength += Math.min(this.specials / 1.0, 1) * 0.2;
	}

	public String getValue() {
		return value;
	}

	public double getStrength() {
		return strength;
	}

	public int getLength() {
		return length;
	}

	public int getSpecials() {
		return specials;
	}

	public int getLower() {
		return lower;
	}

	public int getUpper() {
		return upper;
	}

	public int getDigits() {
		return digits;
	}

}
