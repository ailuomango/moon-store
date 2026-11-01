package com.ailuomango.moonstore.product;

import com.ailuomango.moonstore.product.entity.BrandEntity;
import com.ailuomango.moonstore.product.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;
import org.junit.jupiter.api.Test;


@SpringBootTest
@Transactional
public class MoonStoreProductApplicationTest {
    @Autowired
    private BrandService brandService;

    @Test
    public void test1() {
        BrandEntity b1 = new BrandEntity();
        b1.setName("HUAWEI");
        brandService.save(b1);
    }
}
