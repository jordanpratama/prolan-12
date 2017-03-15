

import java.util.Scanner;

public class IPMahasiswa {

    public static void main(String[] args) {
        IPMahasiswa ipmhs = new IPMahasiswa();
        
        Scanner input = new Scanner(System.in);
        float ip;
        int jmlMhs = 0, jmlMhslis = 0;
        System.out.print("masukkan IP : ");
        ip = input.nextFloat();
        while (ip != -999){
            if (ipmhs.isWithinRange(ip, 0, 4) == 1){
                jmlMhs++;
            }
            if (ip >= 2.75){
                jmlMhslis++;
            }
            System.out.print("masukkan IP: ");
            ip =input.nextFloat();
        }   
         System.out.println("Jumlah Mahasiswa adalah : " + jmlMhs);
         System.out.println("Jumlah Mahasiswa lulus adalah : " + jmlMhslis);
        
    }

    private int isWithinRange(float X, int min, int max) {
        if (X >= min && X<=max) {
            return 1;
        } else {
            return 0;
        }
    
    }
    
}
