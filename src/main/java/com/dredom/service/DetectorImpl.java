package com.dredom.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpHeaders;

import com.handinteractive.mobile.UAgentInfo;

/**
 * Detect form factor of device making request using MobileESP.
 * @author andre
 *
 */
public class DetectorImpl implements Detector {

    @Override
    public Detection detect(HttpServletRequest request) {
        Detection detection = new Detection();

        String userAgent = request.getHeader(HttpHeaders.USER_AGENT);
        String accept = request.getHeader(HttpHeaders.ACCEPT);

        UAgentInfo service = new UAgentInfo(userAgent, accept);
        detection.setMobile(service.detectSmartphone());
        detection.setTablet(service.getIsTierTablet());
        detection.setAndroid(service.detectAndroidPhone());
        detection.setIphone(service.detectIphone());

        return detection;
    }

}
