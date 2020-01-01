import array as arr
# Partition
def partition (arr, start, end):
    i = ( start-1 )
    pivot = arr[end]

    for x in range (start, end):
        if arr[x] <= pivot:
            i = i +1
            
            arr[i], arr[x] = arr[x], arr[i]

            arr[i + 1], arr[end] = arr[end], arr[i + 1]
            return (i + 1)

# Algorithm
def QuickSort(arr, start, end):
    if start < end:
        par = partition (arr, start, end)

        QuickSort(arr, start, par-1)
        QuickSort(arr, end, par+1)

#Driver
arr = [6, 7, 9, 1, 4, 5]
n = len(arr)
QuickSort(arr, 0, n-1)
print ("Sorted:")
for i in range(n):
    print( "%d" %arr[i])