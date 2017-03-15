public class People {
    private String nama;
    private String kelas;
    
    public People(String nama, String kelas){
        this.setNama(nama);
        this.setKelas(kelas);
    }
    
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
}