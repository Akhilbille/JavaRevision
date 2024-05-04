class MinBalanceException extends Exception{
    public String toString(){
        return("Min balance required it must be > 500");
    }
}

class Bank{
    private int balance;
    public Bank(int balance){
        this.balance = balance;
    }

    public void balanceCheck() throws MinBalanceException{
         if(this.balance < 500)
            throw new MinBalanceException();        
    }
}


public class J46UserDefinedException {
public static void main(String[] args) {
    try{
    Bank account = new Bank(400);
    account.balanceCheck();
    }
    catch (MinBalanceException ex) {
        System.out.println(ex);
    }

}
    
}
