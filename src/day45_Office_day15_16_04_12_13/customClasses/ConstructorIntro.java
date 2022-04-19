package day45_Office_day15_16_04_12_13.customClasses;

public class ConstructorIntro {
    /*

    What is Constructor?
    - It is a special method to initialize all instance variables for CURRENT OBJECT
    - Constructor name MUST be the SAME as CLASSNAME
    - DOES NOT HAVE RETURN TYPE

    When it works?
    - it works when you call it.

    ConstructorIntro c = new ConstructorIntro();


    Structure
        AccessModifier ClassName(){
        }

        public Car(){
            // No ARG Constr
        }

   Types of Constructor

   No ARG Constr
        - if we do not create any CONSTR, Compiler will create DEFAULT Constr (with no param)
        - if you create Constr with either param or not, compiler will not create it for you
   Parameterized Constr
        - if you want to initialize your instances, you need to pass your values as arg

   public class Rectangle{
        int length;
        int width;
        public Rectangle(int length, int width){
        this.length = length;
        this.width = width;
   }

   // Java prioritizes local variables
   // that is why we need to specify current Object instance variable with this

   }

   Constructor Chaining --> Call one constr from another one
   - use this() to call another constructor
   - it MUST be in FIRST LINE for another constr
   - cannot call more than ONE CONSTR with this()
   - cannot call ITSELF

   This VS This()
   this : it refers to current OBJECT

        this.instanceMethod();
        this.instanceVar;
   this(): it refers to current OBJECT Constr. It can take parameters too

     */
}
