
package mahasiswa;



public class MainGeneric {
    
    
    public static void main(String[] args){
    String nim;
    String nama;
    
        Mahasiswa<Integer> p = new Mahasiswa<Integer>(10111058);
        int y = p.getnim();
        System.out.println("nim anda :" + y);
        System.out.println("");
        System.out.println("-----------");
        System.out.println("");
       
    Mahasiswa<String> p2 = new Mahasiswa<String>("Jordan");
    String z = p2.getnim();
    System.out.println("nama anda :" + z);
    System.out.println("");
        System.out.println("-----------");
        System.out.println("");
    Mahasiswa p3 = new Mahasiswa<String>("Teknik Informatika");
    String d = (String) p3.getnim();
    System.out.println("jurusan anda :" + d);
}
} 