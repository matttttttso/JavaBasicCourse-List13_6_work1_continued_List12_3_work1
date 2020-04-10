import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("図形描画[ 0:円 2:線 3:三角形 4:長方形 44:正方形 ] : >");
		int input = new Scanner(System.in).nextInt();
		switch (input) {
			case 0:
				Circle c1 = new Circle(100, 100, 20);
				c1.draw();
				System.out.println("周囲の長さは、" + c1.perimeter());
				break;
			case 2:
				Line l1 = new Line(0, 0, 100, 100);
				l1.draw();
				System.out.println("周囲の長さは、" + l1.perimeter());
				break;
			case 3:
				Triangle t1 = new Triangle(0, 0, 100, 100, 0, 200);
				t1.draw();
				System.out.println("周囲の長さは、" + t1.perimeter());
				System.out.println("内角の和は、" + t1.getInternalAngle(3));
				break;
			case 4:
				Rectangle r1 = new Rectangle(0, 0, 100, 50);
				r1.draw();
				System.out.println("周囲の長さは、" + r1.perimeter());
				System.out.println("内角の和は、" + r1.getInternalAngle(4));
				break;
			case 44:

				break;
			default:
				System.out.println("その値は無効です");
				break;
		}
	}
}
