/*REFER encap.java  FOR DETAILS

  IF YOU HAVE SET THE VALUE OF PRIVATE DATA MEMBER STATICALLY , AND IF YOU ASSIGN THE
  VALUE IN SET THEN IT WILL
  GIVE COMPILE TIME ERROR.
  
  CANNOT PASS VALUE LIKE obj.name Compile Time Error, because the name data member 
  is private.   
  So, it can't be accessed from outside the class  
  
*/
public class Main4{

public static void main(String z[]){

//creating instance of the encapsulated class 
encap obj=new encap();

//setting value in the name member  
obj.setName("abc");
obj.setRoll(5);
obj.setAge(16);

//getting value of the name member 
System.out.println("Name: "+obj.getName());
System.out.println("Roll Number: "+obj.getRoll());
System.out.println("Age: "+obj.getAge());
}
}