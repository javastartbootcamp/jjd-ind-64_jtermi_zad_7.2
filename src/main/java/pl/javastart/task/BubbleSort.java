package pl.javastart.task;

public class BubbleSort {

    // ta metoda powinna sortować inputArray oraz zwracać informację o liczbie porównań, które były do tego potrzebne
    public int sort(int[] inputArray) {

        int counter = 0;
        int tempContainer;
        int unsortedColumns = inputArray.length - 1;

        while (unsortedColumns > 0) {
            int swapCounter = 0;
            for (int i = 0; i < unsortedColumns; i++) {
                counter++;

                if (inputArray[i] > inputArray[i + 1]) {
                    tempContainer = inputArray[i];
                    inputArray[i] = inputArray[i + 1];
                    inputArray[i + 1] = tempContainer;
                    swapCounter++;
                }

            }

            if (swapCounter == 0) {
                unsortedColumns = 0;
            } else {
                unsortedColumns--;
            }
        }
        return counter;
    }
}