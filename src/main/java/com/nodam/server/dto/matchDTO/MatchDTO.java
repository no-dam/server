package com.nodam.server.dto.matchDTO;

public class MatchDTO {
    private String gender;
    private String purpose;
    private String targetGender;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public String getTargetGender() {
        return targetGender;
    }

    public void setTargetGender(String targetGender) {
        this.targetGender = targetGender;
    }

    @Override
    public String toString() {
        return "getPoolDTO{" +
                "purpose='" + purpose + '\'' +
                ", targetGender='" + targetGender + '\'' +
                '}';
    }
}