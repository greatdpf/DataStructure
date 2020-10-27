package com.greatdpf.doubleLinkedList;

/**
 * 双链表的节点
 *
 * @author : dpf
 * @version : V1.0
 * @date : 2020/10/24
 */
public class DoubleNode {
    /**
     * 存放上一个节点
     */
    private DoubleNode previous;
    /**
     * 存放下一个节点
     */
    private DoubleNode next;
    /**
     * 存放数据
     */
    private int data;

    public DoubleNode() {
    }

    public DoubleNode(int data) {
        this.data = data;
    }

    public DoubleNode getPrevious() {
        return previous;
    }

    public void setPrevious(DoubleNode previous) {
        this.previous = previous;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
