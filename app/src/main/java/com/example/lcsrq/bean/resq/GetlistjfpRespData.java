package com.example.lcsrq.bean.resq;

import com.example.lcsrq.bean.respbean.GetlistjfpData;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by 苏毅 on 2017/6/8.
 * 获得记分项目返回参数
 */

public class GetlistjfpRespData implements Serializable {
    private int code;
    private String status;
    private String request_type;
    private String response_type;
    private String msg;
    private ArrayList<GetlistjfpData> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRequest_type() {
        return request_type;
    }

    public void setRequest_type(String request_type) {
        this.request_type = request_type;
    }

    public String getResponse_type() {
        return response_type;
    }

    public void setResponse_type(String response_type) {
        this.response_type = response_type;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ArrayList<GetlistjfpData> getData() {
        return data;
    }

    public void setData(ArrayList<GetlistjfpData> data) {
        this.data = data;
    }
}
