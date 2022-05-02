package com.company;

import java.util.Arrays;

public class RightPyramids {
    private RightPyramid[] rightPyramids;
    private int current_rightPyramids_number;

    public RightPyramids(int rightPyramids_number) {
        this.rightPyramids = new RightPyramid[rightPyramids_number];
        current_rightPyramids_number = -1;
    }

    public void add_RightPyramids(RightPyramid rightPyramid) {
        if (++current_rightPyramids_number < rightPyramids.length)
            rightPyramids[current_rightPyramids_number] = rightPyramid;
    }

    public int get_index_max_volume() {
        double max_volume = rightPyramids[0].get_volume();
        int index_max_volume = 0;
        for (int i = 1; i < rightPyramids.length; i++) {

            if (rightPyramids[i].get_volume() > max_volume) {
                max_volume = rightPyramids[i].get_volume();
                index_max_volume = i;
            }
        }
        return index_max_volume;
    }

    public String get_RightPyramid(int index_rightPyramid) {
        return rightPyramids[index_rightPyramid ].toString();
    }

    @Override
    public String toString() {
        return "RightPyramids{" +
                "rightPyramids=" + Arrays.toString(rightPyramids) +
                '}';
    }
}
