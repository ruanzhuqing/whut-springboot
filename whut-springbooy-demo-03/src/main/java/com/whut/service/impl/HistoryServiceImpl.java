package com.whut.service.impl;

import com.whut.entities.Customer;
import com.whut.entities.History;
import com.whut.entities.Worker;
import com.whut.mappers.HistoryMapper;
import com.whut.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * TODO:送水历史管理业务逻辑层实现类
 *
 * @auther Administrator
 * @createdate 2021/7/24
 */
@Service
public class HistoryServiceImpl implements HistoryService {
    @Autowired
    private HistoryMapper historyMapper;
    /**
     * 查询history表中所有的数据
     *
     * @return
     */
    @Override
    public List<History> listHistory() {
        return historyMapper.listHistory();
    }

    /**
     * 根据开始结束时间搜索送水历史记录
     *
     * @param startTime
     * @param endTime
     * @returnr
     */
    @Override
    public List<History> seachHistory(String startTime, String endTime) {
        return historyMapper.seachHistory(startTime,endTime);
    }

    /**
     * 添加一条送水历史信息到history表中
     *
     * @param history
     * @return
     */
    @Override
    public Integer saveHistory(History history) {
        return historyMapper.saveHistory(history);
    }

    /**
     * 根据送水历史记录id搜素送水历史信息
     *
     * @param hid
     * @returnr
     */
    @Override
    public History getHistoryById(Integer hid) {
        return historyMapper.getHistoryById(hid);
    }

    /**
     * 根据送水历史记录id修改送水历史信息
     *
     * @param history
     * @param cid
     * @param wid
     * @returnr
     */
    @Override
    public Integer updateHistory(History history, Integer cid, Integer wid) {
        Customer customer = new Customer();
        customer.setCid(cid);
        Worker worker = new Worker();
        worker.setWid(wid);
        history.setCustomer(customer);
        history.setWorker(worker);
        return historyMapper.updateHistory(history);
    }



    /**
     * 根据送水历史记录id删除送水历史信息
     *
     * @param hid
     * @returnr
     */
    @Override
    public Integer deleteHistory(Integer hid) {
        return historyMapper.deleteHistory(hid);
    }
}
