package posttest4;
class menu_utama {
    void menuu(){
        System.out.println("SIlahkan Pilih Menu Yang Di Inginkan!");
        System.out.println("1. Tambah Data");
        System.out.println("2. Lihat Data");
        System.out.println("3. Update Data");
        System.out.println("4. Hapus Data");
        System.out.println("5. Lihat Jumlah Penduduk");
        System.out.println("6. Keluar");
        System.out.print("Input Pilihan: ");
        }
}
public class penduduk{
    protected String nama;
    protected String jenis_kelamin;
    protected String alamat;
    protected String agama;
    protected int umur;
    protected long nik;
    
    public penduduk(String Nama, String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur){
        this.nama = Nama;
        this.jenis_kelamin = Jenis_kelamin;
        this.alamat = Alamat;
        this.agama = Agama;
        this.umur = Umur;
        this.nik = Nik;
    }
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kelamin() {
        return jenis_kelamin;
    }

    public void setJenis_kelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getAgama() {
        return agama;
    }

    public void setAgama(String agama) {
        this.agama = agama;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public long getNik() {
        return nik;
    }

    public void setNik(long nik) {
        this.nik = nik;
    }    
}
class update{
    String nama, alamat,agama;
    int ganti;
    public update(int Ganti, String Nama, String Alamat, String Agama){
        this.nama = Nama;
        this.alamat = Alamat;
        this.agama = Agama;
        this.ganti = Ganti;
    }
}

class delete{
    int hapus;
    public delete(int Hapus){
        this.hapus = Hapus;
    }
}