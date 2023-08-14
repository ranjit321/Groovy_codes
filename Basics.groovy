/*
This program illustrates introduction to 
groovy programming language by performing 
basic operation.
Credit : https://www.youtube.com/watch?v=B98jc8hdu9g&t=2160s
*/

class Basics{

static void main(String [] args)
  {
   
    def Name="Ranjit Kumar";
    def age="Unknown";
    age=40; //groovy is dynamically tyoed language
    println("My name is: ${Name}, having age ${age}");
    println(5.2.plus(4.4)); //evert variable in  groovy acts like an object
    println("4 times 5 is: "+(5.multiply(4)));
    println("Biggest integer value: "+ Integer.MAX_VALUE) 
    println("Biggest float value is: "+Float.MIN_VALUE)

    def num=2.0
    println ("2 pow (4)"+(2.0.pow(5)));
    println("2.0 equals 3.0:"+(2.0.equals(3.0)));
    println("Math.ciel(2.45): "+Math.ceil(2.45));
    println("num.equalsNAN: "+(num.equals(Float.NaN)))
    println("MAx of 2 and 3: "+(Math.max(2,3)));
    
    def name="ranjit"
    def multLineStr='''
    This is a 
    multiline string
    '''
    println(multLineStr);

    println("4th character: "+ multLineStr[10]);
    println("Index of a: "+multLineStr.indexOf('a'));
    println("First 4 characters: "+multLineStr[0..3]);
    println("specified characters: "+multLineStr[1,4,5,7]);
    println("Substring at a given index :"+multLineStr.substring(13));
    println("Substring at a given index :"+multLineStr.substring(13,18));
    println("Hey ${Name}"+multLineStr);
    println("Hey ${Name}".concat(multLineStr));
    println("comapre Name and multiLineStr:"+Name.equals(multLineStr));
    println("Ignore case: "+Name.equalsIgnoreCase(name));

    printf("My name is %s \n",name); //printf statement
    printf("%-10s %d %.3f %10s\n",[name, 45, 45.59632,name]); //-10s padding on right side, 10s padding on left side

    //Input and output

    printf("Input your age\n");
    def myAge=System.console().readLine().toInteger();
   
   //lists
    def myList=['Ranjit', 26, [4,5,6]];
    println("list length: "+myList.size());
    println("3rd number"+ myList[2][2]);

    //ranges

    def oneTo10=1..10;
    def aToz='a'..'z';

    println("${oneTo10}");
    println("${aToz}");
    println(aToz.size());
    

    //functions in groovy
    def a=5;
    def b=6;
    println("sum of 2 numbers is: "+sum(a,b));
    printf("a=%d and b=%d in main function\n",[a,b]);
    println("Sum of numbers is:"+sumNums(1,2,3,4));

    //closure functions
    //factorial

    def factorial={number->(number<=1?1:number*call(number-1))}
    printf("factorial of %d is: %d\n",[4, factorial(4)]);

    def greet={name2->println("Hello ${name2}")}
    greet("Rakesh");

    def numsList=[1,2,3,5];
   // numsList.each(x->print(x));
      numsList.each{println(it);}
     numsList.each{x->if(x%2==0)printf("%d is seven number\n",[x])}

    def employees=[
     'Name':'Ranjit',
     'Age':9,
     'Place':'Ranchi'
    ]  

    //employees.each{x->println("$x.key:$x.value")}
    employees.each{println("$it.key: $it.value")  }

    //find matches
    def names=["Ranjit", "Sahil", "Vivek","Ranjit"];
    def found=names.find(x->x=="Ranjit")
    println(found);

    def founds=numsList.findAll(x->x>2)
    println(founds);
    println("Double:"+numsList.collect(x->x*2))

    //File IO operations
    
    //Read file
    new File("Test.txt").eachLine{
      line->println "$line";
    }
   
   //overwrite a file
    new File("Test.txt").withWriter('utf-8'){
      write->write.writeLine("Everything erased");
    }

    //append a file
    File fl=new File("Test.txt");
    fl.append("new Text added");

    //print file texts as string
    println(fl.text)

    println("File size:${fl.length()}, ISFile: ${fl.isFile()}, IsDirectory:${fl.isDirectory()}")

    //copy contents of a file
    File newFile=new File("Test2.txt");
    newFile<<fl.text;
  }
  //the values passed are pass by value
 static def sum(num1=0, num2=0)
 {
  num1+=5;
  return num1+num2;
 }

 //passing multiple arguments

 static def sumNums(int ... num)
 {
  def sum=0;
  num.each{sum+=it;}
  return sum;
 }
}