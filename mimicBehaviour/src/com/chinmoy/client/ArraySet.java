package com.chinmoy.client;

import java.util.Arrays;

public class ArraySet {


        private Object[] elements;
        private int size;

        public ArraySet(int capacity) {
            elements = new Object[capacity];
            size = 0;
        }

        public int add(Object obj) {
            if (obj == null) {
                throw new NullPointerException("Null values are not allowed");
            }

            for (int i = 0; i < size; i++) {
                if (obj.equals(elements[i])) {
                    return -1;
                }
            }

            if (size >= elements.length) {
                elements = Arrays.copyOf(elements, elements.length * 2);
            }

            elements[size++] = obj;
            return size - 1;
        }


        public void remove(Object obj) {
            if (obj == null) {
                return;
            }

            for (int i = 0; i < size; i++) {
                if (obj.equals(elements[i])) {
                    System.arraycopy(elements, i + 1, elements, i, size - i - 1);
                    elements[--size] = null;
                    break;
                }
            }
        }

        public void showAll() {
            for (int i = 0; i < size; i++) {
                System.out.println(elements[i]);
            }
        }

    }

