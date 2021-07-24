package com.whut.controller;

import com.whut.entities.Customer;
import com.whut.entities.Worker;
import com.whut.service.WorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO:送水工管理控制器
 *
 * @auther Administrator
 * @createdate 2021/7/23
 */
@Controller
@RequestMapping("/worker")
@Slf4j
public class WorkerController {
    @Autowired
    private WorkerService workerService;

    @RequestMapping("/listWorker")
    public String listWorker(Model model){
        List<Worker> list = workerService.listWorker();
        if(log.isInfoEnabled()){
            log.info(list.toString());
        }
        model.addAttribute("workerList",list);
        return "workerList";
    }

    @RequestMapping("/searchWorker")
    public String seachWorker(String workerName,Model model){
        List<Worker> list = workerService.seachWorker(workerName);
        model.addAttribute("workerList",list);
        model.addAttribute("searchValue",workerName);
        return "workerList";
    }

    @RequestMapping("/presaveWorker")
    public String presaveWorker(){
        return "workerSave";
    }

    @RequestMapping(value = "/saveWorker",method = RequestMethod.POST)
    public String saveWorker(Worker worker,Model model){
        if(log.isInfoEnabled()){
            log.info(worker.toString());
        }
        workerService.saveWorker(worker);
        return "redirect:/worker/listWorker";
    }


    @RequestMapping("/preupdateWorker/{wid}")
    public String preupdateWorker(@PathVariable("wid")Integer wid, Model model){
        Worker worker = workerService.getWorkerById(wid);
        model.addAttribute("worker",worker);
        return "workerUpdate";
    }

    @RequestMapping(value = "/updateWorker")
    public String updateWorker(Worker worker){
        workerService.updateWorker(worker);
        return "redirect:/worker/listWorker";
    }

    @RequestMapping(value = "/deleteWorker/{wid}")
    public String deleteWorker(@PathVariable("wid")Integer wid){
        workerService.deleteWorker(wid);
        return "redirect:/worker/listWorker";
    }

}
