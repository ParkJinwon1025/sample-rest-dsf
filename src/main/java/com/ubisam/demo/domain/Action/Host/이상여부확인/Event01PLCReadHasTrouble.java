package com.ubisam.demo.domain.Action.Host.이상여부확인;

import com.ubisam.demo.domain.ObjectPLC;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event01PLCReadHasTrouble {
    
    @Id
    private Long timeStamp;
    private ObjectPLC objectPLC;
    private boolean bit;

}
