package com.dredom.service;

public class Detection {
    private boolean tablet;
    private boolean mobile;
    private boolean iphone;
    private boolean android;

    public boolean isTablet() {
        return tablet;
    }
    public void setTablet(boolean tablet) {
        this.tablet = tablet;
    }
    public boolean isMobile() {
        return mobile;
    }
    public void setMobile(boolean mobile) {
        this.mobile = mobile;
    }
    public boolean isIphone() {
        return iphone;
    }
    public void setIphone(boolean iphone) {
        this.iphone = iphone;
    }
    public boolean isAndroid() {
        return android;
    }
    public void setAndroid(boolean android) {
        this.android = android;
    }

}
