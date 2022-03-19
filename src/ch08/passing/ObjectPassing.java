package ch08.passing;


public class ObjectPassing {
	public static void main(String[] args) {
		ObjectPassing o = new ObjectPassing();
		
		W w = new W();
		w.i = 3;
		w.b = false;
		
		o.f(w);
		System.out.println("i of w is " + w.i + "  and b of w is " + w.b);
	}

	public void f(W objectW) { // objectW = w
		objectW.i = 5;
		objectW.b = true;
		
		W ww = new W();
		ww.i = 8;
		ww.b = true;
		
		objectW = ww;
		objectW.i = 12;
		objectW.b = false;
		System.out.println("i of objectW is " + objectW.i + "  and b of objectW is " + objectW.b);
	}
}

class W {
	int i;
	boolean b;
}
