public class Example{
 public boolean isEven(int number){
 if(number%2==0){
 return true;
 }
 else{
 return false;
 }
 }
public static void main(String[] args){
int num=5;
Example ex=new Example();

System.out.println(ex.isEven(num));
}
}