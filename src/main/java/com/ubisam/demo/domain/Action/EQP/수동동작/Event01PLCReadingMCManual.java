package com.ubisam.demo.domain.Action.EQP.수동동작;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadingMCManual {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;

}
