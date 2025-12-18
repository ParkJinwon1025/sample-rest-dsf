package com.ubisam.demo.domain.Action.EQP.강제배출;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingForceOut {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;

}
