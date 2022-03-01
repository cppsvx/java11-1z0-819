package com.craneos.java11.part1.chapter2.blocks;

public class CodeBlocks1 {

    private String name = "Test Value 1";

    {
        System.out.println("Instance Initializer. Demo Code Blocks static initializer="+name);
    }

    public CodeBlocks1(){
        this.name = "Test Value 2";
        System.out.println("Constructor. Demo Code Blocks static initializer="+name);
    }

    public static void main(String[] args) {
        CodeBlocks1 dcb = new CodeBlocks1();
        System.out.println("Demo Code Blocks main");
        System.out.println(dcb.name);
    }

}
