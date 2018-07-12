package com.fexo.bean;

import com.google.common.base.MoreObjects;

/**
 * @author  wangfeixiong
 * @param <T>
 */
public class Massage<T> {

    public int code;

    public String status;

    public T content;

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

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("code", code)
                .add("status", status)
                .add("content", content)
                .toString();
    }
}
