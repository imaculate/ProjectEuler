import java.util.*;
public class Problem60{
   public static int[] primes = null;
   public static void main(String[] args){
      int result = Integer.MAX_VALUE;
      primes = ESieve(30000);
   
      ArrayList<HashSet<Integer>> pairs = new ArrayList<HashSet<Integer>>(primes.length);
      for(int i = 0; i< primes.length; i++){
         pairs.add(null);
      }
   
      for (int a = 1; a < primes.length; a++) { 
         if (primes[a] * 5 >= result) 
            break;
         if (pairs.get(a) == null) pairs.set(a , MakePairs(a));
         for (int b = a + 1; b < primes.length; b++) { 
            if (primes[a] + primes[b] * 4 >= result) 
               break;
            if (!pairs.get(a).contains(primes[b])) 
               continue;
            if (pairs.get(b) == null) pairs.set(b , MakePairs(b));
         
            for (int c = b + 1; c < primes.length; c++) { 
               if (primes[a] + primes[b] + primes[c] * 3 >= result) 
                  break;
               if (!pairs.get(a).contains(primes) ||
               !pairs.get(b).contains(primes)) 
                  continue;
               if (pairs.get(c) == null) pairs.set(c,  MakePairs(c));
            
               for (int d = c + 1; d < primes.length; d++) { 
                  if (primes[a] + primes[b] + primes[c] + primes[d] * 2 >= result) 
                     break;
                  if (!pairs.get(a).contains(primes[d]) ||
                  !pairs.get(b).contains(primes[d]) ||
                  !pairs.get(c).contains(primes[d])) 
                     continue;
                  if (pairs.get(d) == null) pairs.set(d , MakePairs(d));
               
                  for (int e = d + 1; e < primes.length; e++) { 
                     if (primes[a] + primes[b] + primes[c] + primes[d] + primes[e] >= result) 
                        break;
                     if (!pairs.get(a).contains(primes[e]) ||
                     !pairs.get(b).contains(primes[e]) ||
                     !pairs.get(c).contains(primes[e]) ||
                     !pairs.get(d).contains(primes[e])) 
                        continue;
                  
                     if (result > primes[a] + primes[b] + primes[c] + primes[d] + primes[e])
                        result = primes[a] + primes[b] + primes[c] + primes[d] + primes[e];
                  
                     System.out.printf("{0} + {1} + {2} + {3} + {4} = {5}", primes[a], primes[b], primes[c], primes[d], primes[e], result);
                     break;
                  }
               }
            }
         }
      }
      
   }
   
   private static HashSet<Integer> MakePairs(int a) {
      HashSet<Integer> pairs = new HashSet<Integer>();
      for (int b = a + 1; b < primes.length; b++) {
         if (isPrime(concat(primes[a], primes[b])) &&
            isPrime(concat(primes[b], primes[a])))
            pairs.add(primes[b]);
      }
      return pairs;
   }
   
   
   private static int concat(int a, int b) {
      int c = b;
      while (c > 0) {
         a *= 10;
         c /= 10;
      }
   
      return a + b;
   }
   
   public static int[] ESieve(int upperLimit) {
      int sieveBound = (int)(upperLimit - 1) / 2;
      int upperSqrt = ((int)Math.sqrt(upperLimit) - 1) / 2;
   
      BitSet PrimeBits = new BitSet(sieveBound + 1);
      PrimeBits.set(0,PrimeBits.size(), true);
   
      for (int i = 1; i <= upperSqrt; i++) {
         if (PrimeBits.get(i)) {
            for (int j = i * 2 * (i + 1); j <= sieveBound; j += 2 * i + 1) {
               PrimeBits.set(j, false);
            }
         }
      }
   
      ArrayList<Integer> numbers = new ArrayList<Integer>((int)(upperLimit / (Math.log(upperLimit) - 1.08366)));
      numbers.add(2);
   
      for (int i = 1; i <= sieveBound; i++) {
         if (PrimeBits.get(i)) {
            numbers.add(2 * i + 1);
         }
      }
   
      return  convertIntegers(numbers);
   }
   public static int[] convertIntegers(List<Integer> integers)
   {
      int[] ret = new int[integers.size()];
      for (int i=0; i < ret.length; i++)
      {
         ret[i] = integers.get(i).intValue();
      }
      return ret;
   }
   
   
   private static boolean isPrime(int n) {
      if (n <= 1) 
         return false;
      if (n == 2) 
         return true;
      if (n % 2 == 0) 
         return false;
      if (n < 9) 
         return true;
      if (n % 3 == 0) 
         return false;
      if (n % 5 == 0) 
         return false;
   
      int[] ar = new int[] { 2, 3 };
      for (int i = 0; i < ar.length; i++) {
         if (Witness(ar[i], n)) 
            return false;
      }
      return true;
   }


   private static boolean Witness(int a, int n) {
      int t = 0;
      int u = n - 1;
      while ((u & 1) == 0) {
         t++;
         u >>= 1;
      }
   
      long xi1 = ModularExp(a, u, n);
      long xi2;
   
      for (int i = 0; i < t; i++) {
         xi2 = xi1 * xi1 % n;
         if ((xi2 == 1) && (xi1 != 1) && (xi1 != (n - 1))) 
            return true;
         xi1 = xi2;
      }
      if (xi1 != 1) 
         return true;
      return false;
   }


   private static  long ModularExp(int a, int b, int n) {
      long d = 1;
      int k = 0;
      while ((b >> k) > 0) k++;
   
      for (int i = k - 1; i >= 0; i--) {
         d = d * d % n;
         if (((b >> i) & 1) > 0) d = d * a % n;
      }
   
      return d;
   }

}