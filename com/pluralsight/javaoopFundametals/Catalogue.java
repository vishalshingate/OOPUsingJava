package com.pluralsight.javaoopFundametals;

import java.util.HashMap;
import java.util.Map;

public class Catalogue {
    private  static Map<String, Product> productMap = Map.of(
            "Electric ToothBrush", new Product("ElectricBrush",500),
            "Baby Alarm", new Product("BabyAlarm", 600)
    );

    //You can use static instializer block too
    /*private  static Map<String, Product> productMap1 = new HashMap<>();

    static {
        productMap1.put("Electric ToothBrush", new Product("ElectricBrush",500));
        productMap1.put("Baby Alarm", new Product("BabyAlarm", 600));
    }*/

    public static Product getProduct(String productName) {
        return productMap.get(productName);
    }
}
