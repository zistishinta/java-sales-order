import java.util.Date;
import javax.swing.JOptionPane;
public class Order {
    private double subtotal;
    private Date date = new Date();
    public Customer klien = new Customer();
    public OrderDetail od = new OrderDetail();
    public Item item;
    
    public void setSubTotal(double t){
        subtotal = t;
    }
    public double getSubTotal(){
        return subtotal;
    }
    public void printOrder(String n,String a,double t,int s,String b,String stuff){
        klien = new Customer();
        klien.setNama(n);
        klien.setAlamat(a);
        item = new Item(t,s);
        item.setMerk(b);
        item.setBarang(stuff);
        JOptionPane.showMessageDialog(null,
        "================= Order Detail ================"
        +"\nTanggal     : "+date.toString()
        +"\n-Nama       : "+klien.getNama()
        +"\n-Alamat     : "+klien.getAlamat()
        +"\n-Merk       : "+item.getMerk()
        +"\n-Model      : "+item.getBarang()
        +"\n-SubTotal   : Rp."+(long)getSubTotal());
    }
}