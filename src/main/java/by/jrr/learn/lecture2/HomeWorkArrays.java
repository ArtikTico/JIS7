package by.jrr.learn.lecture2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

public class HomeWorkArrays {
    static Logger log = LoggerFactory.getLogger(HomeWorkArrays.class);
    int [] numbersList = {2,3,4,5,1,6,9,0,7,10};
    static int count = 0;

    int[] revertArrayValue(int[] array) {
      int[] revertedNumberList = new int[array.length];
        for (int i = array.length-1; i >= 0 ; i--) {
            revertedNumberList[count] = numbersList[i];
            count++;
        }
        return revertedNumberList;
    }

    public void mergingArrays(int [] arraysOne, int[] arraysTwo) {
        int commonCapacity = arraysOne.length + arraysTwo.length;
        int [] mergerArrays = new int[commonCapacity];

        for (int i = 0; i < arraysOne.length; i++) {
            mergerArrays[i] = arraysOne[i];
        }

        for (int i = commonCapacity - arraysOne.length; i < mergerArrays.length; i++) {
            mergerArrays[i] = arraysTwo[i - arraysTwo.length];
        }
        log.info(Arrays.toString(mergerArrays));
    }

    public static void main(String[] args) {
        var homeWorkArrays = new HomeWorkArrays();
        Arrays.sort(homeWorkArrays.numbersList);
        int[] revertedArray = homeWorkArrays.revertArrayValue(homeWorkArrays.numbersList);
        log.info(Arrays.toString(revertedArray));
        homeWorkArrays.mergingArrays(homeWorkArrays.numbersList,revertedArray);

    }
}
