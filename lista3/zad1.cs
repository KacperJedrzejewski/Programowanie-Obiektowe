using System;

namespace zad1{
	public class Lista<T>{
		Element  pierwszy;
		Element ostatni;
		int iloscElementow = 0 ;
		class Element {
			T wartosc;
			Element next;
			Element prev;
			public Element(T w)
                {
                    wartosc = w;
                    next = null;
                    prev = null;
                } 
        	public T ZwrocWartosc() { return wartosc; }
        	public Element ZwrocNastepny() { return next; }
        	public Element ZwrocPoprzedni() { return prev; }
        	public void UstawNastepny(Element w) { next = w; }
        	public void UstawPoprzedni(Element w) { prev = w; }       
		}
		public bool empty(T Lista){
			return iloscElementow == 0;
		}
		public void add_begin(T elem){
			if (iloscElementow == 0) {
				pierwszy = new Element(elem);
				ostatni = pierwszy;
			}
			else{
				Element nowy =  new Element(elem);
				pierwszy.UstawPoprzedni(nowy);
				nowy.UstawNastepny(pierwszy);      
				pierwszy = nowy;
			}
		iloscElementow++;
		}
	
		public void add_end(T elem){
			if (iloscElementow == 0) {
				pierwszy = new Element(elem);
				ostatni = pierwszy;
			}
			else{
				Element nowy =  new Element(elem);
				ostatni.UstawNastepny(nowy);
				nowy.UstawPoprzedni(ostatni);      
				ostatni = nowy;
			}
		iloscElementow++;
		}
		
		public T del_begin(){
			if (iloscElementow == 0) {
				throw new System.InvalidOperationException("Delete elem from empty list.");
				//Environment.Exit(0);
			}
			T tmp = pierwszy.ZwrocWartosc();
			if (iloscElementow > 1 ){
				pierwszy = pierwszy.ZwrocNastepny();
				pierwszy.UstawPoprzedni(null);
			}
			else{
				pierwszy = null;
				ostatni = null;
			}
			iloscElementow--;
			return tmp;
		}
		
		public T del_end(){
			if (iloscElementow == 0) {
				throw new System.InvalidOperationException("Delete elem from empty list.");
				//Environment.Exit(0);
			}	
			T tmp = ostatni.ZwrocWartosc();
			if(iloscElementow >1){
				ostatni = ostatni.ZwrocPoprzedni();
				ostatni.UstawNastepny(null);
			}
			else{
				pierwszy = null;
				ostatni = null;
			}
			iloscElementow--;
			return tmp;
		}
	}
}