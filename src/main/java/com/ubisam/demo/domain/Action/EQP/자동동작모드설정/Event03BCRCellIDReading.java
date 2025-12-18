package com.ubisam.demo.domain.Action.EQP.자동동작모드설정;

import com.ubisam.demo.domain.ObjectBCR;
import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

@Data
public class Event03BCRCellIDReading {

    @Id
    private Long timestamp;
    private ObjectBCR bcr;
    private ObjectCell cell;
    private String cellId;

    // /stomp/Event02Login.java에서 처리

}
