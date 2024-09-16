public class swap1 {
    public static void main(String[] args) {
        System.out.println("Before swap value");
		int a = 10;
		int b = 20;
		System.out.println(a);
		System.out.println(b);
		System.out.println("after swap value");
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println(a);
		System.out.println(b);
    }
    
}
