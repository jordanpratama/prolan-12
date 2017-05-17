
package mahasiswa;

import java.util.Scanner;

public class Mahasiswa {

    private String nama ;
    private int nim ;
    Scanner input=new Scanner(System.in);
    
    
    public String getnama () {
        return nama;
    }
    public void setnama (String nama) {
        System.out.print("Masukkan nama :");
        nama=input.nextLine();
        this.nama = nama;
    }
    public int getnim () {
        return nim;
    }
    public void setnim() {
        System.out.print("masukkan nim :");
        nama=input.nextLine();
        this.nim = nim;
    }
    }
    

