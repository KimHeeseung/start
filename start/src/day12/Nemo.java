package day12;

public class Nemo extends Figure {
	//변수 추가
	private int garo, sero, area;

	//생성자
	public Nemo () {}
	public Nemo(int garo , int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	@Override
	public void setArea() {
		// 사각형 면적 셋팅 위에 생성자 함수에서 setArea 들어갔으니 생성자 함수에 들어가지 않고 생성자 함수에 setArea가 들어가있기떄문에 계산이 된다.
		area = garo * sero;
	}

	@Override
	public void toPrint() {
		//사각형 내용 출력하는 기능
		System.out.printf("이 사각형은 가로가 %3d 이고 세로가 %3d 이고 면적은 %6d 입니다.",garo,sero,area);
		System.out.println();
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}

}
