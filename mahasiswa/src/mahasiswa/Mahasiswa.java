
package mahasiswa;

public class Mahasiswa <T> {
    
    private T nim;
    
    public Mahasiswa(T nim) {
        this.nim = nim;
      }  
    
    public void setnim(T nim){
        this.nim = nim; 
       
    }
    public T getnim(){
        return nim;
    }
    public void getType() {
        System.out.println("Tipe awalnya " + nim.getClass().getName());
    }
}
