package com.jap.course3;

public class CurrentAccount extends BankAccount {
    private int age;
    private static double interest_rate;
    static {
        interest_rate=5.34;
    }

    CurrentAccount(){
        this("",0.0,0);
    }
    CurrentAccount(String name,double balance,int a){
        super(name,balance);
        age=a;
    }
    public void setAge(int a) {
        age=a;
    }
    public int getAge() {
        return age;
    }
    public void setStatus() {
        if(super.getcountOfTransactions()>=5) {
            super.status="active";
        }
        else {
            super.status="inactive";
        }
    }
    public void debit(double amount) {
        if(super.getAccountBalance()-amount<super.getminimumbalance()) {
            System.out.println("Debit Not Posiible as it is conflicting with your minimum balance ");
        }
        else if(amount>super.getAccountBalance()) {
            System.out.println("Enter proper amount");
        }
        else {
            super.setAccountBalance(super.getAccountBalance()-amount);
            setStatus();
            System.out.println("Debitted successfully!");
        }
    }
    public void credit(double amount) {
        if(amount>40000) {
            System.out.println("Amount is too high to credit.It's exceeding credit limit");
        }
        else {
            super.setAccountBalance(super.getAccountBalance()+amount);
            setStatus();
            System.out.println("Creditted successfully!");
        }
    }
    public void setAccountType() {
        System.out.println("Welcome to current account");
        super.accountType="current";
    }
    public String toString() {
        return "Account number : "+super.getaccnumber()+"\n"+"Account Holder Name : "+super.getaccountHolderName()+
                "\n"+"Account Type : "+super.getAccountType()+"\n"+"Account Balance : "+super.getAccountBalance()+
                "\n"+"Account Status : "+super.getAccountStatus()+"\n Interest Rate : "+interest_rate;
    }
}




