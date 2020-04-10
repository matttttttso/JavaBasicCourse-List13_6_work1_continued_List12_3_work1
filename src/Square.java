//具象クラス,子クラスSquare
public class Square extends Rectangle {

	//メソッドメンバ
	//スーパークラスRectangleのコンストラクタを明示的に呼び出す
	public Square(int x, int y, int width) {
		super(x, y, width, width);
	}

	//出力
	public void draw() {
		System.out.println("[正方形を描画] " +
				"点(" + super.p.getX() + "," + super.p.getY() + ")を基準として" +
				"幅・高さ" + width + "の正方形");
	}
}
