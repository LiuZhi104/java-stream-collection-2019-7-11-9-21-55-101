package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        ArrayList integerList = new ArrayList();
        if (left <= right) {
            IntStream.rangeClosed(left, right).boxed().forEach(e -> integerList.add(e));
            return integerList;
        }else{
           return IntStream.rangeClosed(right,left).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        }
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        if(left<right){
           return IntStream.rangeClosed(left,right).boxed().filter(num->num%2==0).collect(Collectors.toList());

        }else{
            return IntStream.rangeClosed(right,left).boxed().sorted(Comparator.reverseOrder()).filter(num->num%2==0).collect(Collectors.toList());

        }
    }

    public List<Integer> popEvenElments(int[] array) {
        return Arrays.stream(array).boxed().filter(n->n%2==0).collect(Collectors.toList());
    }

    public int popLastElment(int[] array) {
        return Arrays.stream(array).reduce((first,second)->second).orElse(0);
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
