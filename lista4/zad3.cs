using System;

namespace zad3{
	class graf{
		
		protected graf Znajdz_drzewo(){}
		protected int	Wylicz(){}
		protected graf Zrodlo(){}
		protected bool Czy_ma_cykle(){}
		protected int odleglosc(graf X, graf Y){}

	}

	class macierz:graf{
		int wiekosc;
		string wierzcholek;
		

		macierz(int i){
			wielkosc = i;
			graf mat = new graf[wielkosc];
		}
	}
}