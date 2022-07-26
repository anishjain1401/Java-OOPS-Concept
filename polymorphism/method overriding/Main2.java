import java.util.Scanner;

class Audi{

int topspeed(){
	return 300;
	}
}

class BMW{

int topspeed(){
	return 200;
	}
}

class Mercedes{

int topspeed(){
	return 250;
	}
}

public class Main2{

public static void main(String z[]){

Scanner s=new Scanner(System.in);

BMW c1=new BMW();
Audi c2=new Audi();
Mercedes c3=new Mercedes();

System.out.println("We have 3 models");
System.out.println("1. BMW");
System.out.println("2. Audi");
System.out.println("3. Mercedes");
System.out.println("Enter your choice: ");

int i=s.nextInt();

if(i==1){
System.out.println("SPEED OF BMW :"+c1.topspeed());
}

else if(i==2){
System.out.println("SPEED OF Audi :"+c2.topspeed());
}

else if(i==3){
System.out.println("SPEED OF Mercedes :"+c3.topspeed());
}

else{
System.out.println("Please enter valid number");
}

}

}