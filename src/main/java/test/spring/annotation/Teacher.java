package test.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.annotation.Resource;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class Teacher {
    private String name;

    //@Resource
    //private ClassInfo classInfo;

    @Resource(name = "test")
    private ClassInfo classInfo2;

    @Autowired
    private ClassInfo classInfo;

    @Autowired
    @Qualifier("test")
    private ClassInfo classInfo3;

    public void print(){
        classInfo.print();
        classInfo2.print();
        classInfo3.print();
    }
}
