package test.spring.dependentInjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by ALISURE on 2017/3/18.
 */
public class Teacher {
    private String name;
    private Student student;
    private List<String> list;
    private Set<Integer> set;
    private Map<Integer,String> map;

    public Teacher() {

    }

    public Teacher(String name, Student student) {
        this.name = name;
        this.student = student;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Set<Integer> getSet() {
        return set;
    }

    public void setSet(Set<Integer> set) {
        this.set = set;
    }

    public Map<Integer, String> getMap() {
        return map;
    }

    public void setMap(Map<Integer, String> map) {
        this.map = map;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
