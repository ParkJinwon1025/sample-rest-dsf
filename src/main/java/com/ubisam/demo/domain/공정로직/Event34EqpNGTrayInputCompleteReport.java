package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 34. NG Tray 투입 완료 보고
@Data
public class Event34EqpNGTrayInputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

}
