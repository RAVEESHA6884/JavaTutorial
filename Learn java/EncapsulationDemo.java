
class Human
{
    private int age;
    private String name;

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
public class EncapsulationDemo
{
    public static void main (String arg[])
    {
            Human obj=new Human();
            obj.setName("Surya");
            obj.setAge(22);
            // h.age=22;
            // h.name="Surya";
            System.out.println(obj.getAge() + ":" + obj.getName());
            // System.out.println(h.name);
    }
}