package com.greatdpf.singleLinkedList;

/**
 * 单向链表结构实现
 * 1.添加功能
 * 2.打印功能
 *
 * @author : dpf
 * @version : V1.0
 * @date : 2020/10/24
 */
public class SingleLinkedList {
    /**
     * 记录头指针
     */
    private SingleNode first;
    /**
     * 记录尾指针
     */
    private SingleNode last;
    /**
     * 记录单链表的长度
     */
    private int size;

    public SingleLinkedList() {
    }

    /**
     * 添加元素
     * @param value 添加元素的值
     * @return 添加成功返回true，否则 false
     */
    public boolean add(int value) {
        // 新建节点
        SingleNode newNode = new SingleNode(value);
        // 判断是否是第一次添加节点
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            // 设置下一个节点为新节点
            last.setNext(newNode);
            // 将指针指向最后一个节点
            last = newNode;
        }
        // 长度 + 1
        size++;
        return true;
    }

    /**
     * 获取链表长度
     * @return size 链表长度
     */
    public int getSize() {
        return size;
    }

    /**
     * 从头打印链表中的数据
     */
    public void printLinkedList() {
        // 获取头节点
        SingleNode next = first;
        // 从头依次循环向下打印
        for (int i = 0;i < size;i++) {
            System.out.println(next.getData());
            next = next.getNext();
        }
    }


}
