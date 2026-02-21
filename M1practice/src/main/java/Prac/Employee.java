package Prac;

public class Employee {
		private String id;
		private String name;
		private double salary;
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
		}
		Employee(){
			
		}
		Employee(String id, String name, double salary) {
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return id + "|" + name + "|" + salary;
		}
}
//		private List<Employee> emp=new ArrayList<>();
////		public void setEmp(List<Employee> emp) {
////			this.emp=new ArrayList<>(emp);
////		}
////		public List<Employee> getEmp(){
////			return new ArrayList<>(emp);
////		}
//		public void addEmp(String id,String name,double salary) {
//			emp.add(new Employee(id,name,salary));
//		}
//		public void getDisplay() {
//			Iterator<Employee> a=emp.iterator();
//			while(a.hasNext()) {
//				System.out.println(a.next());
//			}
//		}
//		public void getDisplayById(String str) {
//			Iterator<Employee> e=emp.iterator();
//			while(e.hasNext()) {
//				Employee empObj=e.next();
//				if(empObj.getId().equals(str)) {
//					System.out.println(empObj);
//					return;
//				}
//			}
//			System.out.println("Employee Not found");
//					}
//		
//		public void UpdateId(String oldId,String NewId) {
//			for(Employee e:emp) {
//				if(e.getId().equals(oldId)) {
//					e.setId(NewId);
//					
//				}
//			}
//		}
//		public static void main(String[] args) {
//	Employee emp1=new Employee();
//	emp1.addEmp("s101","Khasim", 9876);
//	emp1.addEmp("s102","Swarna", 11110);
////	emp1.getDisplay();
//	emp1.getDisplayById("s101");
//	emp1.UpdateId("s101", "101");
//	emp1.getDisplay();
	
