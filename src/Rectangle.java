//具象クラス、親クラスRectangle
public class Rectangle extends Polygon {
	//フィールドメンバ
	protected Point p;
	protected int width;
	protected int height;

	//メソッドメンバ
	//代入
	public Rectangle(int x, int y, int width, int height) {
		Point p = new Point(x, y);
		this.width = width;
		this.height = height;
		super.getInternalAngle(4);
	}

	//出力
	public void draw(int x, int y, int width, int height) {
		System.out.println("[長方形を描画] " +
				"点(" + x + "," + y + ")を基準として" +
				"幅" + width + "、" +
				"高さ" + height + "の正方形");
	}

	//外周
	public double perimeter() {
		return (width + height) * 2;
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
