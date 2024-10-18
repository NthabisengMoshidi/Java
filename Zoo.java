
abstract class Animal {

     abstract void make_sound();

}



class Lion extends Animal {

    void make_sound() {

        System.out.println("Roar");

    }

}



class Elephant extends Animal {

    void make_sound() {

        System.out.println("Trumpet");

    }

}



class Monkey extends Animal {

    void make_sound() {

        System.out.println("Ooh ooh ooh ooh");

    }

}





public class Main {

    public static void main(String[] args) {

       

        Animal lion = new Lion();

        Animal elephant = new Elephant();

        Animal monkey = new Monkey();

        

System.out.print("Lion: ");

        lion.make_sound();

System.out.print("Elephant: ");

        elephant.make_sound();

System.out.print("Monkey: ");

        monkey.make_sound();

    }

}