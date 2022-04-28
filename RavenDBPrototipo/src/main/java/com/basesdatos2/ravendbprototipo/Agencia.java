package com.basesdatos2.ravendbprototipo;

public class Agencia {
    private String legal_Id; //Cédula Jurídica
    private String name;
    private String phone;
    private String email;

    public Agencia() {
    }

    public Agencia(String legal_Id, String name, String phone, String email) {
        this.legal_Id = legal_Id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    public String getLegal_Id() {
        return legal_Id;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public void setLegal_Id(String legal_Id) {
        this.legal_Id = legal_Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Agencia{" + "legal_Id=" + legal_Id + ", name=" + name + ", phone=" + phone + ", email=" + email + '}';
    }
    
    
    
}
