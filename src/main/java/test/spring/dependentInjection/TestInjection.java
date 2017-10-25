package test.spring.dependentInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 依赖注入，说的通俗一点，就是对属性赋值，
 * 也就是说我们利用spring来为我们的类中包含的属性来进行赋值.
 *
 * Created by ALISURE on 2017/3/18.
 */
public class TestInjection {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Teacher teacher = (Teacher)applicationContext.getBean("teacher");
        Student student = teacher.getStudent();

        System.out.println(teacher.getName());
        System.out.println(student.getName()+":"+student.getAge());

        List<String> list = teacher.getList();
        for (String str: list ) {
            System.out.println(str);
        }

        Map<Integer,String> map = teacher.getMap();
        for (Map.Entry<Integer,String> entry:map.entrySet() ) {
            System.out.println(entry.getKey() +":" + map.get(entry.getKey()));
        }

        Set<Integer> set = teacher.getSet();
        for (Integer num: set){
            System.out.println(num);
        }
    }
}
