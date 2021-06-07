package ceid.project2021;

import java.util.Objects;

public abstract class User {
    //Fields
    private String name;
    private String phone;
    private boolean isAdmin;
    
    //Constructors
    public User () {
        name = "";
        phone = "";
        isAdmin = false;
    } //Default Constructor
    
    public User(String name, String phone, boolean isAdmin) {
        this.name = name;
        this.phone = phone;
        this.isAdmin = isAdmin;
    }
    
    //Getters methods
    public String getName() {
        return name;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public boolean getAdmin() {
        return isAdmin;
    }
    
    //Setters methods
    public void setName(String name) {
        this.name = name;
    }
    
    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public void setAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }
    
    @Override
    public String toString() {
        String s = "Name:" + name + "\n";
        s += "Phone: " + phone + "\n";
        return s;
    }
    
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof User)) return false;
        User other = (User) o;
        boolean sameUser = (this.phone == null && other.phone == null
                || this.phone != null && this.phone.equals(other.phone));
        return sameUser;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.phone);
        return hash;
    }
}
