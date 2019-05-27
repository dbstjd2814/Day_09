package kh.uml.e01_notation;

public class Notation_01 {
	private int _private;
	int _default;
	protected int _protected;
	public int _public;
	
	private void privateF(String a) {}
	void defaultF() {}
	protected String protectedF() {
		return "";
	}
	public double publicF() {
		return 3.12;
	}
}
