/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 20:07
 */
public class Derived extends Base {
    private int i = 22;

    public Derived() {
        System.out.println("Derived()");
        i = 222;
    }

    @Override
    public void display() {
        System.out.println("Derived.display（）");
        System.out.println(i);
    }

}
