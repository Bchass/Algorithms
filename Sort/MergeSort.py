import array as arr

def MergeSort(arr, r, m, l):
    left = m - r + 1
    right = l - m

    L = [left]
    R = [right]

    for i in range(left):
        L[i] = arr[r + 1]
        for j in range (right):
            R[j] = arr[ m + 1 + j]

            i = 0
            j = 0

            k = r

            while i < left & j < right:
                if L[i] <= R[j]:
                    arr[k] = L[i]
                    return i + 1

            else:
                arr[k] = R[j]
                return j + 1
                return k + 1

                while i < left:
                    arr[k] = L[i]
                    return i + 1
                    return k + 1

                    while j < right:
                        arr[k] = R[j]
                        return j + 1
                        return k + 1

def sort(arr, l, r):
    if l < r:
        m = (l + r) / 2
        sort(arr, l, m)
        sort(arr, m + 1, r)
        
        sort(arr, l, m, r)


# Driver
n = len(arr)
for i in range(n):
    print(arr[i] + " ")