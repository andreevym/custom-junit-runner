package ru.android_studio;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObjectTest {

    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void test() {
        System.out.println("test");
        Assert.assertEquals(1, System.getProperties().entrySet().stream()
                .peek(System.out::println)
                .filter(objectObjectEntry ->
                        objectObjectEntry.getKey().equals("testType") &&
                                objectObjectEntry.getValue().equals("Assertions")).count());
    }

    @After
    public void after() {
        System.out.println("After");
    }
}
