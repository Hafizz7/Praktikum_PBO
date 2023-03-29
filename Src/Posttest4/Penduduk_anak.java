package posttest4;

public class Penduduk_anak extends penduduk{    
    private String nama_sekolah;
    private int tinggi;
    public Penduduk_anak(String nama,String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur, String nama_sekolah){
        super(nama, Jenis_kelamin, Alamat, Agama, Nik, Umur);
        this.nama_sekolah = nama_sekolah; 
    }
    //overload
    public Penduduk_anak(String nama, String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur, String nama_sekolah, int tinggi) {
        super(nama, Jenis_kelamin, Alamat, Agama, Nik, Umur);
        this.nama_sekolah = nama_sekolah;
        this.tinggi = tinggi;
    }
    public String getNama_sekolah() {
        return nama_sekolah;
    }    
    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }
    public int getTinggi() {
        return tinggi;
    }
    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }
    @Override
    public String getNama(){                
        return "Nama: " + nama;
    }
}