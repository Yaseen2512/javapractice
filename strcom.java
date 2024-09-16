public class strcom {
    public static void main(String[] args) {
        String s1="apple"; // this type of the string check the address not the content 
        String s2="apple";

        String y1=new String("apple"); // it does not check the address of the string that abc==xyz
        String y2=new String("apple");

        System.out.println(y1==y2); // it comapre the string address but the out put is false beacuse the address is not same 

        System.out.println(s1==s2); // it compare the string address beacause the address of the string is same it give the variable refrence to the already given string 

        System.out.println(y1.equals(y2)); // it compare the string not the string address 
        // when we compare the string we must use the function = -.equals(-);
    }
}
