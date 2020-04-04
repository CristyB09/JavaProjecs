
public class BankAcc {
    
    
    
    int id;
    String fname;
    String lname;
    String tel;
    String sort_code;
    String accno;
    double money;
    boolean overdraft;

    public BankAcc(int id, String fname, String lname, String tel, String sort_code, String accno, double money, boolean overdraft) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.tel = tel;
        this.sort_code = sort_code;
        this.accno = accno; 
        this.money = money;
        this.overdraft = overdraft;
    }

   
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getTel() {
        return tel;
    }

    public String getSort_code() {
        return sort_code;
    }

    public String getAccnio() {
        return accno;
    }

    public double getMoney() {
        return money;
    }

    public boolean isOverdraft() {
        return overdraft;
    }
    
    
    
}
