// Run time polymorphism will happen with Method Over riding.
class NoteFive{
     public void clickPhoto(){
         System.out.println("Clicked photo with 20MP Camera");
     }
}

class NoteFivePro extends NoteFive{
    public void clickPhoto(){
        System.out.println("Clicked Photo with 50MP Camera");
    }
}

public class J39RunTimePolymorphism {
    public static void main(String[] args){
        NoteFivePro obj = new NoteFivePro();
        obj.clickPhoto();

    }
}
