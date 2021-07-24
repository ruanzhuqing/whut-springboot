package com.whut.service;

import com.whut.entities.History;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

/**
 * TODO:送水历史管理业务逻辑层
 *
 * @auther Administrator
 * @createdate 2021/7/24
 */
public interface HistoryService {
    /**
     * 查询history表中所有的数据
     * @return
     */
    List<History> listHistory();

    /**
     * 根据开始结束时间搜索送水历史记录
     * @returnr
     */
    List<History> seachHistory(@Param("startTime") String startTime, @Param("endTime")String endTime);

    /**
     * 添加一条送水历史信息到history表中
     * @param history
     * @return
     */
    Integer saveHistory(History history);

    /**
     * 根据送水历史记录id搜素送水历史信息
     * @returnr
     */
    History getHistoryById(@Param("hid") Integer hid);
    /**
     * 根据送水历史记录id修改送水历史信息
     * @returnr
     */
    Integer updateHistory(History history,Integer cid,Integer wid);

    /**
     * 根据送水历史记录id删除送水历史信息
     * @returnr
     */
    Integer deleteHistory(@Param("hid") Integer hid);
}
