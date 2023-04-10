package posttest6;

public class Penduduk_lansia extends penduduk {
    private String penyakit;
    private int lama_penyakit;

    public Penduduk_lansia(String nama, String Jenis_kelamin, String Alamat, String Agama, long Nik, int Umur, String penyakit, int lama_penyakit) {
        super(nama, Jenis_kelamin, Alamat, Agama, Nik, Umur);
        this.penyakit = penyakit;
        this.lama_penyakit = lama_penyakit;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    // overload
    public static void printPenyakit(Penduduk_lansia penduduk) {
        System.out.println("Penyakit: " + penduduk.penyakit + "\nLama Penyakit: " + penduduk.lama_penyakit + " Bulan");
    }

    @Override
    public double bmi() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getLama_penyakit() {
        return lama_penyakit;
    }

    public void setLama_penyakit(int lama_penyakit) {
        this.lama_penyakit = lama_penyakit;
    }
}
