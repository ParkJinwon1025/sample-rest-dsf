package com.ubisam.demo.stomp.EQP;

import lombok.Locked.Write;

public class 투입NGTrayID업로드Event01Logic {

    // private XXXXRepository XXXXRepository;
    // private StompClient stompClient;

    public void receive(boolean NGTrayIdUpBit){
        // STOMPE에 들어온거 받아서 로직 처리 (=> 받아온거는 형태가 다양함.) 
        // DB에 1줄 인서트
        
        // if(NGTrayIdUpBit == 1){
        //      PLC 메모리의 NGTrayIDBCR 값 읽기
        //      NGTrayIDBCR에 해당하는 트레이를 공트레이 처리함.
        //      tTrayCurr 테이블에서 NGTrayIDBCR을 통해 tray 정보를 조회함.
        //      if(조회한 Tray 정보가 null일 경우){
        //        PLC의 해당하는 필드에 "TRAY_NG_TRAY_ID_NOT_FOUND" 저장
        //      }
        //      else { 조회한 Tray 정보가 있는 경우
        //          if(Tray의 Usage가 없는 경우){
        //              PLC 메모리 맵의 NGTrayNG 필드에 1을 Write 함.
        //              return;
        //          }
        //          else { Tray의 Usage가 있는 경우
        //              PLC 메모리 맵의 NGTrayOK 필드에 1을 Write 함.
        //              tMstEquipment 테이블에 trayID를 업데이트함.
        //          }
        //
        //      }
        // }
        // else { NGTrayIdUpBit가 0일 경우

        //     PLC 메모리 맵의 NGTrayOK 필드에 0을 Write 함.
        //     PLC 메모리 맵의 NGTrayNG 필드에 0을 Write 함.
        // }


    }
    
}
