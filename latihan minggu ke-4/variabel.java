

public class variabel {
	private int a;
	private boolean menikah ;
	private char _nama;
	public static final String JUDUL = "Belajar Java Yuks";
	public static String judul2 ="Belajar Java Yuks";
	
	public static void main(String[] args){
	variabel var = new variabel();
	final int a = 12;
	
	var.a = 1;
	//a = 11; -> tidak bisa dilakukan
	double aa, b, c;
	String nama = "nama saya";
	byte bb = 1, B = 2;
	System.out.println(JUDUL);
	System.out.println(judul2);
	
	}
	
	public void testVariabel(){
	System.out.println(a);
	System.out.println(menikah);
	System.out.println(JUDUL);
	System.out.println(judul2);
	}
	
}
