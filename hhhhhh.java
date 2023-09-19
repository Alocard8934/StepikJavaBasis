package JavaBasicsStepik;


public class hhhhhh {
    public static void main(String[] args) {
        String st1 = "Hello!";
String st2 = "Hello!";
String st3 = new String("Hello!");
String st4 = new String("Hello!");
st3=st3.intern();
System.out.println(st3==st4);
System.out.println(st1==st4);

System.out.println(st1==st3);
System.out.println(st1==st2);
    }
}
