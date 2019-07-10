package com.smbms.service.impl;

import com.smbms.dao.ProviderDao;
import com.smbms.pojo.Provider;
import com.smbms.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProviderServiceImpl implements ProviderService {
    @Autowired
    private ProviderDao providerDao;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public int addProvider(Provider provider) {
        return providerDao.addProvider(provider);
    }
}
