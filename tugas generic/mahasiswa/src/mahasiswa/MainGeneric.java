
package mahasiswa;


public class MainGeneric {
    
    
    public static void main(String[] args){
        
        Mahasiswa<Integer> p = new Mahasiswa<Integer>(123454353);
        int y = p.getnim();
        System.out.println("masukkan nim :" + y);
    System.out.println("");
        System.out.println("-----------");
        System.out.println("");
        
     }   
}