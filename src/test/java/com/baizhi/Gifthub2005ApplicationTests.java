package com.baizhi;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@SpringBootTest
class Gifthub2005ApplicationTests {

    @Test
    void contextLoads() {
        int a = 100;
        int b = 200;
        HashMap<Object, Object> map = new HashMap<>();
        Set<Map.Entry<Object, Object>> entries = map.entrySet();
        for (Map.Entry<Object, Object> entry : entries) {
            Object value = entry.getValue();
            Object key = entry.getKey();
        }
    }

}
