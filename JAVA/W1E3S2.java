public class W1E3S2{

    public static void main(String args[]){

        //Declare a long variable with value with int range then declare another long variable with value outside the range of int. 
        //Write down what happened.

        long insideValue = 2147483647l;
        long outsideValue = 2147483648L;
        long sum = insideValue + outsideValue;
        System.out.println("two value put   "+ sum );
        
        //error: integer number too large
        //Refer to slide 26
    }

}