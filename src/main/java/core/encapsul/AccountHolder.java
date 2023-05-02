package core.encapsul;

import core.methods.A;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AccountHolder {
    //data hiding
    //protecting data i.e variables/methods with private acc modifer and accessing them with public setter&getter is encapsulation
    private int cid;//12
    private String custName;
    private long accNum;
    private String IFSC;
    private int balance;

    public int getCid() {
        return cid;
    }

    public void setCid(int xx) {
        this.cid = xx;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public String getIFSC() {
        return IFSC;
    }

    public void setIFSC(String IFSC) {
        this.IFSC = IFSC;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public AccountHolder(int cid) {
        this.cid = cid;
    }

   /* public static void main(String[] args) {
        AccountHolder ac = new AccountHolder();
        ac.setBalance(300000);
        System.out.println(ac.getBalance());
        ac.setCid(12);
        System.out.println(ac.getCid());
        //System.out.println(ac.cid);
    }*/
}
