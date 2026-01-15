package com.day4.EventManager;

public class TicketQuickSorter {

    public void sortByPrice(EventTicket[] tickets) {
        quickSort(tickets, 0, tickets.length - 1);
    }

    private void quickSort(EventTicket[] arr, int low, int high) {

        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private int partition(EventTicket[] arr, int low, int high) {

        double pivot = arr[high].getPrice();
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j].getPrice() <= pivot) {
                i++;
                EventTicket temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        EventTicket temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}
