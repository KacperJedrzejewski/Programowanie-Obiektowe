using System;

class Program{
	
	public static void Main(){
		char [] tablica = new char[5];
		tablica[0]= Convert.ToChar(70);
		tablica[1]= Convert.ToChar(71);
		tablica[2]= Convert.ToChar(72);
		tablica[3]= Convert.ToChar(73);
		tablica[4]= Convert.ToChar(76);
		string s = new string(tablica);
	 	Console.WriteLine(s);
	}
	
}