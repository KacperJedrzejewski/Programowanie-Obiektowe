class zespolone():
    def __init__(self, rzeczywista, urojona):
        self.rzeczywista = rzeczywista
        self.urojona = urojona

    def dodawanie1(self, X):
        Z = zespolone(0,0)
        Z.rzeczywista = self.rzeczywista + X.rzeczywista
        Z.urojona = self.urojona + X.urojona
        return Z

    def dodawanie2(self, X):
        X.rzeczywista += self.rzeczywista
        X.urojona += self.urojona
        return X

    def odejmowanie1(self, X):
        Z = zespolone(0,0)
        Z.rzeczywista = self.rzeczywista - X.rzeczywista
        Z.urojona = self.urojona - X.urojona
        return Z

    def odejmowanie2(self, X):
        X.rzeczywista -= self.rzeczywista
        X.urojona -= self.urojona
        return X

    def mnozenie1(self, X):
        Z = zespolone(0,0)
        Z.rzeczywista = self.rzeczywista * X.rzeczywista - self.urojona * X.urojona
        Z.urojona = self.rzeczywista * X.urojona + self.urojona * X.rzeczywista
        return Z

    def mnozenie2(self, X):
        tempX = X.rzeczywista
        X.rzeczywista = self.rzeczywista * X.rzeczywista - self.urojona * X.urojona
        X.urojona = self.rzeczywista * X.urojona + self.urojona * tempX
        return X

    def dzielenie1(self, X):
        Z = zespolone(0,0)
        Z.rzeczywista = float(( float( self.rzeczywista ) * float( X.rzeczywista ) + float( self.urojona ) * float( X.urojona ))) / float(( float( X.rzeczywista ** 2 ) + float( X.urojona ** 2 )))
        Z.urojona = float(( float( self.urojona * float( X.rzeczywista )) - float( self.rzeczywista ) * float( X.urojona )) / float(( float( X.rzeczywista ** 2 ) + float( X.urojona ** 2 ))))
        return Z

    def dzielenie2(self, X):
        tempX = X.rzeczywista
        X.rzeczywista = float(( float( self.rzeczywista ) * float( X.rzeczywista ) + float( self.urojona ) * float( X.urojona ))) / float((float( X.rzeczywista ** 2 ) + float( X.urojona ** 2 )))
        X.urojona = float(( float( self.urojona * float( tempX )) - float( self.rzeczywista ) * float( X.urojona )) / float((float( tempX ** 2 ) + float( X.urojona ** 2 ))))
        return X




A = zespolone(4,8)
B = zespolone(6,3)

z = zespolone.dodawanie1(A, B)
print 'dodawanie'
print 'rzeczywista: ', z.rzeczywista, 'urojona: ', z.urojona

z1 = zespolone.mnozenie1(A, B)
print 'mnozenie'
print 'rzeczywista: ', z1.rzeczywista, 'urojona: ', z1.urojona

z3 = zespolone.odejmowanie1(A, B)
print 'odejmowanie'
print 'rzeczywista: ', z3.rzeczywista, 'urojona: ', z3.urojona

z2 = zespolone.dzielenie1(A, B)
print 'dzielenie1'
print 'rzeczywista: ', z2.rzeczywista, 'urojona: ', z2.urojona

z4 = zespolone.dzielenie2(A, B)
print 'dzielenie2'
print 'rzeczywista: ', z4.rzeczywista, 'urojona: ', z4.urojona

z5 = zespolone.dodawanie1(A, B)
print 'dodawanie'
print 'rzeczywista: ', z5.rzeczywista, 'urojona: ', z5.urojona
