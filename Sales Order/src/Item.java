public class Item {
    private String merk;
    private String barang;
    private int stok;
    private int harga;
    private double pajak;
    public Item(double tax, int stock){
        pajak = tax;
        stok = stock;
    }
    public void setMerk(String brand){
        merk = brand;
    }
    public void setBarang(String stuff){
        barang = stuff;
    }
    public void setHarga(int price){
        harga = price;
    }
    public String getMerk(){
        return merk;
    }
    public String getBarang(){
        return barang;
    }
    public int getStok(){
        return stok;
    }
    public int getHarga(){
        return harga;
    }
    public double getPajak(){
        return pajak;
    }
}