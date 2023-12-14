package com.tsypk.coresupplier

import com.tsypk.coresupplier.services.SupplierStaffService
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class CoreSupplierApplicationTests {

    @Autowired
    lateinit var supplierStaffService: SupplierStaffService

    @Test
    fun contextLoads() {
        supplierStaffService.getStaffInfo().forEach {
            println(it)
            println()
            println()
        }
    }
}
