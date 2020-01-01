# Method partition
def partition (start, end, arr):
    i = (start-1)
    pivot = arr[end]

    for x in range (start, end):
        if arr[x] <= pivot:
            i = i +1
            
            arr[i], arr[x] = arr[x], arr[i]

            arr[i + 1], arr[end] = arr[end], arr[i + 1]
            return (i + 1)
