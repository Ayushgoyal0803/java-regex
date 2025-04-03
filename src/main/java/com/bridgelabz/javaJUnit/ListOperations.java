package com.bridgelabz.javaJUnit;

import java.util.*;

public class ListOperations {

    void addElement(List<Integer> list,int ele){
        list.add(ele);
    }

    void removeElement(List<Integer> list,int b){
        list.remove((Integer) b);
    }

    int getSize(List<Integer> list){
        return list.size();
    }

}
