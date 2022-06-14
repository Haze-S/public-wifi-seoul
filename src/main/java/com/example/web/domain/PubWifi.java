package com.example.web.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PubWifi {
    private String mgrNo;
    private String region;
    private String mainNm;
    private String address;
    private String addressDetail;
    private String installFloor;
    private String installTy;
    private String installMby;
    private String serviceSe;
    private String networkTy;
    private int installYear;
    private boolean isOutdoor;
    private String connectEnv;
    private double longitude;
    private double latitude;
    private String workDate;
}