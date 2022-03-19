package ch09.thisKeyword;

public class ThisDemo {
//	int this.i = 0;  // Error!
	int i = 0;
	int k = 5;
	int j = 2 * this.k; // ! No need for this here

	public ThisDemo() {
	}

	public ThisDemo(int i, int k, int j) {
		this.i = i;
		this.k = k;
		this.j = j;
	}

	void setI(int i) {
		this.i = i;
	}

	void aMethod() {
		this.printMe(); // ! No need for this here
	}

	void printMe() {
		System.out.println(this.i + " " + this.j + " " + this.k); // ! No need for this here
	}

	public static void main(String[] args) {
//		ThisDemo demo1 = new ThisDemo();
//		demo1.aMethod();
		
		ThisDemo demo2 = new ThisDemo(3, 5, 8);
		demo2.aMethod();
	}
}
