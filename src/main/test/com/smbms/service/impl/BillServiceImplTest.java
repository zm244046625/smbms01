package com.smbms.service.impl;

import com.smbms.pojo.Bill;
import com.smbms.service.BillService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class BillServiceImplTest {
    @Autowired
    private BillService billService;

    @Test
    public void findBillByName() {
        List<Bill> b = billService.findBillByName("海", 1);
        System.out.println(b);
    }
}