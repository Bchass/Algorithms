def QuickSort(list):
    length = len(list)
    if length <= 1:
        return list
    else:
        pivot = list.pop()
        high = []
        low = []

        for item in list:
            if item > pivot:
                high.append(item)
            else:
                low.append(item)
        return QuickSort(low) + [pivot] + QuickSort(high)
print(QuickSort([6,2,10,4,3,1]))