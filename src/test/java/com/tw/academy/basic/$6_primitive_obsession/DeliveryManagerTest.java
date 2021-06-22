package com.tw.academy.basic.$6_primitive_obsession;
import com.tw.academy.basic.$6_primitive_obsession.practiceOne.Address;
import com.tw.academy.basic.$6_primitive_obsession.practiceOne.DeliverCenter;
import com.tw.academy.basic.$6_primitive_obsession.practiceOne.DeliveryManager;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DeliveryManagerTest {
    @Test
    public void should_allocate_to_local_when_target_address_same_with_mailing_address() {
        String mailingAddress = "hubei province wuhan city jianghan area jiefang street No1277";
        String targetAddress = "hubei province wuhan city qiaokou area jiefang street No1095";
        DeliveryManager deliveryManager = new DeliveryManager(new Address(mailingAddress), new Address(targetAddress));

        DeliverCenter actual = deliveryManager.allocate();

        assertEquals(DeliverCenter.LOCAL, actual);
    }

    @Test
    public void should_allocate_to_province_when_target_address_and_mailing_address_in_same_province() {
        String mailingAddress = "hubei province wuhan city jianghan area jiefang street No1277";
        String targetAddress = "hubei province danjiangkou city yongle street No13";
        DeliveryManager deliveryManager = new DeliveryManager(new Address(mailingAddress), new Address(targetAddress));

        DeliverCenter actual = deliveryManager.allocate();

        assertEquals(DeliverCenter.PROVINCE, actual);
    }

    @Test
    public void should_allocate_to_foreign_when_target_address_and_mailing_address_in_different_province() {
        String mailingAddress = "sichuan province chengdu city wuhou area guoxue street No37";
        String targetAddress = "hubei province wuhan city jianghan area jiefang street No1277";
        DeliveryManager deliveryManager = new DeliveryManager(new Address(mailingAddress), new Address(targetAddress));

        DeliverCenter actual = deliveryManager.allocate();

        assertEquals(DeliverCenter.FOREIGN, actual);
    }
}
