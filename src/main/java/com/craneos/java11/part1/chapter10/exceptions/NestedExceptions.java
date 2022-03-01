package com.craneos.java11.part1.chapter10.exceptions;

class AnimalsOutForAWalk extends RuntimeException { }
class ExhibitClosed extends RuntimeException { }
class ExhibitClosedForLunch extends ExhibitClosed { }

public class NestedExceptions {

    public void main(String... unused) {
        try {
            seeAnimal();
        //} catch (Exception e){  // DOES NOT COMPILE
        //} catch (RuntimeException e) { // DOES NOT COMPILE
        } catch (AnimalsOutForAWalk e) { // first catch block
            System.out.print("try back later");
        } catch (ExhibitClosedForLunch|NumberFormatException e) {
            System.out.print("not today");
        } catch (ExhibitClosed e) {
            System.out.print("not today");
        } catch (Exception e){
            System.out.print("Exception");
        }
        /*try {
            throw new IOException();
        } catch (FileNotFoundException | IOException p) {} // DOES NOT COMPILE
         */
    }

    private void seeAnimal() throws AnimalsOutForAWalk, ExhibitClosed{
        System.out.println("see animal");
    }
}
