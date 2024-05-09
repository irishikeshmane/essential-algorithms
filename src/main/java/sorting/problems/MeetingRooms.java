package sorting.problems;

import sorting.algorithms.QuickSort;

import java.util.ArrayList;

/*
 * Leetcode : Premium Subscription
 *
 *
 * Strategy:
 */
public class MeetingRooms {

    static Integer can_attend_all_meetings(ArrayList<ArrayList<Integer>> intervals) {
        // Write your code here.
        int size = intervals.size();
        int[] start = new int[size];
        int[] end = new int[size];
        int j = 0;
        for (ArrayList<Integer> list : intervals) {
            start[j] = list.get(0);
            end[j] = list.get(1);
            j++;
        }
        QuickSort.sort(start);
        QuickSort.sort(end);

        for ( int i = 0; i < size-1; i++) {
            if (end[i] > start[i+1]) {
                return 0;
            }
        }
        return 1;
        //HashSet
    }
}
