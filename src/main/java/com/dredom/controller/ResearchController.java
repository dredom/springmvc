package com.dredom.controller;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dredom.service.Detection;
import com.dredom.service.Detector;

/**
 * Research and development - trying stuff.
 *
 * Check out Spring configuration for a file resource.
 *
 * @author andre
 *
 */
@RequestMapping("/research")
public class ResearchController {
    private static final Logger logger = LoggerFactory
            .getLogger(ResearchController.class);

    private Resource noticeFile;
    /**
     * Resource translates ${token} values in Spring config.
     */
    private Resource testFile;

    private Detector detector;

    /**
     * Selects the page http://localhost:8081/spring/research
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(Model model, HttpServletRequest request) {
        logger.info("ResearchController home!");
        model.addAttribute("noticeFile", noticeFile);
        if (testFile.exists()) {
            model.addAttribute("testFile", testFile);
        }

        Detection detection = detector.detect(request);
        model.addAttribute("detection", detection);

        return "research";
    }

    public void setNoticeFile(Resource noticeFile) {
        this.noticeFile = noticeFile;
    }

    public void setTestFile(Resource testFile) {
        this.testFile = testFile;
    }

    public void setDetector(Detector detector) {
        this.detector = detector;
    }

}
