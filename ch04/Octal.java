class Octal {
	public static void main(String args[]) {
		int d = 267;
		int o = 0413; // 256 + 8 + 3 = 267
		int h = 0x1_0B; // 256 + 11 = 267
		int b = 0b1_0000_1011; // 256 + 8 + 2 + 1 = 267
		System.out.println(d + o); // 267 + 267 = 534
		System.out.println(h + b); // 267 + 267 = 534
		long var1 = 0_100_267_760;
		// long var2 = 0_x_4_13;
		// long var3 = 0b_x10_BA_75;
		// long var4 = 0b_10000_10_11;
		// long var5 = 0xa10_AG_75;
		long var6 = 0x1_0000_10;
		long var7 = 100__12_12;
	}
}