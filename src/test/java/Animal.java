/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 20:27
 */
public class Animal {
    private String desc;

    public Animal() {
        System.out.println("Animal()");
//        getDesc();
        this.desc=getDesc();
    }
    public String getDesc() {
        System.out.println("Animal.desc"+desc);
        return "Animal";
    }

    @Override
    public String toString() {
        return desc ;
    }
}
