        class Calculator
        {
            int a;
        public int  add(int n1,int n2)
        {
            int r=n1+n2;
            return r;
        }
        }
        public class ClassDemo
        {
            public static void main (String arg[])
            {
                int num1=5;
                int num2=4;
                Calculator calc =new Calculator();
                int resultf=calc.add(num1,num2);
                System.out.println(result);

            }
        }