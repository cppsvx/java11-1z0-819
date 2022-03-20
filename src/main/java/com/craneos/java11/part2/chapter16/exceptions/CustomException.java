package com.craneos.java11.part2.chapter16.exceptions;

class CannotSwimException extends Exception {}
class DangerInTheWater extends RuntimeException {}
class SharkInTheWaterException extends DangerInTheWater {}

public class CustomException {

    public void swim() throws CannotSwimException {
    }

}
