package kyu5;

import java.util.List;

class PaginationHelper<I> {

    private final List<I> collection;
    private final int itemsPerPage;

    /**
     * The constructor takes in an array of items and a integer indicating how many
     * items fit within a single page
     */
    PaginationHelper(List<I> collection, int itemsPerPage) {
        this.collection = collection;
        this.itemsPerPage = itemsPerPage;
    }

    /**
     * returns the number of items within the entire collection
     */
    int itemCount() {
        return collection.size();
    }

    /**
     * returns the number of pages
     */
    int pageCount() {
        return (itemCount() + itemsPerPage - 1) / itemsPerPage;
    }

    /**
     * returns the number of items on the current page. page_index is zero based.
     * this method should return -1 for pageIndex values that are out of range
     */
    int pageItemCount(int pageIndex) {
        if (pageIndex < 0 || pageIndex + 1 > pageCount()) return -1;

        if (itemCount() < itemsPerPage) return itemCount();

        if (pageIndex + 1 < pageCount()) {
            return itemsPerPage;
        } else {
            return itemCount() % itemsPerPage;
        }

    }

    /**
     * determines what page an item is on. Zero based indexes
     * this method should return -1 for itemIndex values that are out of range
     */
    int pageIndex(int itemIndex) {
        if (itemIndex < 0 || itemIndex >= itemCount()) return -1;

        return itemIndex / itemsPerPage;
    }
}
