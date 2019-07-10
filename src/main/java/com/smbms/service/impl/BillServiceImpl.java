package com.smbms.service.impl;

import com.smbms.dao.BillDao;
import com.smbms.pojo.Bill;
import com.smbms.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BillServiceImpl implements BillService {
    @Autowired
    private BillDao billDao;
    @Override
    public List<Bill> findBillByName(String proName, Integer id) {
        return billDao.findBillByName(proName,id);
    }
}
