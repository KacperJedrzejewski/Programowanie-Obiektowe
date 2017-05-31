class Image
  def image
    @image
  end
   
  def *(img)
    newIm = ImageWB.new(@width,@height)
    (0...@height).each do |y|
      (0...@width).each do |x|
        newIm.image[y][x] = @image[y][x] & img.image[y][x]
      end
    end
    newIm
  end

  def +(img)
    newIm = ImageWB.new(@width,@height)
    (0...@height).each do |y|
      (0...@width).each do |x|
        newIm.image[y][x] = @image[y][x] | img.image[y][x]
      end
    end
    newIm
  end

  def narysuj
    (0...@height).each do |y|
      (0...@width).each do |x|
        printf( "\x1B[%im%s", 90+@image[y][x], "█", "\033[0m" )
      end
      puts
    end
    puts
  end
   
end

 
class ImageWB < Image

  def initialize(width, height)
    @width  = width
    @height = height
    @image = Array.new(height) {Array.new(width) { if (rand(2) == 1) then 7 else 0 end  }}
   
  end

end

class ImageC < Image
  def initialize(width, height)
    @width  = width
    @height = height
    @image = Array.new(height) { Array.new(width) { rand(8) } }
   
  end

end

(90 ... 98).each do |n|
    printf( "%i   \x1B[%im %s %s  \n", n%10, n, "█", "\033[0m" )
 end

  im1 = ImageC.new(40,10)
  im2 = ImageC.new(40,10)
  im3 = im1*im2
  im4 = im1+im2
  im1.narysuj
  im2.narysuj
  im3.narysuj
  im4.narysuj

  im1 = ImageWB.new(40,10)
  im2 = ImageWB.new(40,10)
  im3 = im1*im2
  im4 = im1+im2
  im1.narysuj
  im2.narysuj
  im3.narysuj
  im4.narysuj
  
