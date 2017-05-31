class Fixnum

  def czynniki
    i = 0 
    tab = []
  
    1.upto(self){|n|                           
    if (self % n == 0 )
      tab[i] = n
      i += 1
    end
    }
  
    tab
  end 

  def Ack(m)
    return m + 1 if self == 0
    return (self-1).Ack(1) if m == 0
    (self-1).Ack(self.Ack(m-1))
  end

  
  def doskonala
    a = 0
    1.upto(self/2){ |n|
      if(self % n == 0)
        a += n
      end
    }
    self == a
  end


Cyfry = ["zero", "jeden", "dwa", "trzy", "cztery", "piec", "szesc", "siedem", "osiem", "dziewiec"]
  def slownie
    a = self % 10
    b = self / 10
    return "" + Cyfry[a]+ " " if b == 0  
    "" + b.slownie + Cyfry[a] + " "
  end

  print 6.czynniki
  puts 
  puts 2.Ack(1).to_s
  puts 6.doskonala
  puts 123.slownie
    
end