class Node
  attr_accessor :value, :next

  def initialize(value)
      @value = value
  end

end


class LinkedList
  attr_accessor :head, :tail

  def initialize (head)
    @head = head
    @tail = head
  end

  def insert(node)
    @tail.next = node
    @tail = @tail.next
  end

  def print
    current_node = @head
      
    while current_node != nil
      puts "\tNode Value = #{current_node.value}"
      current_node = current_node.next
    end
  end

  
  def generate(i)
    i.times do
      n = Node.new(rand(10))
      insert(n)
    end
  end

  def length
    current_node = @head
    i = 0
    while current_node != nil
      i +=1
      current_node = current_node.next
    end
    return i
  end

  def get(i)
    current_node = @head
    i.times do
      current_node = current_node.next
    end
    return current_node
  end

  def swap(i, j)
    get(i).value, get(j).value = get(j).value, get(i).value
  end
  
end

class Sortowanie
  def sort1(col)
    (0...col.length).each do |l|
      tmp = l
      (l...col.length).each do |r|
        if col.get(tmp).value < col.get(r).value
          tmp = r 
        end
      end
      col.swap(l, tmp)
    end
    return col
  end

  def sort2(col)
    (0...col.length).each do |l|
      (1...col.length).each do |r|
        if col.get(r).value < col.get(r-1).value
          col.swap(r, r-1)
        end
      end
    end
    return col
  end
  
end

n = Node.new(0)
l = LinkedList.new(n)
l.generate(6)

l.insert(Node.new(42))
l.print
puts "#{l.length}" 

l.swap(1, 2)
l.print

s = Sortowanie.new
puts
puts "#{s.sort1(l).print}"
puts "#{s.sort2(l).print}"