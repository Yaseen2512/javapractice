public class eq1 {
    public static void main(String[] args) {
        String a="sana";
        String b="sana";
        String c=b; // output is true because the given three variable a,b and c poits the same refrence value
        
        if (a==c)
        {
            System.out.println("the given str stored in a is equal to c");
        }
        else 
        {
            System.out.println("the given str stored in a is not equal to c");
        }
        System.out.println(a==c);
    }
}
