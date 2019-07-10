package com.smbms.service.impl;

import com.smbms.pojo.Provider;
import com.smbms.service.ProviderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:spring.xml")
public class ProviderServiceImplTest {
    @Autowired
    private ProviderService providerService;

    @Test
    public void addProvider() {
        Provider provider = new Provider();
        provider.setId(20);
        int result = providerService.addProvider(provider);
        if (result>0){
            System.out.println("addProvider is succeed");
        }
    }
}