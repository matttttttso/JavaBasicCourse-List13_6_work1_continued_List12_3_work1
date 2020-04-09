//具象クラスPoint
public class Point {
	//フィールドメンバ
	private int x;
	private int y;

	//xのゲッターセッター
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	//yのゲッターセッター
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	//コンストラクタ
	//引数なし
	public Point() {
		this.x = 0;
		this.y = 0;
	}
	//引数２つ
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
