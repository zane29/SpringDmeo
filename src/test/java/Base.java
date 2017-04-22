/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 20:04
 */
public class Base {
    private int i =2;
    public Base() {
        System.out.println("Base:"+this.i);
        this.display();
        System.out.println("hhhh");
    }
    public void display(){
        System.out.println("Base.display");
        System.out.println(i);
    }
}
