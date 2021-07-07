import java.time.LocalDateTime;

class Var {
	int i1 = 1;
	static int i2 = 2;
	public static void main(String args[]) {
		String s1 = "This";
		LocalDateTime ldt1 = LocalDateTime.now();
		double d1 = 120.5;
		var s2 = "This";
		var ldt2 = LocalDateTime.now();
		var d2 = 120.5;
		printObj(s1);
		printObj(ldt1);
		printObj(d1);
		printObj(s2);
		printObj(ldt2);
		printObj(d2);
		var age = 9;
		age = 10;
		var aNumber = 111_222_333;
		// var obj = (Object)ldt2;
		// System.out.println(obj.getClass().getTypeName());
	}
	public static void printObj(Object obj) {
		System.out.println(obj.getClass().getTypeName());
	}
}

class TypeInferenceWithVar {
	public static void main(String args[]) {
		String explicitString = "String1";
		Object explicitObject = (Object)explicitString;
		System.out.println(((String)explicitObject).toUpperCase());
		var    implicitString = "String2";
		var    implicitObject = (Object)implicitString;
		System.out.println(((String)implicitObject).toUpperCase());
		char sayNoTo[] = {'p', 'l', 'a', 's', 't', 'i', 'c'};
		var sayYesTo = new char[]{'w', 'a', 't', 'e', 'r'};
	}
}