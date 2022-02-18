/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicesumar.contabancaria;

import java.util.Calendar;

/**
 *
 * @author marcosdanielr
 */
public class SavingsAccount extends Account {
    private int savingsDay;

    public int getSavingsDay() {
        return savingsDay;
    }

    public void setSavingsDay(int savingsDay) {
        this.savingsDay = savingsDay;
    }

    @Override
    public String toString() {
        String s = "Conta Poupança[";
        s += "Rendimento do dia: " + savingsDay;
        
        s += "]";
        return s;        
   
    }
    
    public boolean newBalance(double savingsRate) {
        Calendar today = Calendar.getInstance();
        
        if (savingsDay == today.get(Calendar.DAY_OF_MONTH)) {
            //balance += balance * savingsRate;
            this.setBalance(this.getBalance() + (this.getBalance() * savingsRate));
            return true;            
        }
        return false;
    }    
}
