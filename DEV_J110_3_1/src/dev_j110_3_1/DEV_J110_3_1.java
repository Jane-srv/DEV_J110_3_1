/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dev_j110_3_1;


/**
 *
 * @author Jane
 */
public class DEV_J110_3_1 {
    
    private Node head;
    private Node tail;
    
    //Добавление значения в начало
    public void addHead(Integer item){
        Node temp = new Node();
        temp.value = item;
        if(head==null){
            head = temp;
            tail = temp;
        } else{
            temp.next = head;
            head = temp;
        }
    }
    
    //Извлечение значения из начала списка без его удаления
    public Integer getValueHead(){
        if(head==null) return null;
        return head.value;
    }
    
    //Извлечение значения из начала списка c удалением
    public Integer getValueHeadAndRemove(){
        if(head==null) return null;
        int item = head.value;
        head.value = head.next.value;
        head.next = head.next.next;
        return item;
    }
    
    //Добавление значения в конец
    public void addTail(Integer item){
        Node temp = new Node();
        temp.value = item;
        if(head==null){
            head = temp;
            tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
    }
    
    //Извлечение значения из конца списка без его удаления
    public Integer getValueTail(){
        if(tail==null) return null;
        return tail.value;
    }
    
    //Извлечение значения из конца списка c удалением
    public Integer getValueTailAndRemove(){
        if(tail==null) return null;
        int item = tail.value;
        tail.value = null;
        tail.next = null;
        return item;
    }
    
    //Определение, содержит ли список заданное значение, или нет
    public boolean searchValue(int ger){
        int size = 0;
        Node temp = head;
        while (temp!=null){
            size++;
            if(temp.value==ger) return true;
            temp = temp.next;
        }
        return false;
    }
    
    //Определение, является ли список пустым, или нет
    public boolean nullCheck(){
        if (head==null) return true;
        return false;
    }
    
    //Печать всех значений списка
    public void printAll(){
        int i = 0;
        Node temp = head;
        while (temp!=null){
            i++;
            if (temp.value==null) break;
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    
    //Удаление заданного значения из списка
    public void removeValue(int ger){
        int size = 0;
        Node temp = head;
        while (temp!=null){
            size++;
            if(temp.value==ger) {
                temp.value = temp.next.value;
                temp.next = temp.next.next;
                break;
            }
            if(temp.value==ger && temp.next==null){
                temp.value = null;
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
    }
    
    private class Node{
        Node next;
        Integer value;
    }
}
