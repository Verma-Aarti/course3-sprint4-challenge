package com.jap.course3;

import java.util.Random;


    abstract public class BankAccount {
        private long accountNumber;
        private String accountHolderName;
        private double accountBalance;
        private int noOfTransactions;
        public String status;
        public String accountType;
        private static double  minimum_balance;
        private static Random random;
        static {
            random=new Random();
            minimum_balance=5000;
        }
        BankAccount(){
            this("",0);
        }
        BankAccount(String name,double balance){
            accountNumber=Math.abs(random.nextLong()*101);
            accountHolderName=name;
            accountBalance=balance;
            noOfTransactions=0;
            status="inactive";
        }
        abstract public void setStatus();
        public void setaccnumber() {
            accountNumber=Math.abs(random.nextLong()*101);
        }
        public long getaccnumber() {
            return accountNumber;
        }
        public void setaccountHolderName(String name) {
            accountHolderName=name;
        }
        public void setAccountBalance(double balance) {
            accountBalance=balance;
        }
        public double getminimumbalance() {
            return minimum_balance;
        }
        public double getAccountBalance() {
            return accountBalance;
        }
        public String getaccountHolderName() {
            return accountHolderName;
        }
        abstract public void setAccountType();
        abstract public void debit(double amount);
        abstract public void credit(double amount);
        abstract public String toString();
        public String getAccountType() {
            return accountType;
        }
        public String getAccountStatus() {
            return status;
        }
        public int getcountOfTransactions() {
            return noOfTransactions;
        }
        public void setcountOfTransactions(int n) {
            noOfTransactions=n;
        }

    }



