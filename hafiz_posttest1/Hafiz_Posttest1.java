package pkg2109106045_muh.hafiz_posttest1;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class Hafiz_Posttest1 {
    public static void main(String[] args) throws Exception {
        ArrayList nama_a = new ArrayList<>();
        ArrayList umur_a = new ArrayList<>();
        ArrayList nik_a = new ArrayList<>();
        ArrayList jenis_kelamin_a = new ArrayList<>();
        ArrayList alamat_a = new ArrayList<>();
        ArrayList agama_a = new ArrayList<>();
        
        InputStreamReader ior = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ior);
        menu_utama mnu = new menu_utama();
        int input_menu;
        String nama, jenis_kelamin, alamat, agama;
        int nik;
        int umur, ganti, hapus;
        while(true){
            if(nama_a.size() == 0){
                String[] name = {"Muh. Hafiz", "Irysadul", "Riski", "Sherina", "Ayu", "Chintia", "Herni"};
                String[] jenis_kelaminn = {"Laki-laki", "Laki-laki", "Laki-laki", "Perempuan", "Perempuan", "Perempuan", "Perempuan"};
                String[] lokasi = {"Samarinda", "Telung Agung", "Samarinda", "Jawa Timur", "Jogja", "Samarinda", "Samarinda", "Samarinda"};
                String[] agamae = {"Islam", "Isalam", "Islam", "Isalam", "Islam", "Isalam", "Islam", "Isalam"};
                long[] nike = {6472320212003002L, 6472231204004001L,64723420508003004L,6472322305003004L,6472323004003005L, 64723224005002L,64721233442244221L,64728209102032001L};
                int[] umure = {31,18,54,18,19,21,22,18};
                for(int c = 0; c < 7; c++){
                    
                    create t_create1 = new create(name[c],jenis_kelaminn[c], lokasi[c], agamae[c], nike[c], umure[c]);                    
                    nama_a.add(t_create1.nama);
                    jenis_kelamin_a.add(t_create1.jenis_kelamin);                
                    alamat_a.add(t_create1.alamat);
                    agama_a.add(t_create1.agama);
                    umur_a.add(t_create1.umur);                
                    nik_a.add(t_create1.nik);
                    
                    
                }
//                create t_create1 = new create("Hafiz","Laki-laki", "Samarinda", "Islam", 010202030202, 20);                
                
            }
            else{
                mnu.menuu();
                input_menu = Integer.parseInt(br.readLine());
                if(input_menu == 1){                
                    System.out.print("Input Nama: ");
                    nama = br.readLine();                
                    System.out.print("Input Jenis Kelamin: ");
                    jenis_kelamin = br.readLine();                
                    System.out.print("Input Alamat: ");
                    alamat = br.readLine();                                
                    System.out.print("Input Umur: ");
                    umur = Integer.parseInt(br.readLine());
                    System.out.print("Input Agama: ");
                    agama = br.readLine();
                    System.out.print("Input NIK: ");
                    nik = Integer.parseInt(br.readLine());


                    create t_create = new create(nama,jenis_kelamin, alamat, agama, nik, umur);                    
                    
                    nama_a.add(t_create.nama);
                    jenis_kelamin_a.add(t_create.jenis_kelamin);                
                    alamat_a.add(t_create.alamat);
                    agama_a.add(t_create.agama);
                    umur_a.add(t_create.umur);                
                    nik_a.add(t_create.nik);

                }
                else if(input_menu == 2){
                    if(nama_a.size() == 0){
                        System.out.println("Data masih Kosong");
                    }
                    else{
                        for(int b = 0; b < nama_a.size(); b++){
                            System.out.println("NO " + b);
                            System.out.println("nama: " +nama_a.get(b));
                            System.out.println("jenis kelamin: " + jenis_kelamin_a.get(b));                    
                            System.out.println("Alamat: " + alamat_a.get(b));
                            System.out.println("Agama: " + agama_a.get(b));
                            System.out.println("umur: " + umur_a.get(b));
                            System.out.println("NIK: " + nik_a.get(b));
                            System.out.println("--------------------------------------------");
                        }
                    }
                }
                else if(input_menu == 3){
                    System.out.println("Input Index yang Ingin di Ganti: ");
                    ganti = Integer.parseInt(br.readLine());
                    System.out.println("Input Data Baru: ");
                    System.out.println("Nama: ");
                    nama = br.readLine();
                    System.out.print("Alamat: ");
                    alamat = br.readLine();
                    System.out.print("Agama: ");
                    agama = br.readLine();

                    update t_update = new update(ganti, nama, alamat, agama);
                    nama_a.set(t_update.ganti, t_update.nama);
                    alamat_a.set(t_update.ganti, t_update.alamat);
                    agama_a.set(t_update.ganti, t_update.agama);

                }
                else if(input_menu == 4){
                    System.out.print("Input index yang Ingin di Hapus: ");
                    hapus = Integer.parseInt(br.readLine());
                    delete t_delete = new delete(hapus);

                    nama_a.remove(t_delete.hapus);

                }
                else if(input_menu == 5){
                    int total = nama_a.size();
                    System.out.println("Jumlah Penduduk: " + total);
                }   
                else if(input_menu == 6){
                    break;
                }
                else{
                    System.out.println("Maaf Anda Salah Input");
                }   
            }            
        }
    }    
}
