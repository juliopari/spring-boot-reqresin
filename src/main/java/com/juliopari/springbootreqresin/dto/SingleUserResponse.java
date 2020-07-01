package com.juliopari.springbootreqresin.dto;

public class SingleUserResponse {

    private SingleUserDataResponse data;
    private SingleUserAdResponse ad;

    public SingleUserResponse() {
    }

    public SingleUserDataResponse getData() {
        return data;
    }

    public void setData(SingleUserDataResponse data) {
        this.data = data;
    }

    public SingleUserAdResponse getAd() {
        return ad;
    }

    public void setAd(SingleUserAdResponse ad) {
        this.ad = ad;
    }

   
}
