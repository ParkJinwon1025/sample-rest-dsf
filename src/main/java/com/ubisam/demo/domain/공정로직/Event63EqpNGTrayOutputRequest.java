package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectTray;

import jakarta.persistence.Id;
import lombok.Data;

// 63. NG Tray 배출 요청 with TrayID
@Data
public class Event63EqpNGTrayOutputRequest {

    @Id
    private Long timestamp;
    private ObjectTray objectTray;
  
}
