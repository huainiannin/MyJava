package com.inspur.qujt.stringtest;

/**
 * @author qujt
 * @date 2019-04-06 11:16
 * @Description
 * @email qujt@inspur.com
 */
public class MyString {
    public static void main(String args[]){
        String name = "Java";
        System.out.println(String.format("%s，你好",name));
        System.out.println("string builder string + string format性能比较");

        long start = System.currentTimeMillis();
        for(int i=0;i<=10000;i++){
            new StringBuilder(name).append("，你好");
        }
        System.out.println("string builder耗时"+(System.currentTimeMillis()-start)+"ms");
        start = System.currentTimeMillis();
        for(int i=0;i<=10000;i++){
            String str = name + "，你好";
        }

        System.out.println("string +"+(System.currentTimeMillis()-start)+"ms");
        start = System.currentTimeMillis();
        for(int i=0;i<=10000;i++){
            String.format("%s，你好",name);
        }
        System.out.println("string format耗时"+(System.currentTimeMillis()-start)+"ms");
    }
}
