package practice8thFEB;

public abstract class ABS {
		abstract void main();
		void add() {
			System.out.println(100+200);
		}
		int id;
		String name;
		ABS(int id,String name){
			this.id=id;
			this.name=name;
		}
		void eat() {
			System.out.println("eat chicken");
		}
}
