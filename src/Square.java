//具象クラス,子クラスSquare
public class Square extends Rectangle {

	//メソッドメンバ
	//スーパークラスRectangleのコンストラクタを明示的に呼び出す
	public Square(int x, int y, int width, int height) {
		super(x, y, width, height);
	}

	//出力
	public void draw(int x, int y, int width) {
		System.out.println("[正方形を描画] " +
				"点(" + x + "," + y + ")を基準として" +
				"幅・高さ" + width + "の正方形");
	}
}
