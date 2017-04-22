import javax.xml.stream.XMLOutputFactory;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 20:29
 */
public class Wolf  extends Animal {
    String name;
    double weight;
    public Wolf(String name ,double weight) {
        System.out.println("super.getDesc():"+super.getDesc());
        System.out.println("Wolf");
//        getDesc();
        this.name=name;
        this.weight=weight;
    }

    @Override
    public String getDesc() {
        System.out.println("Wolf.getDesc() ");
        System.out.println("name:"+name+"weight:"+weight);
        return "===={"+name+weight+"}";
    }

    public static void main(String[] args) {
        System.out.println(new Wolf("zhoouhaiming",3.221));
    }
}
