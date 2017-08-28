package com.myc.elevator;

import lombok.Value;

@Value
class FloorButton implements Button {
    private int floor;
    private Direction direction;

    public ElevatorRequest createRequest() {
        return null;
    }
}
