package me.two;

import org.junit.Test;

import static org.junit.Assert.*;

public class twoInheritTest {
    //Output test
    private long id=216009529;
    private String name="used_for_dependence";
    @Test
    public void twoInherit() {
        assertEquals(getId(),216009529);
        assertEquals(getName(),"used_for_dependence");
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

    //test needs end
    }
