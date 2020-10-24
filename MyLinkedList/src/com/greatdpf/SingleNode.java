package com.greatdpf;

/**
 * 简单的单链表的节点
 *
 * @author : dpf
 * @version : V1.0
 * @date : 2020/10/24
 */
public class SingleNode {
    /**
     * 存放下一个节点的值
     */
    private SingleNode next;
    /**
     * 存放数据
     */
    private int data;

    public SingleNode() {
    }

    public SingleNode(int data) {
        this.data = data;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }


}
