package masJunit;

public class Par {
int n1;
public Par(int n1){
	this.n1=n1;
}
public boolean espar(){
	if(n1%2==0) {
		return true;
	}
	else {
		return false;
	}
}
}
