class AdilException extends Exception{
    public AdilException(String string){
        super(string);
    }
}

public class Exception_throw_keyword {
    public static void main(String[] args) {

//        int i = 2;
        int i = 20;
        int j = 0;

        try{
            j = 18/i;
            if(j==0)
//                throw new ArithmeticException("I don't want ot print zero");
                throw new AdilException("I don't want to print zero");
        }
        catch(AdilException e){
            j = 18/1;
            System.out.println("that's default output " + e);
        }
        catch (ArithmeticException e){
            j = 18/1;
            System.out.println("that is default output" + e);
//            System.out.println("Cannot divide by zero");
        }
        catch (Exception e){
            System.out.println("Something Went wrong.." + e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
