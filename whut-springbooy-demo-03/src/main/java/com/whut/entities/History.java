package com.whut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * TODO:送水历史记录实体类，关联了客户和员工实体类
 *
 * @auther Administrator
 * @createdate 2021/7/24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class History {
    private Integer hid;
    private Worker worker;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date sendWaterTime;
    private Customer customer;
    private Integer sendWaterCount;
}
