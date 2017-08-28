package com.myc.elevator;

import lombok.Value;

@Value
class Request {
    private int floor;
    private Direction direction;
    private long requestTime;

    Request(int floor, Direction direction) {
        this.floor = floor;
        this.direction = direction;
        this.requestTime = System.currentTimeMillis();
    }
}
