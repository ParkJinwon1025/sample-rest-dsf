package com.ubisam.demo.domain.Action.EQP.설비알람;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingEQPAlarm {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;

}
