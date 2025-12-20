package com.ubisam.demo.domain.공정로직;

import com.ubisam.demo.domain.ObjectCell;

import jakarta.persistence.Id;
import lombok.Data;

// 바코드리더기 CellID Read Confirm
@Data
public class Event05HostCellIDReadConfirm {

    @Id
    private Long timestamp;
    private ObjectCell objectCell;
    private String status; // OK / NG
    
}
