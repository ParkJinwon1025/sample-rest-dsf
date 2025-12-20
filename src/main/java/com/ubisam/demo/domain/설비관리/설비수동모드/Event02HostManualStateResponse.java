package com.ubisam.demo.domain.설비관리.설비수동모드;

import com.ubisam.demo.domain.ObjectEQP;

import jakarta.persistence.Id;
import lombok.Data;

// Host 알람 Response;
@Data
public class Event02HostManualStateResponse {
    
    @Id
    private Long timestamp;
    private ObjectEQP objectEQP;
    private String response;
}
