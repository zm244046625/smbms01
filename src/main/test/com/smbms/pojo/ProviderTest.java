package com.smbms.pojo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class ProviderTest {
    @Autowired
    private Provider provider;

    @Autowired
    private Provider provider2;

    @Before
    public void before(){
        System.out.println("in front of executing test");
    }

    @Test
    public void test(){
        System.out.println("bean1-hashCode:"+provider.hashCode());
        System.out.println("bean2-hashCode:"+provider2.hashCode());
    }

    @After
    public void after(){
        System.out.println("behind executing test");
    }
}