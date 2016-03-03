// Silvio Gutierez version 1.0

package ch.hearc.ig.odi.customeraccount.business;

import java.util.ArrayList;
import java.util.List;


public class Customer {

	private int number;
	private String firstName;
	private String lastName;
        private List<Account> accounts;
	/**
	 * 
	 * @param number
	 * @param firstName
	 * @param lastName
	 */
	public Customer(int number, String firstName, String lastName) {
            this.number = number;
            this.firstName = firstName;
            this.lastName = lastName;
            accounts = new ArrayList();
	}

	public int getNumber() {
		return this.number;
	}

	/**
	 * 
	 * @param number
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @param firstName
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @param lastName
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * 
	 * @param number
	 */
	public Account getAccountByNumber(String number) {
            Account r_account = null;
            boolean found = false;
            int i = 0;
            while(i<accounts.size() && !found){
                if(accounts.get(i).getNumber().equals(number)){
                    r_account = accounts.get(i);
                    found = true;
                }
                i++;
            }
            
            return r_account;
            
	}

	/**
	 * 
	 * @param number
	 * @param name
	 * @param rate
	 */
	public void addAccount(String number, String name, double rate) {
            accounts.add(new Account(number,name,rate,this));
	}

}