public class Student extends People {
    private String umur = super.getUmur();
    private String kelas = "";

    public Student() {
    }
    
    public Student(String kelas, String nama, String umur, String sex) {
        super(nama, umur, sex);
        this.kelas = kelas;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String sentence() {
        return "My name is " + super.getNama() + " and " + umur + " years old. I am a good "
                + getSex() + " at " + getKelas();
    }
}