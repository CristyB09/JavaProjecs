
package bankapp;


public class BankAccount {
   int id;
   String fname,lname;
   String sort_code, acc_no;
   String tel;
   double money;
   boolean overdraft;
   double overdraft_money;

    public BankAccount(int id, String fname, String lname, String sort_code, String acc_no, String tel, double money, boolean overdraft, double overdraft_money) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.sort_code = sort_code;
        this.acc_no = acc_no;
        this.tel = tel;
        this.money = money;
        this.overdraft = overdraft;
        this.overdraft_money = overdraft_money;
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getSort_code() {
        return sort_code;
    }

    public void setSort_code(String sort_code) {
        this.sort_code = sort_code;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public boolean isOverdraft() {
        return overdraft;
    }

    public void setOverdraft(boolean overdraft) {
        this.overdraft = overdraft;
    }

    public double getOverdraft_money() {
        return overdraft_money;
    }

    public void setOverdraft_money(double overdraft_money) {
        this.overdraft_money = overdraft_money;
    }

    @Override
    public String toString() {
        return "BankAccount{" + "id=" + id + ", fname=" + fname + ", lname=" + lname + ", sort_code=" + sort_code + ", acc_no=" + acc_no + ", tel=" + tel + ", money=" + money + ", overdraft=" + overdraft + ", overdraft_money=" + overdraft_money + '}';
    }
   
   
   
}
