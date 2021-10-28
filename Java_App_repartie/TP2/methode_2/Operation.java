package methode_2;

import java.io.Serializable;

public class Operation implements Serializable{
	
	int x;
	int y;
	char op;
	public Operation(int x, int y, char op2) {
		super();
		this.x = x;
		this.y = y;
		this.op = op2;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public char getOp() {
		return op;
	}

}
