
public class BankAcc {
    
    int id;
    String fname, lname;
    String sort_code, acc_no;
    String tel;
    double money;
    boolean overdraft;

    public BankAcc(int id, String fname, String lname, String sort_code, String acc_no, String tel, double money, boolean overdraft) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.sort_code = sort_code;
        this.acc_no = acc_no;
        this.tel = tel;
        this.money = money;
        this.overdraft = overdraft;
    }

    BankAcc(int i, String cristy, String bonte, String string, String string0, String string1, int i0, boolean b, int i1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public String getSort_code() {
        return sort_code;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public String getTel() {
        return tel;
    }
    

    public double getMoney() {
        return money;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setSort_code(String sort_code) {
        this.sort_code = sort_code;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }
    
    
    
    
    
    
}
