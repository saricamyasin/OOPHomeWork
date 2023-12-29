package week3;

import java.util.Scanner;

public class Account {
    private double balance;
    private String ownerName;
    private int password;
    Account(double balance, String ownerName, int password){
        this.balance = balance;
        this.ownerName = ownerName;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Account a1 = new Account(300, "Ali Bey", 5555);
        System.out.println(a1.getOwnerName() + "  " + a1.getBalance());
        System.out.print("Eklemek istediğiniz Tutarı Giriniz : ");
        a1.Add(scan.nextDouble());
        System.out.println("Çekmek istediğiniz Tutarı Giriniz : ");
        a1.Withdraw(scan.nextDouble());

    }


    public void Add(double amount){
        this.balance += amount;
        System.out.println(this.ownerName + "  " + this.balance);

    }
    public void Withdraw(double amount){
        Scanner scan = new Scanner(System.in);
        int i;
        for(i = 2; i >= 0; i--){
            System.out.print("Lütfen Şifrenizi Giriniz : ");
            int password = scan.nextInt();
            if(this.password != password) {
                System.out.println("Şifrenizi yanlış girdiniz. Kalan Yanlış Girme Hakkınız : " + i);
            }
            else{
                this.balance -= amount;
                System.out.println(this.ownerName + "  " + this.balance);
                break;
            }
            if (i == 0)
                System.out.println("Şifrenizi 3 kere yanlış girdiğiniz için hesabınız bloke edildi");
        }


    }

    public double getBalance(){
        return this.balance;
    }
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    public String getOwnerName(){
        return this.ownerName;
    }

}
