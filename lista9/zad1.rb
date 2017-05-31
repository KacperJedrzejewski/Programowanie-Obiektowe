class Proc

	def value(x)
		 self.call(x)
	end

	def poch(x)
		h = 0.00000000001
		(0.0+value(x+h)-value(x))/h
	end

	def pole(a, b)
		sn = 0.0
		n = 1000
		h = (b-a)/n
	
		for i in 1..n
			yi = value(a + (i-1)*h)
			yi /= 2 if i == 1 or i == n
			sn += h*yi
		end

		 sn
	end
	
	def zerowe(a, b, eps)
		x = (a+b)/2.0
		val = value(x)

		if val >= -eps and val <= eps
			puts x
		else
			left = value(a)
			rigth = value(b)
				
			if (rigth < 0 and val > 0 and left < 0) or (rigth > 0 and val < 0 and left > 0) 
				zerowe(x,b,eps)
				zerowe(a,x,eps)
			elsif (left < 0 and val > 0 and rigth > 0) or (left > 0 and val < 0 and rigth < 0)
 				zerowe(a,x,eps)
			elsif (rigth > 0 and val < 0 and left < 0) or (rigth > 0 and val < 0 and left < 0) 
				zerowe(x,b,eps)
			else
				nil
			end
		end
	end
			
end

puts "f(x) = x^2 - 2x*sin(x)"
f = proc { |x| x*x- 2 * x * Math.sin(x) }
puts "f(1) = ",f.value(1)
puts "miejsce zerowe na [-2,2] : "
f.zerowe(-2, 2.0, 0.000000001)
puts "pochodna w punkcie 3", f.poch(3)
puts "pole pod wykresem na przedziale [-1, 1] : ", f.pole(-1.0, 1.0)

puts 
puts
puts "g(x) = x^2-1"
g = proc { |x| (x*x)-1}
puts "g(1) = ",g.value(1)
puts "miejsce zerowe na [-2,2] : "
g.zerowe(-2, 2.0, 0.000000001)
puts "pochodna w punkcie 3", g.poch(3)
puts "pole pod wykresem na przedziale [1, 2] : ", g.pole(1.0, 2.0)
