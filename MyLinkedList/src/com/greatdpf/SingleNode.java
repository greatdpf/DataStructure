package com.greatdpf;

/**
 * 简单的单链表的节点
 *
 * @author : dpf
 * @version : V1.0
 * @date : 2020/10/24
 */
public class SingleNode {
    private SingleNode next;
    private int data;

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

    public SingleNode(int data) {
        this.data = data;
    }
}
