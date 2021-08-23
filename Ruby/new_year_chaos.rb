def minimumBribes(q)
  # Write your code here
  q_length = q.length
  bribes = 0
  trigger = false
  loop do
      swapped = false
      (q_length-1).times do |i|
          trigger = true if q[i] - i - 1 > 2
          if q[i] > q[i+1]
              q[i], q[i+1] = q[i+1], q[i]
              swapped = true
              bribes += 1
          end
      end
      
      break if not swapped
  end
          

  puts trigger ? "Too chaotic" : bribes
end