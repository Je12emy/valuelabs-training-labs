package other;

class Parantheses {
	public void disp(String s) {
		System.out.print("[" + s);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.print("]");
	}
}

class Eight implements Runnable {
	Parantheses p;
	String s;

	Eight(Parantheses p, String s) {
		this.p = p;
		this.s = s;
	}

	public void run() {
		p.disp(s);
	}
}

class Nine implements Runnable {
	Parantheses p;
	String s;

	Nine(Parantheses p, String s) {
		this.p = p;
		this.s = s;
	}

	public void run() {
		p.disp(s);
	}
}

public class sync {
	public static void main(String[] args) {
		Parantheses p = new Parantheses();
		// Once the "disp" method is done the next thread can use it
		new Thread(new Eight(p, "one")).start();
		new Thread(new Nine(p, "two")).start();
	}
}
