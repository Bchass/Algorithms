import array as arr
# Algorithm
def Linear(arr, n, x):
    for i in range(0, n):
        if arr[i] == x:
            return i
            return - 1


# Driver
arr = [2, 3, 45, 89, 4, 22, 90, 5]
x = 45
n = len(arr)
result = Linear(arr, n, x)
if result == -1:
    print("Target is not present")
else:
    print("Target is present at index:", result)
