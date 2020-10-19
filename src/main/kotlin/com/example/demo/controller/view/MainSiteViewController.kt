package com.example.demo.controller.view

import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequiredArgsConstructor
class MainSiteViewController {

    @GetMapping("")
    fun displayMainSite(): ModelAndView {
        var modelAndView: ModelAndView = ModelAndView("main_site")
        return modelAndView
    }


}