package com.ubisam.demo.domain.Action.EQP.자동동작대기;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingMCAutoWait {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;

}
