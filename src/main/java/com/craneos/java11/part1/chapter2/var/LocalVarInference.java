package com.craneos.java11.part1.chapter2.var;

public class LocalVarInference {

    public static void main(String[] args) {
        var aClassWithAVeryLongName = new AClassWithAVeryLongName();
        aClassWithAVeryLongName.setName("aClassWithAVeryLongName");
        System.out.println(aClassWithAVeryLongName);

        var i = 1;
        var methodValue = aClassWithAVeryLongName.getName();

        // OK to assign a null object to LVTI variable but not literal null
        Object nullObject = null;
        var var = nullObject;

        // Invalid var declarations:

//        // cannot use var declaration in a compound statement
//        var j = 0, k = 0;
//
//        // again, cannot use var declaration in a compound statement
//        var m, n = 0;
//
//        // Cannot declare a var variable without also initializing it
//        var someObject;
//
//        // Cannot assign null to var variable, type cannot be inferred
//        var newvar = null;
//
//        // Cannot use array initializer in var declaration/initialization
//        var myArray = {"A", "B"};
//
//        // Cannot have an array of var
//        var[]newarray = new int[2];
    }
}

class AClassWithAVeryLongName {
    String name;

    public AClassWithAVeryLongName() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "AClassWithAVeryLongName{" +
                "name='" + name + '\'' +
                '}';
    }
}