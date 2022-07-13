package pac1;

public class InherDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.earn();
		f.drive();
		
		Son s=new Son();
		s.drive();
		s.study();
		s.earn();
		
		GrandSon g=new GrandSon();
		g.drive();
		g.earn();
		g.play();
		g.study();
	}

}
