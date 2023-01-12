public class mport java.util.regex.*;
public class RegexExample1{
public static void main(String args[]){
Pattern p = Pattern.compile(".s");
Matcher m = p.matcher("as");
boolean b = m.matches();
boolean b2=Pattern.compile(".s").matcher("as").matches();
boolean b3 = Pattern.matches(".s", "as");

System.out.println(b+" "+b2+" "+b3);
}}  {
public static void main(String args[]){
String s="200";
Integer i=Integer.valueOf(s);
System.out.println(i);
}}
