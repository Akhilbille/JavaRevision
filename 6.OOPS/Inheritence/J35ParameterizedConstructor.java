class Rectangle {
    public int length;
    public int breadth;

    public Rectangle() {
        this.length = this.breadth = 1;
    }

    public Rectangle(int l, int b) {
        this.length = l;
        this.breadth = b;
    }

    public int volume() {
        return this.length * this.breadth;
    }

}

class Cuboid extends Rectangle{
    public int height;

    public Cuboid(){
        this.height = 1;
    }

    public Cuboid(int l,int b,int h){
        super(l,b);
        this.height = h;
    }

    public int volume(){
        
        return this.height* super.volume();
        }
}

public class J35ParameterizedConstructor {

    public static void main(String[] args){
        Cuboid obj = new Cuboid(1,3,3);
        int vol = obj.volume();
        System.out.println(vol);
    }

}
