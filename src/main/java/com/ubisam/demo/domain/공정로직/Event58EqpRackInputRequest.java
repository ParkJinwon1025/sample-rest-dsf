package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectRack;

import jakarta.persistence.Id;
import lombok.Data;

// Rack 출고 요청 with TrayID/RackId
@Data
public class Event58EqpRackInputRequest {
    
    @Id
    private Long timestamp;
    private ObjectRack objectRack;
    
}
