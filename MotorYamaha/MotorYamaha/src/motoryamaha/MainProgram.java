
package motoryamaha;

public class MainProgram {

    public static void main(String[] args) {
        MotorYamaha enk = new MotorYamaha();
        enk.setNama("Nama:");
        enk.getNama();
        enk.setHarga();
        enk.getHarga();
        
        System.out.println("-------------------------------------");
        System.out.println(enk.getNama()+"Rp."+enk.getHarga()+"/motor");
        
    }
}
