package uni_system;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */

public class subject {
    
    int credit;
    double fees;
    String name,code;

    public subject() {
    }

    public subject(int credit, double fees, String name, String code ) {
        this.credit = credit;
        this.fees = fees;
        this.name = name;
        this.code = code;
       
    }

   
    
    

    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public double getFees() {
        return fees;
    }

    public void setFees(double fees) {
        this.fees = fees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}

  

