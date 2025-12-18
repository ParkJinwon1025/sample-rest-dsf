package com.ubisam.demo.domain.Action.EQP.설비정지;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;


@Data
public class Event01PLCReadingMCPause {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;
}
