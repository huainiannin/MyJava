package com.inspur.qujt.enumtest;

/**
 * @author qujt
 * @date 2019-04-06 11:13
 * @Description
 * @email qujt@inspur.com
 */
public class MyEnum {
    public static void main(String args[])
    {
        System.out.println("hello world");
        System.out.println(Color.RED instanceof Enum);
    }
}

enum Color {
    RED("RED");
    private String color;
    private Color(String color){
        this.color = color;
    }
}
