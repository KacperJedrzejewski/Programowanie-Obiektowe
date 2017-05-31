using System;
using System.Collections;

public class Primes : IEnumerator{
    
    int next ;
    public Primes(){ next = int.MaxValue - 200; }

    bool primeCheck(int n){
        if (n < 2) return false;
        for (int i = 2; i <= Math.Sqrt(n); i++) if (n % i == 0) return false;
        return true;
    }

    public bool MoveNext(){
        next++;
        while (!primeCheck(next)) next++;
        return next < int.MaxValue;
    }
    
    public object Current{
        get
        {
            return next;
        }
    }

    public   void Reset(){next = 1;}
}

class PrimeCollection : IEnumerable{
    public IEnumerator GetEnumerator(){
        return new  Primes();
    }
}

class Program{
    static void Main(){
        PrimeCollection A = new PrimeCollection();
        foreach (int e in A) System.Console.WriteLine(e);
        }
}
