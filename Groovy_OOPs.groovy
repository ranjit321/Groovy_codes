class GroovyOOPs{
    
    static void main(String[] args)
    {
       def anim=new Animal('Cat','Meanww');

       println("$anim.name makes $anim.sound  sound");

      //setter method
       anim.setSound('Grrrr');

        println("$anim.name makes $anim.sound  sound");

        anim.run();

        def dog=new Dog('Rocky','Grrss','Ranjit');

        anim.makeSound();
        dog.makeSound();
    }
}