class Dog extends Animal{
    def owner;

    def Dog(name, sound, owner){
        super(name, sound);
        this.owner=owner;
    }

    //method override
    def makeSound()
    {
        println("$name of $owner says $sound and barks");
    }

}