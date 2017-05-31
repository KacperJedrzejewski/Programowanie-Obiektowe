using System;
using System.Collections.Generic;

class ListaLeniwa{
	Random rnd = new Random();
	protected List<int> lista = new List<int>();
	int random(){
		return rnd.Next(Int32.MinValue,Int32.MaxValue);
	}
	virtual public int element(int i){
		while (i > size()){
			lista.Add(random());
		}
		return lista[i-1];
	}
	public int size(){
		return lista.Count;
	}
}

class Pierwsze : ListaLeniwa{
	int n = 0; 
	bool prime(int numer){
		if (numer < 2) return false;
		for (int i = 2; i<= Math.Sqrt(numer); i++){
			if (numer % i == 0) return false;
		}
		return true;
	}
	int pierwsza(){
		while(!prime(n)){
			n++;
		}
		return n++; 
	}
	override public int element(int i){
		while (i > size()){
			lista.Add(pierwsza());
		}
		return lista[i-1];
	}
}
class program{
	public static void Main(){
		ListaLeniwa list = new ListaLeniwa();
		Pierwsze lista = new Pierwsze();
		Console.WriteLine("rozmiar listy {0} ",list.size());
		Console.WriteLine(list.element(40));
		Console.WriteLine("rozmiar listy {0} ",list.size());
		Console.WriteLine(list.element(20));
		Console.WriteLine("rozmiar listy {0} ",list.size());
		Console.WriteLine(list.element(20));
		Console.WriteLine("Lista liczb pierwszych");
		for(int i =1 ; i <= 4 ; i++){
		Console.WriteLine("rozmiar listy {0} ",lista.size());
		Console.WriteLine(lista.element(i));
		}
		Console.WriteLine(lista.element(1500));
		Console.WriteLine("rozmiar listy {0} ",lista.size());


	}
}