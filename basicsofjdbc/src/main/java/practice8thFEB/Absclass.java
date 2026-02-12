package practice8thFEB;

public class Absclass extends ABS{
		Absclass(int id, String name) {
		super(id, name);
	}
		void main() {
			System.out.println("This is the main class");
		}
		void eat() {
			super.eat();
			System.out.println("Eat mutton");
		}
}
