
package motoryamaha;

import Jenis.JenisMotor;

public class MainProgram {

    public static void main(String[] args) {
        MotorYamaha enk = new MotorYamaha();
        JenisMotor ymh = new JenisMotor();
        enk.setNama("Nama:");
        enk.getNama();
        enk.setHarga();
        enk.getHarga();
        ymh.setjenismotor("Jenis motor");
        ymh.getJenismotor();
        
        
        System.out.println("-------------------------------------");
        System.out.println(enk.getNama()+"Rp."+ymh.getJenismotor()+"jenis motor"+enk.getHarga()+"/motor");
        
    }
}
