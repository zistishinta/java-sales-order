import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        //objek
        Customer klien = new Customer();
        Item item = new Item(0.05,3);//Memberikan Pajak : 5% dan stok barang : 3
        OrderDetail od = new OrderDetail();
        Order pesan = new Order();
        //Biodata Customer
        String name = JOptionPane.showInputDialog("Masukkan Nama :");
        klien.setNama(name);
        String address = JOptionPane.showInputDialog("Masukkan Alamat :");
        klien.setAlamat(address);
        //Mencari Barang
        String p1 = JOptionPane.showInputDialog(
        "====== Daftar Merk Laptop ======"
        +"\n1.ASUS"
        +"\n2.LENOVO"
        +"\n3.HP"
        +"\n-Pilihan Anda : ");
        int p2 = Integer.parseInt(p1);
        switch(p2){
            case 1:
                item.setMerk("ASUS");
                String p3 = JOptionPane.showInputDialog(
                "=================================== DAFTAR MODEL ====================================="
                +"\n1.ASUS A441 I5 NVIDIA RAM 4GB HDD 1TB       : Rp.8.500.000(Tunai) In Stock : "+item.getStok()
                +"\n2.ASUS M409S RYZEN 3 RAM 4GB HDD 1TB        : Rp.7.500.000(Tunai) In Stock : "+item.getStok()
                +"\n3.ASUS X555Q AMD A10 RAM 4GB HDD 1TB        : Rp.6.000.000(Tunai) In Stock : "+item.getStok()
                +"\n-Pilihan Anda : ");
                int p4 = Integer.parseInt(p3);
                switch(p4){
                    case 1 :
                        item.setBarang("A441 I5 NVIDIA RAM 4GB HDD 1TB");
                        item.setHarga(8500000);
                        break;
                    case 2 :
                        item.setBarang("M409S RYZEN 3 RAM 4GB HDD 1TB");
                        item.setHarga(7500000);
                        break;
                    case 3 :
                        item.setBarang("X555Q AMD A10 RAM 4GB HDD 1TB");
                        item.setHarga(6000000);
                        break;
                }break;
            case 2:
                item.setMerk("LENOVO");
                p3 = JOptionPane.showInputDialog(
                "==================================== DAFTAR MODEL ========================================"
                +"\n1.LENOVO YOGA 520 I5 NVIDIA RAM 8GB SSD 1TB     : Rp.9.000.000(Tunai)In Stock : "+item.getStok()
                +"\n2.LENOVO V145 AMD A9 RAM 4GB HDD 1TB            : Rp.8.500.000(Tunai)In Stock : "+item.getStok()
                +"\n3.LENOVO V330 RYZEN 3 RAM 4GB HDD 1TB           : Rp.6.000.000(Tunai)In Stock : "+item.getStok()
                +"\n-Pilihan anda : ");
                p4 = Integer.parseInt(p3);
                switch(p4){
                    case 1 :
                        item.setBarang("YOGA 520 I5 NVIDIA RAM 8GB SSD 1TB");
                        item.setHarga(9000000);
                        break;
                    case 2 :
                        item.setBarang("V145 AMD A9 RAM 4GB HDD 1TB ");
                        item.setHarga(8500000);
                        break;
                    case 3 :
                        item.setBarang("V330 RYZEN 3 RAM 4GB HDD 1TB");
                        item.setHarga(6000000);
                        break;
                }break;
            case 3:
                item.setMerk("HP");
                p3 = JOptionPane.showInputDialog(
                "========================================== DAFTAR MODEL ============================================"
                +"\n1.HP 245 G7 RYZEN 3 RAM 8GB SSD 500GB		: Rp.13.500.000(Tunai) In Stock : "+item.getStok()
                +"\n2.HP PAVILION X360 I5 NVIDIA RAM 8GB HDD 500GB	: Rp.10.000.000(Tunai) In Stock : "+item.getStok()
                +"\n3.HP ELITEBOOK 725 G3 AMD A8 RAM 8GB HDD 500GB	: Rp. 6.500.000(Tunai) In Stock : "+item.getStok()
                +"\n-Pilihan anda : ");
                p4 = Integer.parseInt(p3);
                switch(p4){
                    case 1 :
                        item.setBarang("245 G7 RYZEN 3 RAM 8GB SSD 500GB");
                        item.setHarga(13500000);
                        break;
                    case 2 :
                        item.setBarang("PAVILION X360 I5 NVIDIA RAM 8GB HDD 500GB");
                        item.setHarga(10000000);
                        break;
                    case 3 :
                        item.setBarang("ELITEBOOK 725 G3 AMD A8 RAM 8GB HDD 500GB");
                        item.setHarga(6500000);
                        break;
                }break;
        }
        od.setTotalP(item.getPajak(),item.getStok(),item.getHarga());
        od.setTotal(item.getPajak(),item.getStok(),item.getHarga());
        pesan.setSubTotal(od.getTotal());
        pesan.printOrder(klien.getNama(),klien.getAlamat(),item.getPajak(),item.getStok(),item.getMerk(),item.getBarang());
        String p =  JOptionPane.showInputDialog(
        "========= Metode Pembayaran ==========="
        +"\n1.Cash"
        +"\n2.Check"
        +"\n3.Kredit"
        +"\n-Pilihan Anda :");
        int pp = Integer.parseInt(p);
        switch(pp){
            case 1:
                Cash tunai = new Cash();
                tunai.setJumlah(pesan.getSubTotal());
                tunai.getPayment();
                break;
            case 2:
                Check cek = new Check();
                cek.setJumlah(pesan.getSubTotal());
                String bank = JOptionPane.showInputDialog("Masukkan Bank ID anda");
                cek.setBank(bank);
                cek.getPayment();
                break;
            case 3:
                Credit kredit = new Credit();
                kredit.setJumlah(pesan.getSubTotal());
                String m = JOptionPane.showInputDialog("Masukkan berapa bulan di Angsur (6/9/12) Bulan");
                int month = Integer.parseInt(m);
                kredit.setBulan(month);
                kredit.getPayment();
                break;
        }
    }   
}