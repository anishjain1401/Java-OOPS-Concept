class multi{

int multi(int a,int b){
return a*b;
}

double multi(double a,double b){
return a*b;
}

int multi(int a,int b,int c){
return a*b*c;
}

}


public class Main3{

public static void main(String z[]){

multi m=new multi();

System.out.println(m.multi(2,3));
System.out.println(m.multi(3.3,6.6));
System.out.println(m.multi(2,3,4));

}
}