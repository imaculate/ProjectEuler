public class Primes
{
    public boolean isPrime(long n)
    {
        if ( n % 2 == 0 ) //even numer so can't be prime
            return false;

        long half = (n/2) % 2 == 0 ? (n/2)-1 : n/2; //make sure we work with odd number
        for ( int i = 3; i < half; i += 2 ) //step of 2 to keep it odd numbers
        {
            if ( n % i == 0 )
                return false;
        }

        return true;
    }


public static void main(String[] args)
{
    Primes p = new Primes();

    long t = 600851475143L;
    long d = 2;
    while (1==1)
    {
        long tmp = 600851475143L / d;
        if ( t % tmp == 0 &&  p.isPrime(tmp) )
        {
            System.out.println("= " + tmp);
            break;
        }
        d++;
    }
}
}