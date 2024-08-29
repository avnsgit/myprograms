package mypogramsbasic;

public enum Foo {

	ABC("A", 1), DEF("D", 2);

	private int myit;
	private String mys;

	private Foo(String mys, int myit) {
		this.mys = mys;
		this.myit = myit;
	}

	public int getInt() {

		return myit;

	}

	public String getStr() {

		return mys;
	}

}


