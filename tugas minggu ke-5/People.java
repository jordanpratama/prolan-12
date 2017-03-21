public class People {
    private String nama = "";
    private String umur = "7";
    private String sex = "";

    public People() {
    }

    public People(String nama, String umur, String sex) {
        this.nama = nama;
        this.umur = umur;
        this.sex = sex;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}