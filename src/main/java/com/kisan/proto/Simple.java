package com.kisan.proto;



public class Simple {
    //StockOuterClass.Stock.newBuilder();
    public static void main(String str[]) {
        Stock.StockMessage.Builder stockMessage = Stock.StockMessage.newBuilder();
        stockMessage.setAvgPrice(123).setQuantity(3).setSectorName("IT").build();
        System.out.println(stockMessage.toString());
    }

}
