package test.spring.annotation;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class ClassInfo {

    public void print(){
        System.out.println("this is classInfo...");
    }

    @PostConstruct
    public void init(){
        System.out.println("classInfo init...");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("classInfo destory...");
    }
}
