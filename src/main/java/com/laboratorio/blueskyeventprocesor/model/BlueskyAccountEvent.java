package com.laboratorio.blueskyeventprocesor.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Rafael
 * @version 1.0
 * @created 15/08/2024
 * @updated 15/08/2024
 */

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class BlueskyAccountEvent {
    private int seq;
    private String did;
    private String time;
    private boolean active;
    private String status;

    @Override
    public String toString() {
        return "BlueskyAccountEvent{" + "seq=" + seq + ", did=" + did + ", time=" + time + ", active=" + active + ", status=" + status + '}';
    }
}