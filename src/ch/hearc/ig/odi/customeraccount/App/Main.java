// Silvio Gutierez version 1.0

package ch.hearc.ig.odi.customeraccount.App;

import ch.hearc.ig.odi.customeraccount.business.Account;
import ch.hearc.ig.odi.customeraccount.business.Bank;
import ch.hearc.ig.odi.customeraccount.business.Customer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author silvio.gutierre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b1 = new Bank(1, "Banque Cantonale du Jura");
        
        b1.addCustomer(0,"Silvio","Gutierrez");
        b1.addCustomer(1,"Julien","Schneider");
        
        b1.addAccount("0","Compte Epargne",0.21,b1.getCustomerByNumber(0));
        b1.addAccount("1","Compte Courant",0.4,b1.getCustomerByNumber(0));
        //b1.addAccount("2","Compte Epargne",0.1,b1.getCustomerByNumber(1));
        
        b1.getAccountByNumber("0").credit(500);
        System.out.println("Compte : " + b1.getAccountByNumber("0").getNumber() + " - Solde: " + b1.getAccountByNumber("0").getBalance());
        b1.getAccountByNumber("0").debit(54.55);
        System.out.println("Compte : " + b1.getAccountByNumber("0").getNumber() + " - Solde: " + b1.getAccountByNumber("0").getBalance());
 
        //b1.getAccountByNumber("2").credit(1500);
        //System.out.println("Compte : " + b1.getAccountByNumber("2").getNumber() + " - Solde: " + b1.getAccountByNumber("2").getBalance());

        
        /*
        Customer c1 = new Customer(0,"Silvio","Gutierrez");
        Customer c2 = new Customer(1,"Ajtene","Kurtaliqi");
        
        Account a1 = new Account("0","Compte Epargne",0.21,c1);
        Account a2 = new Account("1","Compte Courant",0.4,c1);
        Account a3 = new Account("2","Compte Epargne",0.05,c2);
        
        a1.debit(1000);
        System.out.println("a1 solde:"+a1.getBalance());
        a2.debit(1495);
        System.out.println("a2 solde:"+a2.getBalance());
        a3.debit(3400);
        System.out.println("a3 solde:"+a3.getBalance());
        a3.credit(3600);
        System.out.println("a3 solde:"+a3.getBalance());
        
        Account.transfer(300, a2, a1);
        
        System.out.println("a1 solde:"+a1.getBalance());
        System.out.println("a2 solde:"+a2.getBalance());
        */
    }
    
}
