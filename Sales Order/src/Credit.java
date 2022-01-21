import javax.swing.JOptionPane;
public class Credit extends Payment{
    private int bulan;
    private double angsuran;
    public void setBulan(int month){
        bulan = month;
    }
    public int getBulan(){
        return bulan;
    }
    public double getAngsuran(){
        angsuran = (getJumlah()+1000000)/bulan;
        return angsuran;
    }
    public void getPayment(){
        JOptionPane.showMessageDialog(null,
        "====== Pembayaran Kredit ====="
        +"\n-Diangsur "+bulan+" bulan "
        +"\n-Payment     = Rp."+(long)getAngsuran());
    }
}