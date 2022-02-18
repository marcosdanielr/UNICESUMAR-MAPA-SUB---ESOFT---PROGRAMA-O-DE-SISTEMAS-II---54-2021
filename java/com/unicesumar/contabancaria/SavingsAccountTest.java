/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicesumar.contabancaria;

/**
 *
 * @author marcosdanielr
 */
public class SavingsAccountTest {
    public static void main(String[] args) {
        
        System.out.println("*** Teste Conta Corrente ***");
        
        SavingsAccount savingsAccountTest = new SavingsAccount();
        savingsAccountTest.setClientName("marcosdanielr");
        savingsAccountTest.setAccountNumber("51111");  
        savingsAccountTest.setSavingsDay(17);
          
        savingsAccountTest.deposit(100);        
        doWithdrawn(savingsAccountTest, 50);
        
        if (savingsAccountTest.newBalance(0.02)) {
            System.out.println("Seu saldo com rendimento é: " + savingsAccountTest.getBalance());
        } else {
            System.out.println("Sem rendimentos");
        }
        
     
                 
        System.out.println(savingsAccountTest );
    }
    
    private static void doWithdrawn(Account account, double value) {
        if (account.withdrawn(value)) {
            System.out.println("Saque efetuado com sucesso! Seu  saldo é: " + account.getBalance());
        } else {
            System.out.println("Saldo insuficiente. ");
        }
        
    }
}
   
    
