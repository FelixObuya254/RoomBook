package com.FlexCodes.RoomBook2.Area;

import org.springframework.stereotype.Component;

@Component
public class Area {
    private  String Area1;
    private  String Area2;
    private String Area3;

    public String getArea1() {
        return Area1;
    }

    public void setArea1(String area1) {
        Area1 = area1;
    }

    public String getArea2() {
        return Area2;
    }

    public void setArea2(String area2) {
        Area2 = area2;
    }

    public String getArea3() {
        return Area3;
    }

    public void setArea3(String area3) {
        Area3 = area3;
    }

    public Area(String area1, String area2, String area3) {
        Area1 = area1;
        Area2 = area2;
        Area3 = area3;
    }

    @Override
    public String toString() {
        return "Area{" +
                "Area1='" + Area1 + '\'' +
                ", Area2='" + Area2 + '\'' +
                ", Area3='" + Area3 + '\'' +
                '}';
    }

    public Area() {
    }

}
