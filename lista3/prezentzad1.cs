using zad1;
using System;

class program{
	static public void Main(){
		Lista<int> list = new Lista<int>();
		list.add_begin(5);
		list.add_begin(9);
		list.add_end(1);

		Console.WriteLine(list.del_begin());
		Console.WriteLine(list.del_end());
		Console.WriteLine(list.del_begin());
		//1Console.WriteLine(list.del_begin());
	}
}