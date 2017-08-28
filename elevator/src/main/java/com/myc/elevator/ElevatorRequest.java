package com.myc.elevator;

import java.util.PriorityQueue;
import java.util.Queue;

class ElevatorRequest {
    private Queue<Request> taskQueue = new PriorityQueue<>();

    void addRequest(int floor, Direction direction) {
        taskQueue.add(new Request(floor, direction));
    }

    Request getNextRequest() {
        if (taskQueue != null && !taskQueue.isEmpty()) {
            return taskQueue.poll();
        }
        return null;
    }
}
