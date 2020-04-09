//抽象クラスPolygon
public abstract class Polygon extends Shape {
	//フィールドメンバ
	protected int angel;

	//メソッドメンバ
	public abstract void draw();

	public abstract double perimeter();

	public int getInternalAngle(int angle) {
		return (angle - 2) * 180;
	}
}
