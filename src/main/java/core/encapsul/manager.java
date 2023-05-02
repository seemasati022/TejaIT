package core.encapsul;

public class manager {
    //initialization - constructor or encapsulation(pvt member, public g&S) can be used.
    public static void main(String[] args) {
        AccountHolder a1 = new AccountHolder(); //default constructor
        a1.setCid(1234);
        a1.setAccNum(996666);               //setter - write operation
        a1.setCustName("seema");
        a1.setBalance(98000);
        a1.setIFSC("icic0003222");
        a1.setIFSC("abc0003432");       //multiple times setter meth can be called and we can re-initialize the varibale. no memory cost. only single obj

        System.out.println(a1.getCid());            //getter -read operation
        System.out.println(a1.getAccNum());
        System.out.println(a1.getCustName());
        System.out.println(a1.getBalance());
        System.out.println(a1.getIFSC());

        AccountHolder a2 = new AccountHolder(9898);     //using constructor initialization, memory cost is high and we have to create obj
                                                            //everytime to set any 1 or more variable using constructor.
        System.out.println(a2.getCid());
        a2.setCid(777);
        System.out.println(a2.getCid());
    }
}
