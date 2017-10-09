package com.test.json.dto;

import java.util.List;

public class ShuZuDto {
    private List<TagDto> result;
    private int code;
    private String message;

    public List<TagDto> getResult() {
        return result;
    }

    public void setResult(List<TagDto> result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
