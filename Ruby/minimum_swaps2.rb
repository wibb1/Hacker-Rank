def minimumSwaps(arr)
    
  swaps = 0
  for i in 0..(arr.length-1)
      while i+1 != arr[i]
          puts arr[i]
          swap_index = arr[i] - 1
          swap_value = arr[i]
          swapped_value = arr[swap_index]
          arr[i] = swapped_value
          arr[swap_index] = swap_value
          swaps+=1
      end
  end

  swaps
end
