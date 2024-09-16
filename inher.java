public class inher {
    public static void main(String[] args) {
        advcalc obj = new advcalc();
        double ad=obj.add(12, 25);
        double su=obj.sub(21,12);
        double mu=obj.multi(12.5, 25.5);
        double dv=obj.div(7.6, 2.4);

        System.out.println(ad);
        System.out.println(su);
        System.out.println(mu);
        System.out.println(dv);

    }
}
