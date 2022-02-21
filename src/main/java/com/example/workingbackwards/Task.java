package com.example.workingbackwards;

public class Task {

    private String name;
    private int importance;
    private int dueDate;
    private String notes;

    public Task(String name, int importance, int dueDate, String notes) {
        this.name = name;
        this.importance = importance;
        this.dueDate = dueDate;
        this.notes = notes;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getDueDate() {
        return dueDate;
    }

    public void setDueDate(int dueDate) {
        this.dueDate = dueDate;
    }

    public int getImportance() {
        return importance;
    }

    public void setImportance(int importance) {
        this.importance = importance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
