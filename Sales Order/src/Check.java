import javax.swing.JOptionPane;
public class Check extends Payment{
    private String bankID;
    private int charge = 5000;
    public void setBank(String bank){
        bankID = bank;
    }
    public String getBank(){
        return bankID;
    } 
    public void getPayment(){
        JOptionPane.showMessageDialog(null,
        "====== Pembayaran Cek ====="
        +"\n-Bank ID    :   "+getBank()
        +"\n-Payment + Charge = Rp."+(long)(getJumlah()+charge));
    }
}