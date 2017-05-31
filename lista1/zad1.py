class kolekcja():
    def __init__(self, L):
        self.torba = L

def wstaw(ele ,k):
    k.torba.append(ele)

def dlugosc(k):
    return len(k)

def szukaj(x, k):
    tmp = 0
    for i in k.torba:
        if i == x:
            tmp += 1
    return tmp

k = kolekcja([1,1,2,2,3,3,4,4,5,5,6,6,7,7,8,8,9,9,0,0])
prezentacja = 1
while prezentacja == 1:
    tmp = 1
    while tmp == 1:
        tmp = input('Czy chcesz wprowadzic element do kolekcji? 1-tak ')
        if tmp == 1:
            ele = input('Podaj liczbe ')
            wstaw(ele, k)

    print 'Dlugosc torby', dlugosc(k.torba)
    x = input('Podaj liczbe do znalezienia ')
    print 'liczba ',x,' wystepuje  w torbie ',szukaj(x,k),' razy'
    prezentacja = input( 'Czy kontynuowac? 1-tak ')
