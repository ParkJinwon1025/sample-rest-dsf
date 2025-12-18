package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Write;

public class 배출InTrayID업로드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean InTrayIDOutputUp){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        // if(InTrayIDOutputUp == 1){
        //     PLC 메모리 맵의  InTrayIDOutputBCR 필드의 값 가져와서 trayID 변수에 저장
        //     trayId 변수 값의 앞뒤 공백을 제거하고 널 문자 제거하고
        //     tCellCurr 테이블에서 트레이의 전체 셀 정보를 가져와서 저장 
        //     if(전체 셀 정보가 null이 아니면){
        //         PLC 메모리 맵의 InTrayOutputNG  필드에 1 Write
        //         PLC의 메모리의 해당하는 필드에 "TRAY_INPUT_CELL_EXIST_IN_LOAD_TRAY" Write
        //     }
        //     else { 전체 셀 정보가 null 이면 
        //         PLC 메모리 맵의 InTrayOutputOK 필드에 1 Write
        //         tMstEquiptment에 필터에 해당되는 trayID 업데이트 
        //     }
        // }
        // else {

        //     PLC 메모리 맵의 InTrayOutputOK 필드에 0 Write
        //     PLC 메모리 맵의 InTrayOutputNG 필드에 0 Write

        // }
    }
    
}
