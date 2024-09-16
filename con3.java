public class con3 {
    int empid;
    String empname;

    con3(int id ,String name) 
    // this the constructor with the same name of the class and this is the paramertized constructor with two parameter 
    {
        this.empid=id;
        this.empname=name;
    }

    void info()
    {
        System.out.println("ID : "+empid+" name : " +empname);
    }

    public static void main(String[] args) {
        con3 emp1=new con3(1225, "yaseen");
        con3 emp2=new con3(2512, "sana");
        emp1.info();
        emp2.info();
    }
}
