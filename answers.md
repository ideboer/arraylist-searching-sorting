1) Binary search has to go through fewer items when the item does not exist in the group. Search has to go through all the elements. A search only goes through fewer items in the very rare case where the item is one of the ones at the beginning of the list for a search, and takes several splits to reach in a binary search.

2) For an algorithm to be considered efficient, it must take a relatively small amount of time to run (when compared to another less-efficient alternative). Binary search is more efficient, because each time it rules out half of the remaining elements. 

3) The search algorithm would go through each item and check if the string matches "blueberry". If it does, it returns the index of that item and the algorithm ends. However, none of them do. So, it goes through all of the items. When it gets to the end and none of them have matched, it returns -1.
The binary search algorithm would could how many items there are. There are 11, so it begins with the middle element which is "lime". "lime" does not match "blueberry", so it must continue. It checks and sees "blueberry" should be before "lime" because the items are in alphabetical order. It splits the first half of the list ("apple" to "lime") in half again. There are two middle elements, which it can choose either of. For this description, I am going to assume it chooses "cherry", although it could have chosen "banana" and the process would be similar. "cherry" does not match "blueberry" so it must continue. It checks and sees "blueberry" should be before "cherry". It splits the first half of the first half of the list ("apple" to "cherry") in half. Both of the middle elements are "banana". "banana" does not match "blueberry", so it must continue. "blueberry" would be after "banana". If it chooses the second "banana", the list at this point is only "banana" and "cherry". These have already been checked. The list can no longer be divided in half, and blueberry has not been found. So,it returns -1.
search accessed all 11 members. binarySearch accessed 3 members.
If the list was 1000 items long, search would have accessed all 1000 items. binarySearch would have accessed significantly less than 1000.

1) The SelectionSort required one switch less than the number of cards. InsertionSort and BubbleSort required many more switches than SelectionSort. However, InsertionSort and BubbleSort do less comparisons than SelectionSort. The BubbleSort put items in order starting at the end of the list with the biggest item. SeLectionSort does it in the opposite direction. It puts items in order starting at the front of the list with the smallest item. 

2) 
    i) SS: 45; IS: 9; BS: 9
    ii) SS: 45; IS: 45; BS: 45
    iii) SS: the sum of the first n - 1 integers (so for 10 it would be 1+2+3+4+5+6+7+8+9 = 45); IS: 1/4(n^2 - n); BS: (n^2-n)/2

3) It would be reasonable to sort the list first and use binarySearch. binarySearch is exponentially faster than a regular search, so it makes sense to sort the list in order to use it.