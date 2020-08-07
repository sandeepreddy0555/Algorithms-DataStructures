package Designpatterns.FlyweightPattern;


//structural pattern
// Helps in reduction of memory consumption in creating repeated heavy objects. Eases the design on realtionship between entities
// For example, ballpoint, gel, marker, and stylus are types of pens. These pens share everything except for the type and ink color.
// If you were creating pen objects, you could use the same object if the type and color were the same.
// Otherwise, you would end up with way too many pens and your objects would consume too much memory and might even crash your application depending
// on how much traffic it gets.
//helps during creation of expensive objects, if obejcts differen on just few properties then maintain them in map to retrieve later instead of creating new one
public class Flyweight {



public static void main(String args[]){


  PenFactory penFactory = new PenFactory();

  Pen pen1 = penFactory.getPen(PenType.BALLPOINT, PenColor.BLACK);
  Pen pen2 = penFactory.getPen(PenType.BALLPOINT, PenColor.BLACK);
  System.out.println(pen1.hashCode());
  System.out.println(pen2.hashCode());







}

}
