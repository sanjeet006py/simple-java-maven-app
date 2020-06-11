package com.salesforce.hadoop.hbase;

public class Apps {
    private final String message = "Hello Universe!";

    public Apps() {}

    public static void Main(String[] args) {
        System.out.println(new Apps().getMessage());
    }

    private final String getMessage() {
        return message;
    }
}
