//具象クラスCircle
public class Circle extends Shape {
	//フィールドメンバ
	private Point center;
	private int radius;

	//コンストラクタ
	//引数なし
	public Circle() {
		Point center = new Point();
		int radius = 0;
	}

	//引数３つ
	public Circle(int x, int y, int r) {
		Point center = new Point(x, y);
		int radius = r;
	}

	//メソッドメンバ
	public void draw(int x, int y, int r) {
		System.out.println("[円を描画] " +
				"中心点(" + x + "," + y + ")から" +
				"半径" + r);
	}

	public double perimeter() {
		return radius * 2 * Math.PI;
	}
}
