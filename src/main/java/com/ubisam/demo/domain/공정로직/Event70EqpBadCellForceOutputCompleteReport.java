package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 셀 강제배출 완료 보고 with CellId
@Data
public class Event70EqpBadCellForceOutputCompleteReport {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    
}
