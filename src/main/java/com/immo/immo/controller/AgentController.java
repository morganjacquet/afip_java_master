package com.immo.immo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.immo.immo.model.Agent;
import com.immo.immo.service.AgentService;

@Controller
@RequestMapping("/agent")
public class AgentController {
     @Autowired
    private AgentService agentService;

    @GetMapping("/list")
    public String list(Model model) {
        model.addAttribute("agents", agentService.getAll());
        return "agent/list";
    }

    @GetMapping("/add")
    public String displayAddForm(Agent agent) {
        return "agent/add";
    }

    @PostMapping("/add")
    public String processAdd(Agent agent) {
        agentService.add(agent);
        return "redirect:/agent/list";
    }

    @GetMapping("/update/{id}")
    public String displayUpdateForm(@PathVariable("id") Long id, Model model) {
        Agent agent = agentService.findById(id);
        model.addAttribute("agent", agent);
        return "agent/update";
    }

    @PostMapping("/update")
    public String processUpdate(Agent agent) {
        agentService.update(agent);
        return "redirect:/agent/list";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Long id) {
        agentService.delete(id);
        return "redirect:/agent/list";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/agent/list";
    }
}
