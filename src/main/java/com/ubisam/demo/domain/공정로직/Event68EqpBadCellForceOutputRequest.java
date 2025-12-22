package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 68. 강제배출 셀 처리 요청 with CellID
@Data
public class Event68EqpBadCellForceOutputRequest {
    
    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
