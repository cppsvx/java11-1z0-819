package com.craneos.java11.part1.chapter2.blocks;

public class CodeBlocks2 {

    public CodeBlocks2(){
        this.name = "Test Value 2";
        System.out.println("Constructor. Demo Code Blocks static initializer="+name);
    }

    public static void main(String[] args) {
        CodeBlocks2 dcb = new CodeBlocks2();
        System.out.println("Demo Code Blocks main");
        System.out.println(dcb.name);
    }

    private String name = "Test Value 1";
    {
        System.out.println("Instance Initializer. Demo Code Blocks static initializer="+name);
    }
}
