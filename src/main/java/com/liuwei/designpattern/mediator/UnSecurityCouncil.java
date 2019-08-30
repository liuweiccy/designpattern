package com.liuwei.designpattern.mediator;

import lombok.extern.slf4j.Slf4j;

/**
 * 联合国安全理事会（具体的中介者）
 *
 * @author liuwei2
 * @date 2019/08/30 15:59
 */
@Slf4j
public class UnSecurityCouncil implements UnitedNations {
    private USA usa;
    private China china;

    public void setUsa(USA usa) {
        this.usa = usa;
    }

    public void setChina(China china) {
        this.china = china;
    }

    @Override
    public void declare(String message, Country country) {
        if (country instanceof USA) {
            log.info("usa send {}:{}", china.getName(), message);
        } else if (country instanceof China) {
            log.info("china send {}:{}", usa.getName(), message);
        }
    }
}
