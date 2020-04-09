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

	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double perimeter(int x1, int y1, int x2, int y2) {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ

	}
}
