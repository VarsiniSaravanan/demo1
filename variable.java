class variable{
    public static void main(String a[]){
       byte num1=27;
       byte num2=10;
       int result=num1 + num2;
       System.out.println(result);
        
    }
}

class datatype{
    public static void main(String a[]){
        byte by=2;
        short sh=435;
        int integer=123;
        long ln=243246;
        char n='v';
        String name="varsini";
        System.out.println(by);
        System.out.println(sh);
        System.out.println(integer);
        System.out.println(ln);
        System.out.println(n);
        System.out.println(name);
    }
}

class type_conversion{
    public static void main(String args[]){
        byte a = 124;
        int b = 1234;
        byte c = 124;
        int result = a+c; //type promotion
        a=(byte)b;  //Explicit conversion--type casting
        //b=a;   (implicit conversion)--type conversion
        //System.out.println(b);
        System.out.println(a);
        System.out.println(result);
    }
}

class arithmetic_operators{
    public static void main(String a[]){
        int num1 = 5;
        int num2 = 7;
        int add = num1 + num2;
        int sub = num1 - num2;
        int multi = num1 * num2;
        int floor = num2/num1;
        int modulus = num1 % num2;
        int result1 = ++num1;    //pre-increment  increment by 1 and fetch the value
        int result2 = num2++;    //post-increment  fetch the value and increment by 1
        System.out.println(add);
        System.out.println(sub);
        System.out.println(multi);
        System.out.println(floor);    //gives quotient
        System.out.println(modulus);  //gives remainder
        System.out.println(result1);  
        System.out.println(result2);
    }
}

