def repeatedString(s, n)
  sum = s.count('a')
  multiples = n/s.length
  total = sum * multiples
  remainder = n % s.length
  total += s[0..remainder-1].count('a') if remainder > 0
  return total
end