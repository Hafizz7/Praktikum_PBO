package posttest5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
    static ArrayList<Penduduk_anak> anakee = new ArrayList<Penduduk_anak>();
    static ArrayList<Penduduk_lansia> lansiaee = new ArrayList<Penduduk_lansia>();
    public static void main(String[] args) throws Exception {
        Scanner scr = new Scanner(System.in);                
        InputStreamReader ior = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ior);
        menu_utama mnu = new menu_utama();
        int input_menu;
        while(true){
            if(anakee.isEmpty()){                                
                for(int c = 0; c < 7; c++){
                    String[] name = {"Muh. Hafiz", "Irysadul", "Riski", "Sherina", "Ayu", "Chintia", "Herni"};
                    String[] jenis_kelaminn = {"Laki-laki", "Laki-laki", "Laki-laki", "Perempuan", "Perempuan", "Perempuan", "Perempuan"};
                    String[] lokasi = {"Samarinda", "Telung Agung", "Samarinda", "Jawa Timur", "Jogja", "Samarinda", "Samarinda", "Samarinda"};
                    String[] agamae = {"Islam", "Isalam", "Islam", "Isalam", "Islam", "Isalam", "Islam", "Isalam"};
                    String[] sekolah = {"Smpn 1 Samarinda", "Smpn 1 Samarinda", "Smpn 1 Samarinda", "Smpn 1 Samarinda", "Smpn 1 Samarinda", "Smpn 1 Samarinda", "Smpn 1 Samarinda"};
                    long[] nike = {6472320212003002L, 6472231204004001L,64723420508003004L,6472322305003004L,6472323004003005L, 64723224005002L,64721233442244221L,64728209102032001L};
                    int[] umure = {31,18,54,18,19,21,22,18};
                    int[] tinggi = {175,170,172,160,160,162,163};
                    int[] berat_badan = {62,72,72,76,77,60,68};
                    Penduduk_anak pendanak = new Penduduk_anak(name[c],jenis_kelaminn[c], lokasi[c], agamae[c], nike[c], umure[c], sekolah[c], berat_badan[c], tinggi[c]);
                    anakee.add(pendanak);              
                }                        
                for(int c = 0; c < 3; c++){
                    String[] name = {"Haji Joko", "Haji Santoso", "Pak Bakri"};
                    String[] jenis_kelaminn = {"Laki-laki", "Laki-laki", "Laki-laki"};
                    String[] lokasi = {"Samarinda", "Telung Agung", "Samarinda"};
                    String[] agamae = {"Islam", "Isalam", "Islam"};
                    String[] penyakit = {"Radang Sendi", "Hipertensi", "Radang Sendi"};
                    long[] nike = {647221011120001L, 6471121031002001L,64721230402003003L};
                    int[] umure = {82,80,101};                    
                    Penduduk_lansia pendaklansia = new Penduduk_lansia(name[c],jenis_kelaminn[c], lokasi[c], agamae[c], nike[c], umure[c], penyakit[c]);                    
                    lansiaee.add(pendaklansia);  
                    
                }
            }
            else{
                mnu.menuu();
                input_menu = Integer.parseInt(br.readLine());
                if(input_menu == 1){
                    System.out.println("Input data berdasarkan: ");
                    System.out.println("1. Penduduk Anak");
                    System.out.println("2. Penduduk Lansia");                    
                    int input_menu2 = Integer.parseInt(br.readLine());                    
                    if(input_menu2 == 1){
                        System.out.print("Masukkan Nama: ");
                        String t_nama = br.readLine();
                        System.out.print("Masukkan Jenis Kelamin: ");
                        String t_kelamin = br.readLine();
                        System.out.print("Masukkan Alamat: ");
                        String t_alamat = br.readLine();
                        System.out.print("Masukkan Agama: ");
                        String t_agama = br.readLine();
                        System.out.print("Masukkan NIK: ");
                        long t_nike = scr.nextLong();
                        System.out.print("Masukkan Umur: ");
                        int t_umur = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Sekolah: ");
                        String t_sekolah = br.readLine();
                        System.out.print("Masukkan Tinggi: ");
                        int t_tinggi = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Berat Badan: ");
                        int t_beratbadan = Integer.parseInt(br.readLine());
                        Penduduk_anak pendanak = new Penduduk_anak(t_nama, t_kelamin, t_alamat, t_agama, t_nike, t_umur, t_sekolah, t_beratbadan, t_tinggi);
                        anakee.add(pendanak);                                                 
                    }
                    else if(input_menu2 == 2){
                        System.out.print("Masukkan Nama: ");
                        String t_nama = br.readLine();
                        System.out.print("Masukkan Jenis Kelamin: ");
                        String t_kelamin = br.readLine();
                        System.out.print("Masukkan Alamat: ");
                        String t_alamat = br.readLine();
                        System.out.print("Masukkan Agama: ");
                        String t_agama = br.readLine();
                        System.out.print("Masukkan NIK: ");
                        long t_nike = scr.nextLong();
                        System.out.print("Masukkan Umur: ");
                        int t_umur = Integer.parseInt(br.readLine());
                        System.out.print("Masukkan Penyakit: ");
                        String t_penyakit = br.readLine();
                        
                        Penduduk_lansia pendalansia = new Penduduk_lansia(t_nama, t_kelamin, t_alamat, t_agama, t_nike, t_umur, t_penyakit);                        
                        lansiaee.add(pendalansia);   
                        
                    }
                    else{
                        System.out.println("Maaf Anda Salah Input");
                    }
                }
                else if(input_menu == 2){
                    if(anakee.size() == 0){
                        System.out.println("Data masih Kosong");
                    }                    
                    else{
                        System.out.println("Lihat Data Berdasarkan: ");                        
                        System.out.println("1. Penduduk Anak-anak");
                        System.out.println("2. Penduduk Lansia");
                        int pilihh = Integer.parseInt(br.readLine());                        
                        if(pilihh == 1){
                            for(int b = 0; b < anakee.size(); b++){
                                System.out.println("NO " + (b + 1));
                                System.out.println(anakee.get(b).getNama());
//                                System.out.println("nama: " + anakee.get(b).nama);
                                System.out.println("jenis kelamin: " + anakee.get(b).jenis_kelamin);                    
                                System.out.println("Alamat: " + anakee.get(b).alamat);
                                System.out.println("Agama: " + anakee.get(b).agama);
                                System.out.println("umur: " + anakee.get(b).umur);
                                System.out.println("NIK: " + anakee.get(b).nik);                                                               
                                System.out.println("Nama Sekolah: " + anakee.get(b).getNama_sekolah());
                                System.out.println("Tinggi: " + anakee.get(b).getTinggi());
                                System.out.println("Berat Badan: " + anakee.get(b).getBeratbadan());                                
                                double bmi = anakee.get(b).bmi();
                                System.out.println("BMI : " + bmi);
//                                System.out.println(anakee.get(b).toString());
                                System.out.println("--------------------------------------------");
                            }
                        }
                        
                        else if(pilihh == 2){
                            for(int c = 0; c < lansiaee.size(); c++){
                                System.out.println("NO " + (c + 1));
                                System.out.println("nama: " + lansiaee.get(c).nama);
                                System.out.println("jenis kelamin: " + lansiaee.get(c).jenis_kelamin);                    
                                System.out.println("Alamat: " + lansiaee.get(c).alamat);
                                System.out.println("Agama: " + lansiaee.get(c).agama);
                                System.out.println("umur: " + lansiaee.get(c).umur);
                                System.out.println("NIK: " + lansiaee.get(c).nik);
                                System.out.println("Nama Penyakit: " + lansiaee.get(c).getPenyakit());
                                lansiaee.get(c).setPenyakit("radang sendi", 2);                                                                
                                
                                System.out.println("--------------------------------------------");
                            }
                        }                        
                    }
                }
                else if(input_menu == 3){
                    System.out.println("UPDATE DATA");
                    System.out.println("Update Beradasarkan Apa?!");
                    System.out.println("1. Penduduk Anak");
                    System.out.println("2. Penduduk Lansia");                    
                    int pilih_update = Integer.parseInt(br.readLine());
                    if(pilih_update == 1){
                        System.out.println("Input Index yang Ingin di Ganti: ");
                        int ganti = Integer.parseInt(br.readLine());      
                        ganti = ganti - 1;
                        System.out.println("-------------------------------------------");
                        System.out.println("Nama Yang Akan Di Ganti: " + anakee.get(ganti).getNama());
                        System.out.println("-------------------------------------------");
                        System.out.println("------Input Data Baru------");
                        System.out.print("Nama: ");
                        String nama = br.readLine();
                        System.out.print("Alamat: ");
                        String alamat = br.readLine();
                        System.out.print("Agama: ");
                        String agama = br.readLine();
                        System.out.print("Sekolah: ");
                        String sekolah = br.readLine();
                        System.out.print("Tinggi: ");
                        int tinggi = Integer.parseInt(br.readLine());
                        System.out.print("Berat Badan: ");
                        int berat_bada = Integer.parseInt(br.readLine());                        
                        
                        anakee.get(ganti).setNama(nama);
                        anakee.get(ganti).setAlamat(alamat);
                        anakee.get(ganti).setAgama(agama);
                        anakee.get(ganti).setNama_sekolah(sekolah);
                        anakee.get(ganti).setTinggi(tinggi);
                        anakee.get(ganti).setBeratbadan(berat_bada);
                        
                        System.out.println("Data Berhasil di Update");
                    }
                    else if(pilih_update == 2){
                     System.out.println("Input Index yang Ingin di Ganti: ");
                        int ganti = Integer.parseInt(br.readLine());
                        ganti = ganti - 1;
                        System.out.println("-------------------------------------------");
                        System.out.println("Nama Yang Akan Di Ganti: " + lansiaee.get(ganti).getNama());
                        System.out.println("-------------------------------------------");
                        System.out.println("------Input Data Baru------");
                        System.out.print("Nama: ");
                        String nama = br.readLine();
                        System.out.print("Alamat: ");
                        String alamat = br.readLine();
                        System.out.print("Agama: ");
                        String agama = br.readLine();
                        System.out.print("Penyakit: ");
                        String penyakit = br.readLine();
                        
                        lansiaee.get(ganti).setNama(nama);
                        lansiaee.get(ganti).setAlamat(alamat);
                        lansiaee.get(ganti).setAgama(agama);
                        lansiaee.get(ganti).setPenyakit(penyakit);
                        
                        System.out.println("Data Berhasil di Update");   
                    }
                    else{
                        System.out.println("Salah Input!!");
                    }
                }
                else if(input_menu == 4){
                    System.out.println("MENU DELETE");
                    System.out.println("1. Penduduk Anak");
                    System.out.println("2. Penduduk Lansia");
                    System.out.print("Silahkan Pilih Data yang Ingin Di Hapus: ");
                    int hapus_pilih = Integer.parseInt(br.readLine());
                    if(hapus_pilih == 1){
                        System.out.print("Input index yang Ingin di Hapus: ");
                        int hapus = Integer.parseInt(br.readLine());
                        hapus = hapus - 1;
                        System.out.println("-------------------------------------------");
                        System.out.println("Nama Yang Akan Di Hapus: " + anakee.get(hapus).getNama());
                        System.out.println("-------------------------------------------");
                        System.out.println("Yakin Ingin Hapus Data Tersebut! ya/no");
                        String ya_hapus = br.readLine();
                        delete t_delete = new delete(hapus);                        
                        if(ya_hapus.equals("ya") || ya_hapus.equals("y")){                            
                            anakee.remove(t_delete.hapus);
                            System.out.println("DATA TELAH DI HAPUS");
                        }
                        else if(ya_hapus.equals("n")|| ya_hapus.equals("no")){
                            System.out.println("Anda Membatalkan");
                        }
                        else{
                            System.out.println("Anda Salah Input");
                        }
                        
                    }
                    else if(hapus_pilih == 2){
                        System.out.print("Input index yang Ingin di Hapus: ");
                        int hapus = Integer.parseInt(br.readLine());
                        hapus = hapus - 1;
                        System.out.println("-------------------------------------------");
                        System.out.println("Nama Yang Akan Di Hapus: " + lansiaee.get(hapus).getNama());
                        System.out.println("-------------------------------------------");
                        System.out.print("Yakin Ingin Hapus Data Tersebut! y/n: ");
                        delete t_delete = new delete(hapus);  
                        String ya_hapus = br.readLine();                        
                        if(ya_hapus.equals("ya") || ya_hapus.equals("y")){                            
                            lansiaee.remove(t_delete.hapus);                            
                            System.out.println("DATA TELAH DI HAPUS");
                        }
                        else if(ya_hapus.equals("n")|| ya_hapus.equals("no")){
                            System.out.println("Anda Membatalkan");
                        }
                        else{
                            System.out.println("Anda Salah Input");
                        }
                    }                    
                    else{
                        System.out.println("Maaf Anda Salah Input");
                    }                    
                }
                else if(input_menu == 5){
                        int total_anak = anakee.size();
                        int total_lansia = lansiaee.size();
                        int total = total_anak + total_lansia;
                        System.out.println("Jumlah Penduduk: " + total);
                    }
                else if(input_menu == 6){
                    break;
                }
            }
        }
    }    
}
