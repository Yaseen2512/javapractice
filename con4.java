public class con4 {
    String web ;
    con4(String w)
    {
        web=w;
    }

    con4(con4 je )
    {
        web=je.web;
    }
    void disp()
    {
        System.out.println("Website: " +web);
    }

    public static void main(String[] args) {
        con4 web1=new con4("sana");

        con4 web2=new con4(web1);

        web1.disp();
        web2.disp();
    }
}
