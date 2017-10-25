package test.spring.ioc;

/**
 *  IoC控制反转
 *  ioc又名控制反转，说白了就是把对象的创建，销毁以及初始化等一系列操作
 *  交给spring容器来处理，由spring来控制对象的声明周期。
 *
 * Created by ALISURE on 2017/3/18.
 */
public class TestIoC {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TestIoC() {
        System.out.println("构造函数：hello ioc TestIoC");
    }

    public void helloIoC() {
        System.out.println("helloIoC函数：hello ioc helloIoC");
    }

    public void print(){
        System.out.println(getName());
    }

    public void init(){
        setName("init name");
        System.out.println("init函数：hello ioc init");
    }

    public void destroy(){
        setName(null);
        System.out.println("destroy函数：hello ioc destroy");
    }
}
