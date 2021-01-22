def Binary(arr, t, k, x):
    if k >= 1:
        middle = 1 + (k - 1) // 2

        if arr[middle] == x:
            return middle

        if arr[middle] > x:
            return Binary(arr, 1, middle - 1, x)
        
            return Binary(arr, middle + 1, k, x)
    
        return - 1


# Driver
arr = [2, 9, 80, 77, 36, 1, 5, 4]
x = 9
result = Binary(arr, 0, len(arr) - 1, x)
if result == -1:
    print("Target is not present")
else:
    print("Target is present at index:", result)