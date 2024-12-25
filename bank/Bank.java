package bank;

class Account {
    public String name; // Attribute to store account name
    protected String email;
    private String password;

    // using getter
    public String getpass() {
        return this.password;
    }

    // using setter
    public String setpass(String pass) {
        this.password = pass;
        return this.password;

    }

}

public class Bank {

    public static void main(String[] args) {
        Account account1 = new Account();
        account1.name = "Lalit Devda";
        account1.email = "lalitdevda3449@gmail.com";
        System.out.println(account1.setpass("\nPassword@1223"));
        // account1.age=18; can use here because it is private
    }
}