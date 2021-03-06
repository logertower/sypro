package liutf.serializeTest;

import java.io.Serializable;

/**
 * ${DESCRIPTION}
 *
 * @author ltf
 * @create 2017-05-17 下午 6:09
 **/
public class TestBean1 implements Serializable {

    private static final long serialVersionUID = -1L;

    private String name;
    private int age;
    private boolean sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}
