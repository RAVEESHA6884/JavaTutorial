class Student
{
    int marks;
    String name;
    String address;
}
public class ArrayStudents
{
    public static void main (String args[])
    {
       
        Student s1=new Student();
        s1.name="ravi";
        s1.marks=89;
        s1.address="Sira";

        Student s2=new Student();
        s2.name="Mam";
        s2.marks=99;
        s2.address="chikballapur";

        Student s3=new Student();
        s3.name="Surya";
        s3.marks=80;
        s3.address="Bangalore";

         Student students[]=new Student[3];
         students[0]=s1;
         students[1]=s2;
         students[2]=s3;
         for(int i=0;i<students.length;i++)
         {
            System.out.println(students[i].name+ " : " +students[i].marks);
         } 

    }
}