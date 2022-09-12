package com.macofba.controller;

import com.macofba.model.Motor;
import com.macofba.service.IMotorService;
import com.macofba.service.MotorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/motor")
public class motorController {
    private final IMotorService motorService = new MotorService();
    @GetMapping("")
    public String index(Model model) {
        List<Motor> motorList = motorService.findAll();
        model.addAttribute("motors", motorList);
        return "/index";
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("motor", new Motor());
        return "/create";
    }
    @PostMapping("/save")
    public String save(Motor motor) {
        motor.setId((int) (Math.random() * 10000));
        motorService.save(motor);
        return "redirect:/motor";
    }
    @GetMapping("/{id}/edit")
    public String edit(@PathVariable int id, Model model) {
        model.addAttribute("motor", motorService.findById(id));
        return "/edit";
    }
    @PostMapping("/update")
    public String update(Motor motor) {
        motorService.update(motor.getId(), motor);
        return "redirect:/motor";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id, Model model) {
        model.addAttribute("motor", motorService.findById(id));
        return "/delete";
    }
    @PostMapping("/delete")
    public String delete(Motor motor, RedirectAttributes redirect) {
        motorService.remove(motor.getId());
        redirect.addFlashAttribute("success", "Removed motor successfully!");
        return "redirect:/motor";
    }
    @GetMapping("/{name}/view")
    public String view(@PathVariable String name, Model model) {
        model.addAttribute("motor", motorService.findByName(name));
        return "/view";
    }
}
