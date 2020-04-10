//具象クラスLine
public class Line implements Figure {
	//フィールドメンバ
	private Point p1;
	private Point p2;

	//コンストラクタ
	//引数なし
	public Line() {
		//p1(x,y座標)、p2(x,y座標)全て0で初期化する
		this.p1 = new Point();
		this.p2 = new Point();
	}

	//引数２つ
	public Line(int x1, int y1, int x2, int y2) {
		this.p1 = new Point(x1, y1);
		this.p2 = new Point(x2, y2);
	}

	//メソッドメンバ
	public void draw() {
		System.out.println("[線を描画] " +
				"始点(" + p1.getX() + "," + p1.getY() + ")から" +
				"終点(" + p2.getX() + "," + p2.getY() + ")まで");
	}

	public double perimeter() {
		return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2)
						+ Math.pow((p2.getY() - p1.getY()), 2));
	}
}
