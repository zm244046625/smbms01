package com.smbms.dao;

import com.smbms.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface ProviderDao {

    int updateProvider(Provider provider);

    List<Provider> findProviderByArray(Integer[] array);

    List<Provider> findProviderByChoose(@Param("proCode") String proCode,
                                        @Param("proName") String proName,
                                        @Param("proContact") String proContact,
                                        @Param("creationDate") Date creationDate);

    int addProvider(Provider provider);
}
