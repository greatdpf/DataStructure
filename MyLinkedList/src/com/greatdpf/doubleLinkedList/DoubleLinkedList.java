package com.greatdpf.doubleLinkedList;

/**
 * 双向链表结构实现
 * 1.添加元素
 * 2.正向打印元素
 * 3.反向打印元素
 *
 * @author : dpf
 * @version : V1.0
 * @date : 2020/10/24
 */
public class DoubleLinkedList {
    /**
     * 第一个节点，即：头节点
     */
    private DoubleNode first;
    /**
     * 最后一个节点，即：尾节点
     */
    private DoubleNode last;
    /**
     * 链表的长度
     */
    private int size;

    public DoubleLinkedList() {
    }

    public DoubleNode getFirst() {
        return first;
    }

    /**
     * 获取链表的长度
     * @return size 链表的长度
     */
    public int getSize() {
        return size;
    }

    /**
     * 添加元素
     * @param value 添加的元素值
     * @return 添加成功返回 true
     */
    public boolean add(int value) {
        // 新建节点，存放元素值
        DoubleNode newNode = new DoubleNode(value);
        // 判断是否是第一次添加元素
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            // 将原来最后一个元素的 next 存放为 新节点
            last.setNext(newNode);
            // 将新节点的 previous 存放为 原来最后一个节点
            last.getNext().setPrevious(last);
            // 在将原来最后一个节点改为最新的最后一个节点 newNode
            last = newNode;
        }
        // 链表长度 + 1
        size++;
        return true;
    }

    /**
     * 正向打印元素值
     */
    public void printLinkedListByFirst() {
        DoubleNode next = first;
        for (int i = 0;i < size;i++) {
            System.out.println(next.getData());
            next = next.getNext();
        }
    }

    /**
     * 逆向打印元素值
     */
    public void printLinkedListByLast() {
        DoubleNode previous = last;
        for (int i =0;i < size;i++) {
            System.out.println(previous.getData());
            previous = previous.getPrevious();
        }
    }

}
