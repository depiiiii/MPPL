import javax.swing.JOptionPane;
 
public class Mahasiswa{
   
    String noInduk, nama, alamat;
    int usia;
    double ipk;
   
    public void setNoInduk(String x){
        this.noInduk = x;
    }
   
    public String getNoInduk(){
        return noInduk;
    }
   
    public void setNama(String x){
        this.nama = x;
    }
   
    public String getNama(){
        return nama;
    }
   
    public void setAlamat(String x){
        this.alamat = x;
    }
   
    public String getAlamat(){
        return alamat;
    }
   
    public void setUsia(int x){
        this.usia = x;
    }
   
    public int getUsia(){
        return usia;
    }
   
    public void setIpk(double x){
        this.ipk = x;
    }
   
    public double getIpk(){
        return ipk;
    }
   
    public static void print(String what){
        System.out.println(what);
    }
   
    public void printMahasiswa(int seqNo){
        print("Mahasiswa        :"+seqNo);
        print("---------------------------");
        print("No. Induk        :"+this.getNoInduk());
        print("Nama             :"+this.getNama());
        print("Alamat           :"+this.getAlamat());
        print("Usia             :"+this.getUsia());
        print("IPK              :"+this.getIpk());
    }
   
    public void showMessageDialog(int seqNo){
        String msg =
        "\nMahasiswa        :"+seqNo+
        "\n---------------------------"+
        "\nNo. Induk        :"+this.getNoInduk()+
        "\nNama             :"+this.getNama()+
        "\nAlamat           :"+this.getAlamat()+
        "\nUsia             :"+this.getUsia()+
        "\nIPK              :"+this.getIpk();
       
        JOptionPane.showMessageDialog(null,msg);
    }
}




