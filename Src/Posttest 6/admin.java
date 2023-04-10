package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static posttest6.akun.akun;

public class admin implements login_interface {
    @Override
    public void buat_akun() throws IOException{
            InputStreamReader ior = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(ior);
            System.out.println("------------------------------------------------");
            System.out.println("SELAMAT DATANG DI MENU TAMBAH AKUN BAGI ADMIN");
            System.out.println("------------------------------------------------");        
            System.out.println("1. Buat Akun");
            System.out.println("2. Keluar");
            System.out.print("Silahkan Pilih Menu Yang Ada: ");
            int pilih = Integer.parseInt(br.readLine());
            if (pilih == 1){
                System.out.print("Input Username: ");
                String t_username = br.readLine();
                System.out.print("Input Password: ");
                String t_password = br.readLine();
                data_akun dataakun = new data_akun(t_username, t_password);
                akun.add(dataakun);
                System.out.println("AKUN TELAH BERHASIL DI BUAT"); 
                //buat_akun();
    //            break;
    //            login cobalogin = new akun();
    //            cobalogin.buat_akun();
            }
            else if(pilih == 2){
                
            }
        }    

    @Override
    public void input_akun() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
