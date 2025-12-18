package com.ubisam.demo.stomp.EQP;


public class 등급처리위치이동Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean GradeReqBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        //  if(GradeReqBit == 1){
        //     PLC 메모리 맵의 CellIDBCROUT 필드값 Read하여 CellID 변수에 저장
        //     CellID의 앞뒤 공백과 널 문자 제거
        //     if(CellID가 null이 아닐 경우){
        //         if(CellID가 null일 경우){  코드가 원래 이랬음.
        //             PLC의 메모리의 해당하는 필드에 "EOL_UNLOAD_CELL_ID_NOT_FOUND" Write
        //             return;
        //         }
        //         tMstRouteOper 테이블에서 RowNumber 기준으로 내림차순 정렬한 후, OperGroupID가 3이고 EqpTypeID가 1인 데이터 중 최상위 1건만 조회하여 rs 변수에 저장
        //         prevProc를 131로 설정
        //         if(조회된 top1 정보가 없을 경우){
        //             prevProc=rs.EqpTypeID+rs.OperGroupId+rs.OperId
        //         }

        //         read 실측 데이터 Get
        //         셀 판단 및 PLC 메모리에 cellGrade Write
        //         APD 측정 데이터(cApd)를 전달해서 해당 SP를 호출함.

        //     }


        // }
        // else { GrDeReqBit=0
        //     로그 찍기 
        // }
        

        
    }
    
}
