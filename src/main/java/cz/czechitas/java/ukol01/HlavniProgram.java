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

      // posouvam zelvu
    zofka.penUp();
      zofka.turnRight(90);
    zofka.move(200);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnLeft(90);

   nakresliPrasatko();

      //ZACINAM SLUNCE

//posouvam zelvu

zofka.turnLeft(10);
zofka.move(690);
zofka.turnRight(90);
zofka.move(250);

nakresliSlunce();


//posouvam zelvu
zofka.turnRight(-20);
zofka.penUp();
zofka.turnRight(90);
zofka.move(25);

nakresliSmilik();

      ////kolo
//      zofka.penDown();
//      for (int i = 0; i < 18; i++) {
//          zofka.turnRight(20);
//          zofka.move(20);}
////romb
//          zofka.penUp();
//          zofka.turnLeft(90);
//          zofka.move(150);
//zofka.penDown();
//      for (int i = 0; i < 8; i++) {
//          zofka.turnRight(45);
//          zofka.move(40);
//      }
// posouvam zelvu
 zofka.penUp();
 zofka.turnLeft(90);
 zofka.move(450);
 zofka.turnLeft(180);
 //1 dom
nakresliDomek();

//relokace
zofka.turnRight(45);
for (int i = 0; i < 2; i++) {
   zofka.penUp();
   zofka.move(100 );
   zofka.turnRight(90);
}
zofka.move(200);

//domek2
nakresliDomek();

//relokace
zofka.turnLeft(45);
zofka.move(100);
zofka.turnLeft(90);

//dom3
nakresliDomek();

//posouvam zelvu
zofka.penUp();
zofka.turnRight(45);
zofka.move(100);
zofka.turnLeft(90);
zofka.move(100);
zofka.turnLeft(90);

//domek4
nakresliDomek();

//posouvam zelvu
zofka.penUp();
zofka.turnRight(45);
zofka.move(100);
zofka.turnLeft(90);
zofka.move(100);
zofka.turnLeft(90);

//domik5
nakresliDomek();

//posouvam zelvu
zofka.penUp();
zofka.turnRight(45);
zofka.move(100);
zofka.turnLeft(90);
zofka.move(100);
zofka.turnLeft(90);

//domik6
nakresliDomek();

//posouvam zelvu
zofka.penUp();
zofka.turnRight(45);
zofka.move(100);
zofka.turnLeft(90);
zofka.move(100);
zofka.turnLeft(90);


//domik7
nakresliDomek();

////posouvam zelvu
zofka.penUp();
zofka.move(120);
zofka.turnRight(45);
zofka.move(120);
zofka.turnRight(180);

//domik8
nakresliDomek();

//relokace zelvy
zofka.penUp();
zofka.turnRight(45);
zofka.move(100);
zofka.turnRight(90);
zofka.move(100);
zofka.turnLeft(90);
zofka.move(200);
zofka.turnLeft(180);

//domik 9
nakresliDomek();

//relokace
zofka.penUp();
zofka.turnRight(45);
zofka.move(280);
zofka.turnRight(90);
zofka.move(900);
zofka.turnRight(90);
zofka.penDown();

          //JMENO
//Dcko
zofka.move(100);
zofka.turnRight(90);
zofka.move(18);
      for (int i = 0; i < 9; i++) {
          zofka.turnRight(20);
          zofka.move(18);
      }

//relokace
  zofka.turnRight(180);
      zofka.penUp();
      zofka.move(100);
      zofka.turnLeft(90);
//Acko
      Acko();

      //relokace
      zofka.turnLeft(67.5);
      zofka.move(50);

     //Rko
zofka.penDown();
zofka.turnLeft(90);
zofka.move(100);
zofka.turnRight(90);
zofka.move(10);
      for (int i = 0; i < 9; i++) {
          zofka.turnRight(20);
          zofka.move(10);
      }
  zofka.turnLeft(135);
  zofka.move(60);
  zofka.penUp();

  //relokace
      zofka.turnLeft(45);
      zofka.move(70);
      zofka.turnLeft(90);
//Ycko
   zofka.penDown();
   zofka.move(60);
   zofka.turnRight(45);
   zofka.move(65);
   zofka.turnRight(180);
   zofka.move(65);
   zofka.turnRight(90);
   zofka.move(65);
   zofka.penUp();
   zofka.turnRight(180);
   zofka.move(65);
   zofka.turnRight(45);
   zofka.move(60);
// relokace
      zofka.turnLeft(90);
      zofka.move(70);
      zofka.turnLeft(90);
  //Acko
      Acko();

      //relokace
      zofka.turnLeft(67.5);
      zofka.move(50);
  }

    private void nakresliSmilik() {
        zofka.penDown();
        zofka.move(5);
        zofka.penUp();
        zofka.move(35);
        zofka.penDown();
        zofka.move(5);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(25);
        zofka.penDown();
        for (int i = 0; i < 3; i++) {
            zofka.turnRight(60);
            zofka.move(15);
            zofka.turnLeft(30);
        }
    }

    private void Acko() {
        zofka.penDown();
        zofka.turnLeft(-22.5);
        zofka.penDown();
        zofka.move(100);
        zofka.turnRight(135);
        zofka.move(100);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(67.5);
        zofka.move(35);
        zofka.penUp();
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(35);
        zofka.turnRight(67.5);
        zofka.move(50);
    }

    private void nakresliDomek() {
        zofka.penDown();
        for (int i = 0; i < 4; i++) {
      zofka.move(100 );
      zofka.turnRight(90);
  }
        zofka.penUp();
        zofka.move(100 );
        zofka.penDown();
        zofka.turnRight(45);
        zofka.move(70.7 );
        zofka.turnRight(90);
        zofka.move(70.7);
        zofka.penUp();
    }

    private void nakresliSlunce() {
        //kreslim slunce
        zofka.turnRight(20);
        for (int i = 0; i < 12; i++) {
            zofka.penDown();
            zofka.move(25);
            zofka.turnLeft(75);
            zofka.move(25);
            zofka.turnRight(180);
            zofka.move(25);
            zofka.turnLeft(75);

        }

    }

    private void nakresliPrasatko() {
        // dal pisu cykl pro tvorbu  tela
        for (int i = 0; i < 2; i++) {
          zofka.penDown();
          zofka.move(150);
    zofka.turnRight(90);
    zofka.move(100);
    zofka.turnRight(90);
        }

        //dal jde cumacek
        zofka.turnRight(180);
        zofka.turnLeft(30);
        zofka.move(100);
        zofka.turnLeft(120);
        zofka.move(100);

        //jdu na predni nohy
        zofka.turnRight(30);
        zofka.move(50);
        zofka.turnRight(180);
        zofka.move(50);
        zofka.turnLeft(110);
        zofka.move(50);

//presouvam se do zadni casti tela
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(50);
        zofka.turnRight(50);
        zofka.move(150);

//kreslim zadni nohy
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

//kreslim ocas
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






