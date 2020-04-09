//具象クラスLine
public class Line implements Figure {
	//フィールドメンバ
	private Point p1;
	private Point p2;

	//コンストラクタ
	//引数なし
	public Line() {
		//p1(x,y座標)、p2(x,y座標)全て0で初期化する
		Point p1 = new Point();
		Point p2 = new Point();
	}

	//引数２つ
	public Line(int x1, int y1, int x2, int y2) {
		Point p1 = new Point(x1, y1);
		Point p2 = new Point(x2, y2);
	}

	//メソッドメンバ
	@Override
	public void draw(int x1, int y1, int x2, int y2) {
		System.out.println("[線を描画] " +
				"始点(" + x1 + "," + y1 + ")から" +
				"終点(" + x2 + "," + y2 + ")まで");
	}
	@Override
	public double perimeter(int x1, int y1, int x2, int y2) {
		return Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
	}

	@Override
	public void draw() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public double perimeter() {
		// TODO 自動生成されたメソッド・スタブ
		return 0;
	}

}
