package com.ubisam.demo.domain.Action.EQP.자동동작모드설정;

import java.util.UUID;

import com.ubisam.demo.domain.ObjectBCR;
import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
// 셀이 들어 있는 트레이 ID 바코드 인식
public class Event02BCRTrayIDReading {

    @Id
    private Long timestamp;
    private ObjectTray tray;
    private ObjectBCR bcr;
    private String TrayID;
    
}
