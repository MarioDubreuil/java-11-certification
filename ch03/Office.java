class Employee {
	private String name;
	private int age;
	// Employee() {
	// 	age = 22;
	// }
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void printEmp() {
		System.out.println("name = " + name + " age = " + age);
	}
	public int daysOffWork(int... days) {
		int daysOff = 0;
		for (int i = 0; i < days.length; i++) {
			daysOff += days[i];
		}
		return daysOff;
	}
}

class Office {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		Employee e2 = new Employee();
 	 	e1.setName("Mario");
 	 	e1.setAge(54);
		// e2.setName("Charlotte");
		// e2.setAge(47);
		e1.printEmp();
		e2.printEmp();
		System.out.println(e1.daysOffWork(1, 3, 14));
		System.out.println(e2.daysOffWork(-1, -3, 14, 2));
		e2.setName(e1.getName().toLowerCase());
		e2.setAge(e1.getAge()*-1);
		e1.printEmp();
		e2.printEmp();
	}
}