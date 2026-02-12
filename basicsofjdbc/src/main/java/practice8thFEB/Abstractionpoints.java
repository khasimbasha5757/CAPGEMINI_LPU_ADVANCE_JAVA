package practice8thFEB;

public interface Abstractionpoints {
		void eat();
		default void hai() {
			System.out.println("Hai hai hai......");
		}
		static void hello() {
			System.out.println("Hello hello hello.....");
		}
}
