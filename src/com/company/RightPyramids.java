package com.company;

import java.util.Arrays;

public class RightPyramids {
    private  RightPyramid[] rightPyramids;
    private int current_rightPyramids_number;

    public RightPyramids(int rightPyramids_number) {
        this.rightPyramids= new RightPyramid[rightPyramids_number];
        current_rightPyramids_number=-1;
    }
    public void addRightPyramids(RightPyramid rightPyramid){
        if(++current_rightPyramids_number<rightPyramids.length)
            rightPyramids[current_rightPyramids_number]=rightPyramid;
    }
    public int get_index_max_valume(){
        double max_valume=rightPyramids[0].get_volume();
        int index_max_valume=1;
        for (int i = 1; i < rightPyramids.length; i++) {

            if(rightPyramids[i].get_volume()>max_valume){
                max_valume=rightPyramids[i].get_volume();
                index_max_valume=i+1;
            }
        }
        return index_max_valume;
    }
    public String get_RightPyramid(int index_rightPyramid){
       return rightPyramids[index_rightPyramid-1].toString();
    }

    @Override
    public String toString() {
        return "RightPyramids{" +
                "rightPyramids=" + Arrays.toString(rightPyramids) +
                '}';
    }
}
