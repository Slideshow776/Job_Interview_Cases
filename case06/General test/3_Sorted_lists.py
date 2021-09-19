""" 
Write a function in a language of your choice that merges two sorted lists into a new sorted list.
E.g. [1,4,6],[2,3,5] → [1,2,3,4,5,6].
"""

list0 = [1, 4, 6]
list1 = [2, 3, 5]

def mergeAndSort(listA, listB):
    return sorted(listA + listB)
 
print(mergeAndSort(list0, list1))
