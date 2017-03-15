public class JavaApplication {

    public static void main(String args[]) {
        People people = new People("Bambang", "3B");
        JavaApplication jv = new JavaApplication();
        jv.output(people.getNama());
        people.setNama("Raharjo");
        people.setKelas("4A");
        jv.output(people.getNama(), people.getKelas());
    }
    
    public void output(String nama){
        System.out.println("Output pertama");
        System.out.println("Nama : " + nama);
    }
    
    public void output(String nama, String kelas) {
        System.out.println("Output kedua");
        System.out.println("Nama  : " + nama);
        System.out.println("Kelas : " + kelas);
    }
}