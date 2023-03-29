package posttest4;

public class Penduduk_lansia extends penduduk{
    private String penyakit;
    
    public Penduduk_lansia(String nama,String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur, String penyakit){
        super(nama, Jenis_kelamin, Alamat, Agama, Nik, Umur);
        this.penyakit = penyakit; 
    }
    public String getPenyakit() {
        return penyakit;
    }    
    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }
    //overload
    public void setPenyakit(String penyakit, int lama_penyakit) {
        this.penyakit = " Penyakit: " + penyakit + "\nLama Penyakit: " + lama_penyakit;
    }    
    
}
