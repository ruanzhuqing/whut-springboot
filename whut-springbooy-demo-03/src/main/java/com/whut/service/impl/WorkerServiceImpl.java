package com.whut.service.impl;

import com.whut.entities.Worker;
import com.whut.mappers.WorkerMapper;
import com.whut.service.WorkerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * TODO:送水工管理业务逻辑实现类
 *
 * @auther Administrator
 * @createdate 2021/7/23
 */
@Service
public class WorkerServiceImpl implements WorkerService {
    @Autowired
    private WorkerMapper workerMapper;
    /**
     * 列出Worker表中所有数据
     *
     * @return
     */
    @Override
    public List<Worker> listWorker() {
        return workerMapper.listWorker();
    }

    /**
     * 根据送水工名称搜素送水工信息
     *
     * @param workerName
     * @returnr
     */
    @Override
    public List<Worker> seachWorker(String workerName) {
        return workerMapper.seachWorker(workerName);
    }

    /**
     * 添加一条送水工信息到Worker表中
     *
     * @param worker
     * @return
     */
    @Override
    public Integer saveWorker(Worker worker) {
        return workerMapper.saveWorker(worker);
    }

    /**
     * 根据送水工id搜素送水工信息
     *
     * @param wid
     * @returnr
     */
    @Override
    public Worker getWorkerById(Integer wid) {
        return workerMapper.getWorkerById(wid);
    }

    /**
     * 根据送水工id修改送水工信息
     *
     * @param worker
     * @returnr
     */
    @Override
    public Integer updateWorker(Worker worker) {
        return workerMapper.updateWorker(worker);
    }

    /**
     * 根据送水工id删除送水工信息
     *
     * @param wid
     * @returnr
     */
    @Override
    public Integer deleteWorker(Integer wid) {
        return workerMapper.deleteWorker(wid);
    }
}
