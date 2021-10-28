package methode_1;

import java.io.Serializable;

public class Operation implements Serializable  {
	
	int x;
	int y;
	char op;
	public Operation(int x, int y, char op) {
		super();
		this.x = x;
		this.y = y;
		this.op = op;
	}
	@Override
	public String toString() {
		return "res[x=" + x + ", y=" + y + ", op=" + op + "]=";
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
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setOp(char op) {
		this.op = op;
	}

}
