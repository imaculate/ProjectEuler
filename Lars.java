import java.math.*;
public class Lars{
   public static void main (String[] args){
      BigInteger bg = new BigInteger("1");
      for(int i =1 ; i<= 40; i++){
         bg = bg.multiply(new BigInteger(i+""));
      }
      BigInteger tw = new BigInteger("1");

      for(int j =1 ; j<= 20; j++){
         tw = tw.multiply(new BigInteger(j+""));
      }
   bg = bg.divide(tw).divide(tw);
      
      System.out.println(bg);
   }
}
