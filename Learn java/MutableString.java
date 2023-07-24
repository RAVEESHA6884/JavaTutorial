public class MutableString
{
    public static void main(String args[])
    {
        StringBuffer sb=new StringBuffer("Surya ");
        sb.append("raveesh");
        sb.insert(13," Kannadiga");
        System.out.println(sb);
    }
}