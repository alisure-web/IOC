package test.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * 把对象的创建，销毁以及初始化等一系列操作交给spring容器来处理.
 *
 * Created by ALISURE on 2017/3/18.
 */
public class TestIoCTest {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        TestIoC testIoC = (TestIoC)applicationContext.getBean("testIoC");
        testIoC.helloIoC();
        TestIoC testIoC2 = (TestIoC)applicationContext.getBean("testIoC");
        testIoC2.helloIoC();

        testIoC.setName("hello");
        testIoC.print();
        testIoC2.print();
        testIoC2.setName("nihao");
        testIoC.print();
        testIoC2.print();

        TestIoC testIoC3 = (TestIoC)applicationContext.getBean("testIoC2");
        testIoC3.setName("testIoC3");
        testIoC3.print();

        ClassPathXmlApplicationContext context = (ClassPathXmlApplicationContext)applicationContext;
        context.close();
    }

}
