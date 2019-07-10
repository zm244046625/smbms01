package com.smbms.service;

import com.smbms.pojo.Bill;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface BillService {
    List<Bill> findBillByName(@Param("proName")String proName,
                              @Param("providerid")Integer id);
}
