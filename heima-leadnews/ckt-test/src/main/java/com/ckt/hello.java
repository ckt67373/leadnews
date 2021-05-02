package com.ckt;

/**
 * @author:ckt
 * @date:2021-04-30
 * @time:11:05
 */
public class hello {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}
class Annoyance extends Exception {
}

class Sneeze extends Annoyance {
}

class Human {
    public static void main(String[] args)
            throws Exception {
        try {
            try {
                throw new Sneeze();
            } catch (Annoyance a) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        } catch (Sneeze s) {
            System.out.println("Caught Sneeze");
            return;
        } finally {
            System.out.println("Hello World!");
        }
    }
}