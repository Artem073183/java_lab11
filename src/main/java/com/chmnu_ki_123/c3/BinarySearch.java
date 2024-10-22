package com.chmnu_ki_123.c3;

public class BinarySearch {

    public static int binarySearch(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Перевірка, чи знайдено ключ
            if (arr[mid] == key) {
                return mid; // Повертаємо індекс елемента
            }

            // Якщо ключ більший, ігноруємо ліву половину
            if (arr[mid] < key) {
                left = mid + 1;
            }
            // Якщо ключ менший, ігноруємо праву половину
            else {
                right = mid - 1;
            }
        }

        // Ключ не знайдено
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Відсортований масив
        int key = 7;

        int result = binarySearch(arr, key);

        if (result == -1) {
            System.out.println("Елемент не знайдено.");
        } else {
            System.out.println("Елемент знайдено на індексі: " + result);
        }
    }
}
