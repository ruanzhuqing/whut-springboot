package com.whut.service;


import com.whut.entities.Worker;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * TODO:送水工管理业务逻辑层
 *
 * @auther Administrator
 * @createdate 2021/7/23
 */
public interface WorkerService {
    /**
     * 列出Worker表中所有数据
     * @return
     */
    List<Worker> listWorker();

    /**
     * 根据送水工名称搜素送水工信息
     * @returnr
     */
    List<Worker> seachWorker(@Param("workerName") String workerName);

    /**
     * 添加一条送水工信息到Worker表中
     * @param worker
     * @return
     */
    Integer saveWorker(Worker worker);

    /**
     * 根据送水工id搜素送水工信息
     * @returnr
     */
    Worker getWorkerById(@Param("wid") Integer wid);
    /**
     * 根据送水工id修改送水工信息
     * @returnr
     */
    Integer updateWorker(Worker worker);

    /**
     * 根据送水工id删除送水工信息
     * @returnr
     */
    Integer deleteWorker(Integer wid);
}
