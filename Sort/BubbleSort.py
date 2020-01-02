import array as arr 

arr = [8, 4, 3, 5, 7]

for i in range(len(arr)):
    swapped = False
    for j in range(len(arr)):
        if arr[j] > arr[j + 1]:
            arr[j], arr[j + 1] = arr[j + 1], swapped

            if swapped == False:
                break

            print("Sorted")
            for i in range(len(arr)):
                print("%d"%arr[i])