package test.spring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class TestAnnotation {

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        Teacher teacher = (Teacher) applicationContext.getBean("teacher-2");
        teacher.print();

        TeacherNoBean teacherNoBean = (TeacherNoBean)applicationContext.getBean("teacherNoBean");
        teacherNoBean.print();

        ((ClassPathXmlApplicationContext)applicationContext).close();
    }
}
