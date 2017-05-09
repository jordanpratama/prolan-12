
package mahasiswa;

public class jordan extends Mahasiswa {
    
    @Override
    protected void kuliah(){
        System.out.println("harus masuk pada saat perkuliahan");
    }
    
    @Override
    protected void lulus(){
        System.out.println("nilai harus bagus");
    }
    
    @Override
    protected void tidaklulus (){
       System.out.println("nilai tidak bagus");
    }
}
