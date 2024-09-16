public class form {
    private String name ; // we can access the name in this function but not in other functions
    int rollnum ;

    private  void display()
    {
        System.out.println(name);
        System.out.println(rollnum);
        
    }

    public void set_value(String str, int num)
    {
        name=str;
        rollnum=num;
    }
    public void disp () {
        System.out.println(name);
        System.out.println(rollnum);
    }


class one{
    public static void main(String[] args) {
        form obj=new form();
        obj.set_value("yaseen", 1225) ;
        obj.disp();

        form view=new form();
        view.name="sana";
        view.rollnum=2512;
        view.disp();
    }
}
}
