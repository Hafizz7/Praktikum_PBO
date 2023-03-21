package posttest3;
public class Penduduk_anak extends penduduk{
    private String nama_sekolah;
    
    public Penduduk_anak(String nama,String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur, String nama_sekolah){
        super(nama, Jenis_kelamin, Alamat, Agama, Nik, Umur);
        this.nama_sekolah = nama_sekolah; 
    }
    public String getNama_sekolah() {
        return nama_sekolah;
    }    
    public void setNama_sekolah(String nama_sekolah) {
        this.nama_sekolah = nama_sekolah;
    }
}