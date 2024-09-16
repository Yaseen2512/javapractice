import java.util.*;
public class whilerand {
    public static void main(String[] args) {
        Random rand=new Random();
        int num=0;
        while(num!=9)
        {
            num=rand.nextInt(10);
            System.out.println(num);
        }
        
    }
}
