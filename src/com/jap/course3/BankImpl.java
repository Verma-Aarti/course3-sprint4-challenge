package com.jap.course3;

public class BankImpl {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SavingAccount s=new SavingAccount("Aarti",20345.56,23,10);
        s.setAccountType();
        s.debit(2000);
        s.credit(200);
        System.out.println(s.toString());
        System.out.println("******************************************************");
        CurrentAccount c=new CurrentAccount("vivek",30000,23);
        c.setAccountType();
        c.debit(5000);
        c.credit(4000);
        System.out.println(c.toString());
    }
}
