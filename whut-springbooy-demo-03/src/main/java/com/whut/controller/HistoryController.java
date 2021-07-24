package com.whut.controller;

import com.whut.entities.Customer;
import com.whut.entities.History;
import com.whut.entities.Worker;
import com.whut.service.CustomerService;
import com.whut.service.HistoryService;
import com.whut.service.WorkerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * TODO:送水历史管理控制器
 *
 * @auther Administrator
 * @createdate 2021/7/24
 */
@Controller
@RequestMapping("/history")
@Slf4j
public class HistoryController {
    @Autowired
    private HistoryService historyService;
    @Autowired
    private WorkerService workerService;
    @Autowired
    private CustomerService customerService;

    /**
     * 查询送水历史记录中所有的数据
     *
     * @return
     */
    @RequestMapping("/listHistory")
    public String listHistory(Model model) {
        List<History> histories = historyService.listHistory();
        model.addAttribute("historyList",histories);
        return "historyList";
    }

    /**
     * 根据开始结束时间搜索送水历史记录
     *
     * @param startDate
     * @param endDate
     * @returnr
     */
    @RequestMapping("/search")
    public String searchHistory(String startDate, String endDate,Model model) {
        if(log.isInfoEnabled()){
            log.info(startDate,endDate);
        }
        List<History> histories = historyService.seachHistory(startDate, endDate);
        model.addAttribute("historyList",histories);
        return "historyList";
    }

    /**
     * 跳转到添加界面
     *
     * @returnr
     */
    @RequestMapping("/presaveHistory")
    public String presaveHistory(Model model) {
        List<Worker> workerSet = workerService.listWorker();
        List<Customer> customers = customerService.listCustomer();
        model.addAttribute("custSet",customers);
        model.addAttribute("workerSet",workerSet);
        return "historySave";
    }

    @RequestMapping(value = "/saveHistory",method = RequestMethod.POST)
    public String saveHistory(Integer wid,Integer cid,History history){
        Customer customer = customerService.getCustomerById(cid);
        Worker worker = workerService.getWorkerById(wid);
        history.setCustomer(customer);
        history.setWorker(worker);
        if(log.isInfoEnabled()){
            log.info(history.toString());
        }
        historyService.saveHistory(history);
        return "redirect:/history/listHistory";
    }

    @RequestMapping("/preupdateHistory/{hid}")
    public String preupdateHistory(@PathVariable("hid")Integer hid, Model model) {
        History history = historyService.getHistoryById(hid);
        List<Worker> workerSet = workerService.listWorker();
        List<Customer> customers = customerService.listCustomer();
        model.addAttribute("custSet",customers);
        model.addAttribute("workerSet",workerSet);
        model.addAttribute("history",history);
        return "historyUpdate";
    }

    @RequestMapping(value = "/updateHistory",method = RequestMethod.POST)
    public String updateHistory(Integer wid,Integer cid,History history){
        if(log.isInfoEnabled()){
            log.info(history.toString());
        }
        historyService.updateHistory(history,cid,wid);
        return "redirect:/history/listHistory";
    }

    @RequestMapping("/deleteHistory/{hid}")
    public String deleteHistory(@PathVariable("hid")Integer hid){
        historyService.deleteHistory(hid);
        return "redirect:/history/listHistory";
    }

}
