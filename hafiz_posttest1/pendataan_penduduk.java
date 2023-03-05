package pkg2109106045_muh.hafiz_posttest1;
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
class create{
    String nama, jenis_kelamin, alamat, agama;
    int nik, umur;
    
    public create(String Nama, String Jenis_kelamin, String Alamat, String Agama, int Nik, int Umur){
        this.nama = Nama;
        this.jenis_kelamin = Jenis_kelamin;
        this.alamat = Alamat;
        this.agama = Agama;
        this.umur = Umur;
        this.nik = Nik;
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