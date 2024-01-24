package cz.czechitas.java.ukol01;

import cz.czechitas.java.ukol01.engine.Turtle;

public class HlavniProgram {
  private Turtle zofka;

  public static void main(String[] args) {
    new HlavniProgram().start();
  }

  public void start() {
    zofka = new Turtle();

    //TODO implementace domácího úkolu
    zofka.turnRight(90);
    for (int i = 0; i < 2; i++) {
      zofka.penDown();
      zofka.move(150);
zofka.turnRight(90);
zofka.move(100);
zofka.turnRight(90);
    }
  zofka.turnRight(180);
    zofka.turnLeft(30);
    zofka.move(100);
    zofka.turnLeft(120);
    zofka.move(100);
zofka.turnRight(30);
zofka.move(50);
zofka.turnRight(180);
zofka.move(50);
zofka.turnLeft(110);
zofka.move(50);
zofka.penUp();
zofka.turnLeft(180);
zofka.move(50);
zofka.turnRight(50);
zofka.move(150);
zofka.penDown();
zofka.turnRight(50);
zofka.move(50);
zofka.turnRight(180);
zofka.move(50);
    zofka.turnLeft(110);
    zofka.move(50);
    zofka.penUp();
    zofka.turnLeft(180);
    zofka.move(50);
    zofka.turnLeft(30);
    zofka.move(100);
    zofka.turnRight(100);
    zofka.penDown();
    zofka.move(20);

    for (int i = 0; i < 3; i++) {
      zofka.turnLeft(60);
      zofka.move(15);
    }
    for (int i = 0; i < 2; i++) {
      zofka.turnLeft(100);
      zofka.move(15);
    }
    for (int i = 0; i < 3; i++) {
      zofka.turnLeft(60);
      zofka.move(15);
    }
  zofka.penUp();
    zofka.turnRight(20);
    zofka.move(100);
  }


}
