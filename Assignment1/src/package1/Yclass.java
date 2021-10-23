package package1;

public class Yclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Xclass v=new Xclass();
		Mclass pm =new Mclass();
		Nclass pn= new Nclass();
		System.out.println(v.xb);
		System.out.println(v.xc);
		System.out.println(v.xd);
		System.out.println(v.getXa());
		pm.bm();
		pm.cm();
		System.out.println("The private number is: " +pm.getAm());
		pn.an();
		pn.bn();
		pn.cn();
		
	}

}
