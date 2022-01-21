public class OrderDetail {
    private double total;
    private double totalP;
    private Item item;
    public void setTotal(double p,int s,int h){
        item = new Item(p,s);
        item.setHarga(h);
        total = item.getHarga()+getTotalP();
    }
    public void setTotalP(double p,int s,int h){
        item = new Item(p,s);
        item.setHarga(h);
        totalP = item.getHarga()*item.getPajak();
    }
    public double getTotal(){
        return total;
    }
    public double getTotalP(){
        return totalP;
    }
}