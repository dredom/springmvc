package com.dredom.service;

import javax.servlet.http.HttpServletRequest;

public interface Detector {

    Detection detect(HttpServletRequest request);
}
