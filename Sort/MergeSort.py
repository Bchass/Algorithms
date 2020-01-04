import array as arr

def MergeSort(arr):
    if len(arr) > 1:
        mid = len(arr) // 2

        Left = arr[:mid]
        Right = arr[mid:]

        MergeSort(Left)
        MergeSort(Right)


        i = j = k = 0

        while i < len(Left) and j < len(Right):
            if Left[i] < Right[j]:
                arr[k] = Left[i]
                i+= 1

        else:
            arr[k] = Right[j]
            j+=1
            k+=1

        while i < len(Left):
            arr[k] = Left[i]
            i+=1
            k+=1

        while j < len(Right):
            arr[k] = Right[j]
            j+=1
            k+=1

def printlist(arr):
    for i in range(len(arr)):
        print(arr[i])
    print()



#Driver
arr = [6, 5, 13, 22, 8, 1, 3]
printlist(arr)
MergeSort(arr)
print("Sorted:")
print(arr)
