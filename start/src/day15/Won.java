package day15;

public class Won {
	private int rad;
	private double arround,area;
	public Won() {}
	
	public Won(int rad) {
		this.rad = rad;
		
		setArround();
		setArea();
		
	}

	public int getRad() {
		return rad;
	}


	public void setRad(int rad) {
		this.rad = rad;
	}


	public double getArround() {
		return arround;
	}


	public void setArround() {
		arround = 2* rad *3.14;
	}
	
	public void setArround(double arround) {
		this.arround = arround;
	}


	public double getArea() {
		return area;
	}
	
	public void setArea() {
		this.area = area;
	}


	public void setArea(double area) {
		area = rad * rad *3.14;
	}
	
	@Override
	public String toString() {
		return "원의 - 반지름 - : " +rad +" ,둘레 :" + arround + ", 면적 : " + area;
	} 


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
