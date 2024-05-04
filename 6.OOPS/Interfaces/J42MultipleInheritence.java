class Phone{
    public void call(){
        System.out.println("WE can call");
    }
    public void sms(){
        System.out.println("We can send SMS");
    }
}

interface Camera{
    void clickPhoto();
}

interface Browse{
    void browsing();
}

class SmartPhone extends Phone implements Camera,Browse{
    public void clickPhoto(){
        System.out.println("Click... Click.. Photo Ready");
    }

    public void browsing(){
        System.out.println("I can browse any thing...");
    }
}
public class J42MultipleInheritence {
        public static void main(String[] args){
            SmartPhone iphone = new SmartPhone();
            iphone.browsing();
            iphone.clickPhoto();
        }
}
