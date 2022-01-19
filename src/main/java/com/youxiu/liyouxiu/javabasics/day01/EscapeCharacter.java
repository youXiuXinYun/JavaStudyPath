package com.youxiu.liyouxiu.javabasics.day01;

//转义字符
public class EscapeCharacter {
    public static void main(String[] args) {
        //1. \t : 一个制表位 (一个固定的宽度可以实现对齐)
        System.out.println("北京\t天津\t上海");
        System.out.println("----------------------");
        //2. \n : 换行符
        System.out.println("优秀\n李优秀\n幸运");

        //3. \\ : 一个\
        System.out.println("----------------------");
        System.out.println("\\");

        //4. \" : 一个 "
        System.out.println("----------------------");
        System.out.println("\"  {这是个双引号}");

        //5. \'  : 一个 '
        System.out.println("----------------------");
        System.out.println("\' {这是个单引号}");

        //6. \r : 一个回车键 System.out.println("李优秀\r优秀")
        System.out.println("----------------------");
        System.out.println("李优秀优秀\r优秀");

        System.out.println("----------------------");
        EscapeCharacter.show();
    }


    //输出格式
    public static void show() {
    //  书名  作者  价格  销量
    //  三国  优秀  120   1200
        System.out.println("书名\t作者\t价格\t销量\n三国\t优秀\t120\t\t1200");
    }
}
