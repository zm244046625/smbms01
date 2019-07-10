package com.smbms.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring-ex.xml")
public class BillTest {
    @Autowired
    private Bill bill;

    @Autowired
    private Bill bill2;
    @Test
    public void test(){
        System.out.println("bean1-hashCode:"+bill.hashCode());
        System.out.println("bean2-hashCode:"+bill2.hashCode());
    }


}