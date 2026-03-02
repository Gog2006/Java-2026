package test;

 class A {
	 // ici, exceptionnellement, pas d'encapsulation
	 public int n;
	 public int p=10;

	 public A (int nn) {
	 System.out.println("Entrée Constr. A : n="+n+" p="+p);
	 n = nn;
	 System.out.println("Sortie Constr. A : n="+n+" p="+p);
	 }
	}
	 class B extends A {
	 public int q=25;

	 public B (int n, int pp) {
	 super(n);
	 System.out.println("Entrée Constr. B : n="+n+" p="+p+" q="+q);
	 p = pp;
	 q = 2*n;
	 System.out.println("Sortie Constr. B : n="+n+" p="+p+" q="+q);
	 }
	}
	public class TestInit {
	 public static void main (String[] args) {
	 A a = new A(5);
	 A b = new B(5, 3);
	 }
	}