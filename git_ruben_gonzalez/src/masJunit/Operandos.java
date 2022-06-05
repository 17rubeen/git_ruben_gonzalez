package masJunit;

public class Operandos {
//	int n1,n2;
	
	boolean espar(int n1){
		if(n1%2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean esimpar(int n1){
		if(n1%2==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean esmultiplode(int n1,int n2){
		if(n1%n2==0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	
	boolean esmultiplode(int n1,int n2, int n3){
		if(n1%n2==0 && n1%n3==0) {
			return true;
		}
		else {
			return false;
		}
	}
}




