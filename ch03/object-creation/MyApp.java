class Person {
	Person() {
		System.out.println("Person object created");
	}
}

class ObjectLifeCycle {
	Person person = new Person();
	String str1 = new String("string1");
	String str2 = "string2";
	ObjectLifeCycle() {
		person = new Person();
	}
}

class Exam {
	String name;
	public Exam(String name) {
		this.name = name;
	}
}

public class MyApp {
	// public static void main(String args[]) {
	// 	Exam myExam = new Exam("PHP");
	// 	myExam = null;
	// 	myExam = new Exam("SQL");
	// 	myExam = new Exam("Java");
	// 	Exam yourExam = new Exam("PMP");
	// 	yourExam = myExam;
	// }
	public static void main(String args[]) {
		Language php = new Language("PHP");
		Language java = new Language("Java");
		php.setOtherLanguage(java);
		java.setOtherLanguage(php);
		php = null;
		java = null;
	}
}

class Language {
	private String name;
	private Language other;
	public Language(String name) {
		this.name = name;
	}
	public void setOtherLanguage(Language other) {
		this.other = other;
	}
}
