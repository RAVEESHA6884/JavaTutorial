    class Mobile
    {
        String Brand;
        int price;
       static  String name;

    public void show()
    {
        System.out.println(Brand + ":"+price+":"+name);
    }
    }
public class MobileDemo
{
    public static void main(String args[])
    {
        Mobile obj1=new Mobile();
        obj1.Brand="Apple";
        obj1.price=15000;
        Mobile.name="Smartphone";
        Mobile obj2=new Mobile();
        obj2.Brand="RedMi";
        obj2.price=12000;
        Mobile.name="Smartphone";

        obj1.name="phone";
        obj1.show();
        obj2.show();

    }
}