import array as arr

arr = [3, 78, 90, 22, 33, 41, 2]

for i in range(len(arr)):
        min = i
        for j in range(i  + 1, len(arr)):
            if arr[min] > arr[j]:
                min = j

                arr[i], arr[min] = arr[min], arr[i]

 
# Driver
print ("Sorted:")
for i in range(len(arr)):
    print("%d"%arr[i])