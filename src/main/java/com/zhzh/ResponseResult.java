package com.zhzh;

import java.util.List;

/**
 * @Author: jason.zhao
 * @date:2019/7/2 15:17
 * @Description:
 */
public class ResponseResult {
    private String log_id;
    private List<AiInfo> result_num;

    public String getLog_id() {
        return log_id;
    }

    public void setLog_id(String log_id) {
        this.log_id = log_id;
    }

    public List<AiInfo> getResult_num() {
        return result_num;
    }

    public void setResult_num(List<AiInfo> result_num) {
        this.result_num = result_num;
    }
}
