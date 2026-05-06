import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class try_with_resources {
    public static void main(String[] args) throws IOException {
//        int i = 0;
//        int j = 0;
//        try{
//            j = 18/i;
//        }
//        catch(Exception e){
//            System.out.println("Something went wrong");
//        }
//        finally{
//            System.out.println("Bye");
//        }
        int num = 0;


        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
//            br = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
//        finally{
//            br.close();
//        }

    }
}
