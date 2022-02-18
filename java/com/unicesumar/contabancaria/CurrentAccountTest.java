/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.unicesumar.contabancaria;

/**
 *
 * @author marcosdanielr
 */
public class CurrentAccountTest {
    public static void main(String[] args) {
        
        System.out.println("*** Teste Conta Corrente ***");
        
        Account accountTest = new Account();
        accountTest.setClientName("marcosdanielr");
        accountTest.setAccountNumber("11111");
        
        accountTest.limit(500); 
          
        accountTest.deposit(5000);        
        doWithdrawn(accountTest, 4000);
        
     
                 
        System.out.println(accountTest);
    }
    
    private static void doWithdrawn(Account account, double value) {
        if (account.withdrawn(value)) {
            System.out.println("Saque efetuado com sucesso! Seu novo saldo é: " + account.getBalance());
            System.out.println("Seu limite é:" + account.getLimit());
        } else {
            System.out.println("Saldo insuficiente. ");
        }
        
    }
}
   
    
