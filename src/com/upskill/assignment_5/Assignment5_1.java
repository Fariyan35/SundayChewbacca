//{Write a method that returns the largest integer in the list. You can assume that the list has at least one element.
package com.upskill.assignment_5;
public class Assignment5_1{
public Integer maximum(Integer[] list) {

int maximum = list[0];
for (int i : list) {
    if (i > maximum) {
        maximum = i;
    }
}
return maximum;
}



}
