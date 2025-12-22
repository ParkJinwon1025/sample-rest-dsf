package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 52. 배출 Tray 배출 요청 With TrayID
@Data
public class Event52EqpOutletTrayOutputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;

}
