class Bank{
    private int balance;
    public int getbalance(){
        return balance;

    }
    public void setbalance(int bal){
        balance = bal;
    }

}
public class Encapsulation {
    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.setbalance(100);
        Bank b2 = new Bank();
        b2.setbalance(1000);
        
      System.out.println(b2.getbalance());
        System.out.println(b1.getbalance());
      
    }
}
