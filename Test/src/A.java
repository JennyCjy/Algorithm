
public class A {
	public Test t;
	public A(){
		t= new Test();
	}
	
	public B creatB(){
		return new B(t);
	}
	
	public static void main(String[] args) {
		A a = new A();
		B b=a.creatB();
		b.t.setNum(9);
		System.out.println("a:"+a.t.getNum());
		a.t.setNum(10);
		System.out.println("b:"+b.t.getNum());
	}
}
