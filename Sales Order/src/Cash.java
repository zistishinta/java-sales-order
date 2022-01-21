import javax.swing.JOptionPane;
public class Cash extends Payment{
    public void getPayment(){
        JOptionPane.showMessageDialog(null,
        "====== Pembayaran Cash ====="
        +"\n-Payment = Rp."+(long)getJumlah());
    }
}