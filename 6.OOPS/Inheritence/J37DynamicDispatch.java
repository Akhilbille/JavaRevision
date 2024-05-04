class TV{
    public void start(){
        System.out.println("TV Start");
    }

    public void changeChannel(){
        System.out.println("Channel Changed in TV");
    }
}

class SmartTV extends TV{
    public void start(){
        System.out.println("Smart TV start");
    }

    public void changeChannel(){
        System.out.println("Channel Changed in Smart TV");
    }

    public void browse(){
        System.out.println("Browsing Smart TV");
    }
}

public class J37DynamicDispatch {
    public static void main(String[] args){
        TV tv = new SmartTV();
        tv.changeChannel();
        tv.start();

    }
}
