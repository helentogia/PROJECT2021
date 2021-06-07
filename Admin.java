package ceid.project2021;

public class Admin extends User {
    //Constructors
    public Admin(String name, String phone) {
        super(name, phone, true);//Set isAdmin to true by default
    }
    
    @Override
    public String toString() {
        String s = super.toString();
        s += "Privilege: Administrator\n";
        return s;
    }
}
