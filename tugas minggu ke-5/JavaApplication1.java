public class JavaApplication1 {

    public static void main(String[] args) {
        JavaApplication1 jv = new JavaApplication1();
        Student student = new Student();
        People people = new People();
        people.setNama("Kuji Ajjah");
        jv.output(people.getNama());
        System.out.println("Output Inheritance 1");
        student.setNama("Paijo Suda");
        student.setSex("Boy");
        student.setUmur("21");
        student.setKelas("4A");
        System.out.println(student.sentence());
        /////
        jv.output(people.getNama(), people.getUmur(), people.getSex());
        System.out.println("Output Inheritance 2");
        student = new Student("2B", "Rahayu Kuci", "21", "Girl");
        System.out.println(student.sentence());
    }
    
    public void output(String nama){
        System.out.println("Output pertama");
        System.out.println("Nama : " + nama + "\n");
    }
    
    public void output(String nama, String umur, String sex) {
        System.out.println("\nOutput kedua");
        System.out.println("Nama  : " + nama);
        System.out.println("Umur  : " + umur);
        System.out.println("Sex   : " + sex + "\n");
    }
}