/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dev_j110_3_1;

/**
 *
 * @author Jane
 */
public class List {
    public static void main(String[] args) {
        DEV_J110_3_1 list = new DEV_J110_3_1();
        System.out.println("Is the list empty:" + list.nullCheck());
        list.addTail(3);
        list.addTail(4);
        list.addHead(2);
        list.addHead(1);
        list.addTail(5);
        list.addTail(6);
        System.out.println("Is the list empty:" + list.nullCheck());
        System.out.println("New list:");
        list.printAll();
        System.out.println("Does the list contain 2:" + list.searchValue(2));
        System.out.println("Does the list contain 5:" + list.searchValue(7));
        System.out.println("Head value is:" + list.getValueHeadAndRemove());
        System.out.println("Tail value is:" + list.getValueTailAndRemove());
        System.out.println("New list:");
        list.printAll();
        System.out.println("Removing 4 from list. New list:");
        list.removeValue(4);
        list.printAll();
    }
    
}
