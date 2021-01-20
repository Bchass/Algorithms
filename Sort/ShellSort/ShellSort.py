def ShellSort(arr,n):
    gap = n//2

    while gap > 0:
        for i in range(gap,n):
            temp = arr[i]
            j = i
            while j >= gap and arr[j - gap] > temp:
                arr[j] = arr[j-gap]
                j -= gap

            arr[j] = temp
        gap//=2

arr = [6, 1, 5, 15, 11, 9, 17, 16, 20, 14]
n = len(arr)
ShellSort(arr, n)
print(arr)
