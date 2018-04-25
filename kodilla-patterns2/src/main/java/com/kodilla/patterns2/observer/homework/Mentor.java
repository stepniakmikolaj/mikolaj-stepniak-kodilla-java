package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update(HomeworkQueue homeworkQueue) {
        System.out.println(mentorName + " homeworkQueue from " + homeworkQueue.getStudentName() + " (homeworkQueue: " + homeworkQueue.getHomeworks().peekFirst() + ")");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
