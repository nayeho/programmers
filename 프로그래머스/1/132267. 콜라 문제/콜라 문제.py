def solution(a, b, n):
    answer = 0
    
    full = 0
    empty = 0
    # a = 3, b = 1, n = 20, result = 9
    
    while n >= a:
        full = b * (n // a) # 6
        empty = n % a # 2
        
        answer += full
        
        n = full + empty
    
    return answer