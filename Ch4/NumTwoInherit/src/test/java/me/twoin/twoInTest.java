package me.twoin;

import me.two.twoInherit;
import org.junit.Test;

import static org.junit.Assert.*;

public class twoInTest {
    private long id=216009529;
    private String name="used_for_dependence";
    @Test
    public void twoIntTesting() {
        twoInherit twoInherit1=new twoInherit();
        assertEquals(twoInherit1.getId(),216009529);
        assertEquals(twoInherit1.getName(),"used_for_dependence");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
//System.out.println(twoInherit1.twoInherit(1234567890,"using_dependency"));

}