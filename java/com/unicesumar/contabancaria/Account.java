/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicesumar.contabancaria;

/**
 *
 * @author marcosdanielr
 */
public class Account {
  
    private String clientName;
    private String accountNumber;
    private double balance;     
    private double limit; 

    /**
     * @return the clientName
     */
    public String getClientName() {
        return clientName;
    }

    /**
     * @param clientName the clientName to set
     */
    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
        /**
     * @return the limit
     */
    public double getLimit() {
        return limit;
    }

    /**
     * @param limit the limit to set
     */
    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public String toString() {
        String s = "Conta Corrente[";
        s += "Nome do cliente: " + clientName;
        s += "; Número da Conta: " + accountNumber;
        s += "; Saldo: " + balance;
        s += "; Limite: " + limit;
        s += "]";

        return s;        

        
    }
    
    public void deposit(double value) {
        balance += value;        
    }
    
    public void limit(double value) {
        limit += value;
    }
    
    public boolean withdrawn (double value) {
        if((balance-value) >=0) {
           balance-=value;    
        return true;                       
        }
        
        /*if((balance) <=value) {
           limit-=value;    
        return true;
        
        }*/
        
      //  if((value) >=limit) {
          
        return false;
            
            
        }


    }
    
    
}
