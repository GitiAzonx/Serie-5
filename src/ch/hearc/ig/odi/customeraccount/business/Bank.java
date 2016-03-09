/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julien Schneider <julien.schneider@he-arc.ch>
 */
public class Bank {
    
    private int number;
    private String name;
    private List<Customer> customers;
    private List<Account> accounts;

    public Bank(int number, String name) {
        this.number = number;
        this.name = name;
        this.customers = new ArrayList();
        this.accounts = new ArrayList();
    }
    
    public Account getAccountByNumber(String number){
        for (Account a : accounts){
            if (a.getNumber().equals(number)){
                return a;
            }else
                return null;
        }
        return null;
    }
    
    public Customer getCustomerByNumber(int number){
        for (Customer c:customers){
            if (c.getNumber() == number){
                return c;
            }else{
                return null;
            }   
        }
        return null;
    }
    
    public void addCustomer(int number, String fn, String ln){
        Customer c = new Customer(number,fn,ln);
        customers.add(c);
    }
    
    public void addAccount(String number, String name, double rate, Customer customer){
        Account a = new Account(number, name, rate, customer);
        customer.addAccount(a);
        accounts.add(a);
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }
    
    
    
    
}
