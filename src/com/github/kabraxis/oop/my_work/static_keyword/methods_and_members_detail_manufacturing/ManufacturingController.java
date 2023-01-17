package com.github.kabraxis.oop.my_work.static_keyword.methods_and_members_detail_manufacturing;

public class ManufacturingController {
    static int totalRequestedProducts = 0;

    public static String requestProduct(String product) {
        totalRequestedProducts++;

        return getNumberOfProducts() + ". Requested " + product;
    }

    public static int getNumberOfProducts() {
        return totalRequestedProducts;
    }
}
