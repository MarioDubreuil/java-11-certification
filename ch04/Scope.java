class Student {
	private double marks1, marks2, marks3;
	private double maxMarks = 100;
	public double getAverage() {
		double avg = 0;
		avg = (marks1 + marks2 + marks3) / 3;
		return avg;
	}
}

class Phone {
	String phoneNumber = "1234567";
	void setPhoneNumber() {
		String phoneNumber;
		this.phoneNumber = "7654321";
	}
}

class Scope {
	public static void main(String args[]) {
		Phone p = new Phone();
		System.out.println(p.phoneNumber);
		p.setPhoneNumber();
		System.out.println(p.phoneNumber);
	}
}