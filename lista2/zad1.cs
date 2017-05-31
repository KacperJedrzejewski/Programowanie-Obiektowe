using System;

class IntStream{
	int wartosc = 0 ;
	bool eos(){
	if (wartosc == Int32.MaxValue) return true;
	return false;
	}

virtual public int next(){
	if(eos()){
		Console.WriteLine("Przekroczyłeś maksymalny rozmiar strumienia. Czy zresetowac? 1-tak");
		int tmp = Convert.ToInt32(Console.ReadLine());
		if (tmp == 1 ) reset();
		else return wartosc; 
	}
	return wartosc++;
}

public void reset(){	
	this.wartosc = 0 ;
	}
}

class PrimeStream : IntStream{
	bool prime(int numer){
		if (numer < 2) return false;
		for (int i = 2; i<= Math.Sqrt(numer); i++){
			if (numer % i == 0) return false;
		}
		return true;
	}
	 override public int next(){
		int tmp = base.next() ;
		while (!prime(tmp)){
			tmp = base.next() ;
		}
		return tmp; 
	}
}
class RandomStream {
	Random rnd = new Random();
	public int next(){
		return rnd.Next(0,Int32.MaxValue);
	}
}
class RandomWordStream {
	PrimeStream dlugosc = new PrimeStream();
	RandomStream wartosc = new RandomStream();
	public string next(){
		char [] slowo = new char[dlugosc.next()];
		for(int i = 0; i <  slowo.Length; i++){
			slowo[i] = Convert.ToChar(wartosc.next()%93+33);
		}
		string s = new string(slowo);
		return  s;
	} 
}

class Program {
public static void Main(){
		IntStream stream = new IntStream();
		PrimeStream prime = new PrimeStream();
		RandomStream rand = new RandomStream();
		RandomWordStream word = new RandomWordStream();
		Console.WriteLine("Next z klasy IntStream");
		for(int i = 0 ; i <= 5 ; i++){
			Console.WriteLine(stream.next());
		}
		Console.WriteLine("Next z klasy PrimeStream");
		for(int i = 0 ; i <= 5 ; i++){
			Console.WriteLine(prime.next());
		}

		Console.WriteLine("Next z klasy RandomStream");
		for(int i = 0 ; i <= 5 ; i++){
			Console.WriteLine(rand.next());
		}

		Console.WriteLine("Next z klasy RandomWordStream");
		for(int i = 0 ; i <= 5 ; i++){
			Console.WriteLine(word.next());
		}

	}
}
