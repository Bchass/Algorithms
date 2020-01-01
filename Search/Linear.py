import array as arr
# Algorithm
def Linear(arr, start, end):
    n = len(arr)

    for x in range(start, end):
        if arr[n] == x:
            return n - 1


# Driver
arr = [2, 3, 45, 89, 4, 22, 90, 5]
x = 22
result = Linear(arr, x)
if result == -1:
    print("Target is not present")
elif result == 1:
    print("Target is present at index " + result)
