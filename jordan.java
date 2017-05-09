
package mahasiswa;

import static java.time.Clock.system;

public abstract class jordan extends mahasiswa{
    
   @override
   public void kuliah (){
       system.out.println("masuk pada saat jam perkuliahan");            
   }
   @override
   public void lulus(){
       system.out.println("harus mendapatkan nilai yang bagus");
   }
   @override
   public void tidaklulus(){
       system.out.println("mendapatkan nilai yang jelek");
   }
}

public static void main(string[],args){

}