package masJunit;

public class Impar {
	int n1;

	public Impar(int n1) {
		this.n1 = n1;
	}

	boolean esimpar() {
		if (n1 % 2 == 1) {
			return true;
		} else {
			return false;
		}
	}
}
