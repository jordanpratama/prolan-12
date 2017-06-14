
package motoryamaha;

import java.util.Scanner;

public class MotorYamaha {
    
    private String Nama;
    private int Harga;
    Scanner input=new Scanner(System.in);
    
    public String getNama() {
        return Nama;
    }
    public void setNama (String Nama) {
        System.out.print("Masukkan nama motor");
        Nama=input.nextLine();
        this.Nama = Nama;
    }
    public int getHarga() {
        return Harga;
    }
    public void setHarga () {
        System.out.print("Masukkan harga motor : Rp. ");
        Nama=input.nextLine();
        this.Harga = Harga;
    }
    
    
    
    
}
