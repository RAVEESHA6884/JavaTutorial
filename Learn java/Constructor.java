
class Human
{
    private int age;
    private String name;

    public Human()          //default constructor
    {
        System.out.println("in constructor");
    }
    public Human(int a,String n)        //parameterised constructor
    {
            age=a;
            name=n;
    }
    public int getAge()
    {
        return age;
    } 
    public void setAge(int a)
    {
        age=a;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name=n;
    }
}
public class Constructor
{
    public static void main (String arg[])
    {
            Human obj=new Human();
            Human obj1=new Human(12,"ravi");
            obj.setName("Surya");
            obj.setAge(22);
            // h.age=22;
            // h.name="Surya";
            System.out.println(obj.getAge() + ":" + obj.getName());
            System.out.println(obj1.getAge() + ":" + obj1.getName());
            // System.out.println(h.name);
    }
}