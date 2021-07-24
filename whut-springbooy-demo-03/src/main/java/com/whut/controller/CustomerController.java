package com.whut.controller;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.whut.entities.Customer;
import com.whut.service.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * TODO:客户管理控制器
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@Controller
@RequestMapping("/cust")
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping("/listCust")
    public String listCustomer(Model model){
        List<Customer> list = customerService.listCustomer();
        if(log.isInfoEnabled()){
            log.info(list.toString());
        }
        model.addAttribute("customerList",list);
        return "custList";
    }

    @RequestMapping("/searchCust")
    public String seachCustomer(String custName,Model model){
        List<Customer> list = customerService.seachCustomer(custName);
        model.addAttribute("customerList",list);
        model.addAttribute("searchValue",custName);
        return "custList";
    }

    @RequestMapping("/presaveCust")
    public String presaveCustomer(){
        return "custSave";
    }

    @RequestMapping(value = "/saveCust",method = RequestMethod.POST)
    public String saveCustomer(Customer customer,Model model){
        if(log.isInfoEnabled()){
            log.info(customer.toString());
        }
        customerService.saveCustomer(customer);
        return "redirect:/cust/listCust";
//        List<Customer> list = customerService.listCustomer();
//        model.addAttribute("customerList",list);
//        return "custList";
    }

    /**
     * 水票的种类集合：10、20、30、50、100、200、500                                -->
     */
    private static final Set<Integer> TICKET_SET = new LinkedHashSet<>();

    static {
        TICKET_SET.add(10);
        TICKET_SET.add(20);
        TICKET_SET.add(30);
        TICKET_SET.add(50);
        TICKET_SET.add(100);
        TICKET_SET.add(200);
        TICKET_SET.add(500);
    }

    @RequestMapping("/preupdateCust/{cid}")
    public String preupdateCustomer(@PathVariable("cid")Integer cid, Model model){
        model.addAttribute("ticketSet",TICKET_SET);
        Customer customer = customerService.getCustomerById(cid);
        model.addAttribute("cust",customer);
        return "custUpdate";
    }

    @RequestMapping(value = "/updateCust")
    public String updateCustomer(Customer customer){
        customerService.updateCustomer(customer);
        return "redirect:/cust/listCust";
    }

    @RequestMapping(value = "/deleteCust/{cid}")
    public String deleteCustomer(@PathVariable("cid")Integer cid){
        customerService.deleteCustomer(cid);
        return "redirect:/cust/listCust";
    }


}
