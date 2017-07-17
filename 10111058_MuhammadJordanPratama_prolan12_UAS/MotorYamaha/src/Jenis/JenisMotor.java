

package Jenis;

import java.util.Scanner;

public class JenisMotor {
    private String jenismotor;
    Scanner input=new Scanner(System.in);
    
    public String getJenismotor() {
        return jenismotor;
    }
    public void setjenismotor(String jenismotor) {
        System.out.print("Masukkan Jenis Motor :");
        jenismotor=input.nextLine();
        this.jenismotor = jenismotor;
    }
}
