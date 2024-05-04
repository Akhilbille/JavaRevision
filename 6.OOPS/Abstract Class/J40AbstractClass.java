abstract class UPI{
    public UPI(){
        System.out.println("UPI constructor");
    }

    public abstract void transaction();
    public abstract void rewards();

}

class PhonePay extends UPI{
    public void transaction(){
        System.out.println("Transaction throught Phonepay");
    }

    public void rewards(){
        System.out.println("Adding rewards 100points ");
    }
}

class Amazon extends UPI{
    public void transaction(){
        System.out.println("Transaction through Amazon");
    }

    public void rewards(){
        System.out.println("Rewards of 200points added");
    }
}

public  class J40AbstractClass{
    public static void main(String[] args){
        Amazon obj = new Amazon();
        obj.transaction();

    }

}