package test.spring.annotation;

import org.springframework.stereotype.Component;

/**
 *
 * 在applicationContext.xml中,不用对bean进行声明
 *
 * 如果Teacher类上写了这样一个@Component("teacherId"),那么此时就需要通过
 * Teacher teacher =  (Teacher) applicationContext.getBean("teacherId");
 * 才可以得到Teacher对象。这里的@Component是一个比较宽泛的泛型，spring为我们提供了更详细的注解配置：
 * @Controller   配置控制器的，控制视图的跳转
 * @Service      配置service的，不是Android中的service
 * @Repository   配置dao的，控制操作数据库的
 *
 * Created by ALISURE on 2017/3/18.
 */
@Component
public class TeacherNoBean {

    public void print(){
        System.out.println("teacher no bean");
    }
}
