public class Example{
     public static void main(String[] args) {

        Person student1 = new Person("Josh",30);
        Person student2 = new Person("Sandie",20);
        Person student3 = new Person("Mike",25);
        Person student4 = new Person("Greg",27);
        Animal animal1 = new Animal("Nala", "Cat");
        Animal animal2 = new Animal("Prince", "Dog");
        Animal animal3 = new Animal("Teddy", "Bear");
        Animal animal4 = new Animal("Lady", "Owl");
        
        animal1.attacks(student1.getName());
        animal2.attacks(student2.getName());
        animal3.attacks(student3.getName());
        animal4.attacks(student4.getName());
        student1.printP();
        student2.printP();
        student3.printP();
        student4.printP();

        student1.sayHello(student2.getName());



    }
}