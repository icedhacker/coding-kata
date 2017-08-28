package com.myc.elevator;

import lombok.Value;

@Value
class ElevatorButton implements Button {
    private int floor;

    public ElevatorRequest createRequest() {
        return null;
    }
}
