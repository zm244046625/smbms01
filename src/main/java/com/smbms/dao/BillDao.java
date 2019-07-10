package com.smbms.dao;

import com.smbms.pojo.Bill;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BillDao {

    List<Bill> findAllBills(Bill bill);

    int addBills(Bill bill);

    int updateBills(Bill bill);

    int deleteBills(@Param("id") int id);

    List<Bill> findBillByName(@Param("proName")String proName,
                              @Param("providerid")Integer id);
}
