public class eq2 {
    public static void main(String[] args) {
        String a="sana";
        String b=new String("sana");
        String c=b; // the output is false because the refrence address is not same for a and b
        System.out.println(a==c);
    }
}
