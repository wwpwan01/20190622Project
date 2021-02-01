package com.wwp.strategy;

public class Sorter<T> {

    public static void sort(int[] arra){
        for (int i =0 ; i<arra.length-1;i++){
            int min = i;
            for (int j=i+1;j<arra.length;j++){
                min = arra[min]<arra[j]?min:j;
            }
//            swap(arra,min,i);
        }

    }

    private static void swap(Comparable[] arra, int min, int i) {
        Comparable temp = arra[min];
        arra[min]=arra[i];
        arra[i]=temp;
    }

    private void swap(T[] arra, int min, int i) {
        T temp = arra[min];
        arra[min]=arra[i];
        arra[i]=temp;
    }

//    public static void sort(Comparable[] arra){
//        for (int i =0 ; i<arra.length-1;i++){
//            int min = i;
//            for (int j=i+1;j<arra.length;j++){
//                min = arra[min].compareTo(arra[j])==-1?min:j;
//            }
//            swap(arra,min,i);
//        }
//
//    }

    public void sort(T[] arra,Comparator<T> comparator){
        for (int i =0 ; i<arra.length-1;i++){
            int min = i;
            for (int j=i+1;j<arra.length;j++){
                min = comparator.compare(arra[min],(arra[j]))==-1?min:j;
            }
            swap(arra,min,i);
        }

    }


}
