package posttest6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
class data_akun{
    private String username;
    private String password;
    public data_akun(String username, String password){
        this.password = password;
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}
public class akun implements login_interface{            
    final String admin = "admin";
    final String passwowdAdmin = "123";
    InputStreamReader ior = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(ior);
    static ArrayList<data_akun> akun = new ArrayList<data_akun>();                  
    @Override           
    public void input_akun() throws IOException {
        for(int a = 0; a < 3; a++){
            String[] userrnamee = {"hafiz", "riski", "user"};
            String[] password2 = {"12345", "riski455", "123"};    
            data_akun AkunAda = new data_akun(userrnamee[a], password2[a]);
            akun.add(AkunAda);
           }                               
        String username; 
        String password;
        int percobaan = 3;
        System.out.println("SILAHKAN INPUT AKUN");
        boolean isAdmin = false;
        while (percobaan > 0) {            
            System.out.print("Input Username: ");
            username = br.readLine();
            System.out.print("Input Password: ");
            password = br.readLine();
            boolean isFound = false;
            for (data_akun  dataAkun : akun) {
                if (dataAkun.getUsername().equals(username) && dataAkun.getPassword().equals(password)) {
                    isFound = true;
                    break;
                }
                if (username.equals(admin) && password.equals(passwowdAdmin)){                    
                    isAdmin = true;
                    login_interface cobalogin = new admin();
                    cobalogin.buat_akun();
                    break;
                }
            }
            if (isFound) {
                System.out.println("Login berhasil");
                break;
            }
            else if(isAdmin){
                System.out.println("Login berhasil");
                input_akun();
                break;
            }
            else {
                System.out.println("Login gagal");
                percobaan--;
                System.out.println("Sisa Percobaan " + percobaan);
                
            }
        }
        if (percobaan <= 0) {
            System.out.println("Anda sudah mencoba login sebanyak 3 kali. Program berhenti.");
            System.exit(0);
        }
    }

    @Override
    public void buat_akun() throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}