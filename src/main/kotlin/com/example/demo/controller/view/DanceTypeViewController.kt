package com.example.demo.controller.view

import com.example.demo.exception.AlreadyExists
import com.example.demo.exception.BadRequest
import com.example.demo.exception.NotFound
import com.example.demo.service.DanceTypeService
import com.example.demo.service.dto.CreateUpdateDanceTypeDto
import com.example.demo.service.dto.DanceTypeDto
import org.springframework.stereotype.Controller
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.servlet.ModelAndView
import javax.validation.Valid


@Controller
class DanceTypeViewController(
        private val danceTypeService: DanceTypeService
) {

    @GetMapping("/all-dance-types")
    fun displayDanceTypesTable(): ModelAndView {
        var danceTypes: List<DanceTypeDto> = danceTypeService.getAllDanceTypes()
        var modelAndView: ModelAndView = ModelAndView("dance_types_table")
        modelAndView.addObject("danceTypes", danceTypes)
        return modelAndView
    }

@Throws(NotFound::class)
    @GetMapping("/delete-dance-type/{id}")
    fun deleteDanceType(@PathVariable id: Long): String {
        danceTypeService.deleteDanceTypeById(id)
        return "redirect:/all-dance-types"
    }


    @GetMapping("/new-dance-type")
    fun displayCreateDanceTypeForm(): ModelAndView {
        var createUpdateDanceTypeDto = CreateUpdateDanceTypeDto()
        var modelAndView = ModelAndView("create_dance_type_form")
        modelAndView.addObject("createUpdateDanceTypeDto", createUpdateDanceTypeDto);
        return modelAndView;
    }

    @Throws(AlreadyExists::class, BadRequest::class)
    @PostMapping("/new-dance-type")
    fun createDanceType(@ModelAttribute createUpdateDanceTypeDto: CreateUpdateDanceTypeDto): String {
        danceTypeService.createDanceType(createUpdateDanceTypeDto)
        return "redirect:/all-dance-types"
    }


    @Throws(NotFound::class)
    @GetMapping("/update-dance-type/{id}")
     fun displayUpdateDanceTypeForm(@PathVariable id: Long): ModelAndView? {
        var createUpdateDanceTypeDto = CreateUpdateDanceTypeDto()
        var existingDanceType = danceTypeService.getDanceTypeById(id)
        var modelAndView = ModelAndView("update_dance_type_form")
        modelAndView.addObject("createUpdateDanceTypeDto", createUpdateDanceTypeDto)
        modelAndView.addObject("existingDanceType", existingDanceType)
        return modelAndView
    }


    @Throws(BadRequest::class, AlreadyExists::class, NotFound::class)
    @PostMapping("/update-dance-type/{id}")
    fun updateDanceType(@PathVariable id: Long,
                        @Valid @ModelAttribute createUpdateDanceTypeDto: CreateUpdateDanceTypeDto,
                        bindingResult: BindingResult,
                        @ModelAttribute(name = "existingDanceType") existingDanceType: DanceTypeDto): String {
        if (bindingResult.hasErrors()) {
            return "update_dance_type_form"
        }
        danceTypeService.updateDanceTypeById(id, createUpdateDanceTypeDto)
        return "redirect:/all-dance-types"
    }

}
