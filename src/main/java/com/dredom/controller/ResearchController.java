package com.dredom.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.Resource;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
     * Selects the page http://localhost:8081/spring/spring/research
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String home(Model model) {
        logger.info("ResearchController home!");
        model.addAttribute("noticeFile", noticeFile);
        return "research";
    }

    public void setNoticeFile(Resource noticeFile) {
        this.noticeFile = noticeFile;
    }

}
