package com.quasar.demo.frame;

/**
 * description: 监听变化
 * created by kalu on 2018/4/10 11:47
 */
public abstract class OnModelAcceptChangeListener<T> {

    public void modelStart() {
    }

    public void modelComplete() {
    }

    public void modelFail() {
    }

    public abstract void modelSucc(T model);
}
