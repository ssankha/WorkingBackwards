package com.example.workingbackwards;

import java.util.ArrayList;

public class TodoList {

    public ArrayList<Task> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void addTask(Task task) {
        tasks.add(task);
        sort();
    }

    public void removeTask(Task task) {
        tasks.remove(task);
        sort();
    }

    public void sort() {
        // sort by difficulty
        quickSort(0, tasks.size()-1);

        // check if any early deadlines and bring to front of list
        for(int i=0; i < tasks.size()-1; i++) {

            for(int j=i; j < tasks.size()-1; j++) {

                if(tasks.get(j).getDueDate() - tasks.get(j+1).getDueDate() > 2) {
                    swap(j, j+1);
                }
            }
        }


    }

    private void quickSort(int start, int end) {
        if(start < end) {
            int partitionIndex = partition(start, end);

            quickSort(start, partitionIndex-1);
            quickSort(partitionIndex+1, end);
        }
    }

    private int partition(int start, int end) {
        Task pivot = tasks.get(end);

        int i = start-1;

        for(int j=start; j < end; j++) {

            if(tasks.get(j).getImportance() < pivot.getImportance()) {
                i++;
                swap(i, j);
            }
        }

        swap(i+1, end);
        return i+1;
    }

    private void swap(int i, int j) {
        Task temp = tasks.get(i);
        tasks.set(i, tasks.get(j));
        tasks.set(j, temp);
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }
}
