package lesson04.part01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1. В методе initializeArray():
 * 1.1. Создайте массив на 20 чисел
 * 1.2. Считайте с консоли 20 чисел и заполните ими массив
 * 2. Метод max(int[] array) должен находить максимальное число из элементов массива
 * <p>
 * Требования:
 * 1.	Метод initializeArray должен создавать массив из 20 целых чисел.
 * 2.	Метод initializeArray должен считать 20 чисел и вернуть их в виде массива.
 * 3.	Метод max должен возвращать максимальный элемент из переданного массива.
 * 4.	Метод main изменять нельзя.
 */

public class Task01 {

  public static void main(String[] args) throws Exception {
    int[] array = initializeArray();
    int max = max(array);
    System.out.println(max);
  }

  public static int[] initializeArray() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int i;
    int [] array = new int [20];
    for (i=0; i<=19; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }
    return array;
  }

  public static int max(int[] array) {
    int i;
    int max = array[0];
    for (i=0; i<=19; i++) {
      if (array[i]>max) {
        max = array[i];
      }
    }
    return max;
  }
}
