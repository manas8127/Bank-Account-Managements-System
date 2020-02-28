import java.util.*;
public class BAMS {
    
   public static int balance=0;
    
    private void OpenAccount(String name)
    {
      Scanner sc1=new Scanner(System.in);
      System.out.println("starting balance");
      balance=sc1.nextInt();
      System.out.println("Name is "+name);
      System.out.println("Balance is "+balance);
    }
    
    private void Withdraw(String name)
    {
      Scanner sc2=new Scanner(System.in);
      System.out.println("Withdrawl amount");
      int withdraw=sc2.nextInt();
      System.out.println("Initial Balance");
      int b=sc2.nextInt();
      balance=b-withdraw;
      System.out.println("Name is "+name);
      System.out.println("Withdraw is "+withdraw);
      System.out.println("Balance is "+balance);
    }
    
    private void Deposit(String name)
    {
      Scanner sc3=new Scanner(System.in);
      System.out.println("Deposit amount");
      int deposit=sc3.nextInt();
      System.out.println("initial balance");
      int b=sc3.nextInt();
      balance=b+deposit;
      System.out.println("Name is "+name);
      System.out.println("Withdraw is "+deposit);
      System.out.println("Balance is "+balance);
    }
    
    private void CloseAccount(String name)
    {
      balance=0;
      System.out.println("Name is "+name);
      System.out.println("Balance is "+balance);
    }
    
    public static void main(String sd[])
    {
        Scanner sc=new Scanner(System.in);
        BAMS ob=new BAMS();
        char c='Y',c1='Y';
        do{
        do{
        System.out.println("Enter name and Press 1 for account openeing 2 for deposit 3 for withdrawl and 4 for account closing");
        String name=sc.nextLine();
        int k=sc.nextInt();
        switch(k)
        {
            case 1: ob.OpenAccount(name);
                    break;
            case 2: ob.Deposit(name);
                    break;
            case 3: ob.Withdraw(name);
                    break;
            case 4: ob.CloseAccount(name);
                    break;
        }
        System.out.println("Do you wish to continue Y/N");
        c=sc.next().charAt(0);
        if(c!='Y')
        c='N';
        }while(c=='Y');
        System.out.println("Are you a new user Y/N");
        c1=sc.next().charAt(0);
        if(c1!='Y'){
        c1='N';
        balance=0;}
     }while(c1=='Y');
    }
    
}
