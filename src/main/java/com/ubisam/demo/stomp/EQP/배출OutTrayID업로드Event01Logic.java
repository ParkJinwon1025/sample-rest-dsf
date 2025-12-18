package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Write;

public class 배출OutTrayID업로드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean OutTrayIDOutputUp){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        // if(OutTrayIDOutputUp이 1일때){
        //     PLC 메모리맵의 OutTrayIDOutputBCR 필드에서 값을 Read하여 trayID 변수에 저장
        //     tTrayCurr 테이블에서 비어있는 트레이의 정보 조회하여 rs 변수에 저장
        //     tTrayCurr 테이블에서 비어있지 않은 트레이의 정보 조회 rsE 변수에 저장
        //     if(rs와 rsE가 모두 null 일 경우){
        //         PLC의 메모리의 해당하는 필드에 "TRAY_OUTPUT_TRAY_ID_NOT_FOUND" Write
        //     }
        //     else { rs와 rsE가 모두 null이 아닐 경우
        //         PLC 메모리맵의 OutTrayOutputOK 필드에 1 Write
        //         tMstEquipment에 필터에 해당하는 열의 trayId Update
        //         if(다음 설비 타입이 Aging이고 다음 공정 그룹도 Agint일 경우){
        //             tMstAgingRack 테이블에서 RackID 조회
        //             spSetAgingRack 테이블에서 as_LineID, as_TrayId, as_RackID, as_Status, on_ret_num, os_ret_msg 값 Set(Aging 입고 처리)
        //              spSetAgingRack 테이블에서 as_LineID, as_TrayId, as_RackID, as_Status, on_ret_num, os_ret_msg 값 Set(Aging 입고 완료 처리)
        //         }
        //     }

        //     if(NexxtEqpTypeID가 E이고, NextOperGroupID가 1이고 NetOperID가 1일 때) {
        //         현재 트레이 정보 조회
        //         tMoveToHist 테이블에 TrayID, TrayInputDate, TrayInputTime, LineID, EqpTypeID, OperGroupID, OperID Post
        //     }
        // }
        // else { OutTrayIDOutputUp이 1이 아닐 때 
        //     PLC 메모리맵의 OutTrayOutputOk 필드의 값을 0으로 Write
        //     PLC 메모리맵의 OutTrayOutputNG 필드의 값을 0으로 Write
        // }
    }
    
}
