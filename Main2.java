class Main2 {

    public static void main(String[] args) {
        Animal myObj = new Animal("Generic animal", 5);
        Mammal myObj1 = new Mammal("Mammal", 6, "Brown");
        Bird myObj2 = new Bird("Bird", 7, 2.5);
        Dog myObj3 = new Dog("Dog", 8, "Black", "Rottweiler");
        myObj.makeSound();
        myObj1.makeSound();
        myObj2.makeSound();
        myObj3.makeSound();
        System.out.println("Animal: " + myObj);
        System.out.println("Mammal: " + myObj1);
        System.out.println("Bird: " + myObj2);
        System.out.println("Dog: " + myObj3);
    }
}
