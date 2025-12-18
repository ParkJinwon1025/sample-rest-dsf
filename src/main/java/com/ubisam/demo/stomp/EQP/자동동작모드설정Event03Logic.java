package com.ubisam.demo.stomp.EQP;

public class 자동동작모드설정Event03Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(String cellId){
    // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
     // DB에 1줄 인서트
        if(cellId != null){
            // 셀 정보 검사
            // 공정 순서 확인 
            // 셀 등급 검사
            // 셀No 검사

            // if(BIZ_SET_PROC_START_END_CELL(cellId, "S")) => 셀이 Start 셀이면

                // PLC의 Host 메모리의 InCellOK 필드에 InCellOK 1 Set
                // PLC의 Host 메모리의 필드에 값 Set
                //   (1) TroubleCode : troubleCode;
                //   (2) HostMesage : troubleCode + CellId);

            //    return };



            // if(Cell이 새로운 셀이면){

            //      PLC의 Host 메모리의 InCellOK 필드에 InCellOK 1 Set
            // }

            // else (Cell이 새로운 셀이 아니면){

            //      PLC의 Host 메모리의 InCellNG 필드에 InCellNG 1 Set

            //}
        }
        else {
            // PLC의 Host 메모리의 InCellOk 필드에 0 Set
            // PLC의 Host 메모리의 InCellNG 필드에 0 Set
        }
    }
    
}
