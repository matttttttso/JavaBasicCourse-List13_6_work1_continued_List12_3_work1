//具象クラスCircle
public class Circle extends Shape {
	//フィールドメンバ
	private Point center;
	private int radius;

	//コンストラクタ
	//引数なし
	public Circle() {
		this.center = new Point();
		this.radius = 0;
	}

	//引数３つ
	public Circle(int x, int y, int r) {
		this.center = new Point(x, y);
		this.radius = r;
	}

	//メソッドメンバ
	public void draw() {
		System.out.println("[円を描画] " +
				"中心点(" + center.getX() + "," + center.getY() + ")から" +
				"半径" + radius);
	}

	public double perimeter() {
		return radius * 2 * Math.PI;
	}
}
