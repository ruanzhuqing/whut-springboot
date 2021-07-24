package com.whut.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * TODO:送水工实体类
 *
 * @auther Administrator
 * @createdate 2021/7/23
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Worker {
    private Integer wid;
    private String workerName;
    private Integer workerSalary;
    private double workerMoney;
    private String workerImage;
}
