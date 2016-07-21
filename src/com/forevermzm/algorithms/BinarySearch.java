package com.forevermzm.algorithms;

public class BinarySearch {
    public static int search(int[] elements, int target) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (elements[mid] > target) {
                right = mid - 1;
            } else if (elements[mid] < target) {
                left = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int searchFirstOccurrence(int[] elements, int target) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (elements[mid] >= target) {
                right = mid;
            } else if (elements[mid] < target) {
                left = mid;
            }
        }
        if (elements[left] == target) {
            return left;
        } else if (elements[right] == target) {
            return right;
        }
        return -1;
    }

    public static int searchLastOccurrence(int[] elements, int target) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (elements[mid] <= target) {
                left = mid;
            } else if (elements[mid] > target) {
                right = mid;
            }
        }
        if (elements[right] == target) {
            return right;
        } else if (elements[left] == target) {
            return left;
        }
        return -1;
    }

    public static int searchClosest(int[] elements, int target) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        while (left < right - 1) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == target) {
                return mid;
            } else if (elements[mid] < target) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return Math.abs(elements[left] - target) <= Math.abs(elements[right] - target) ?
                left : right;
    }

    public static int searchUnknownSize(int[] elements, int target, int jump) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = jump;
        while (elements.length > right
                && elements[right] < target) {
            left = left + jump;
            right = right + jump;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (elements.length <= mid) {
                right = mid - 1;
            } else if (elements[mid] == target) {
                return mid;
            } else if (elements[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    public static int searchWithPivot(int[] elements, int target) {
        if (elements == null || elements.length == 0) {
            return -1;
        }
        int left = 0;
        int right = elements.length - 1;
        int pivot = findPivot(elements, left, right);
        if (target <= elements[right]) {
            left = pivot + 1;
        } else {
            right = pivot;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (elements[mid] == target) {
                return mid;
            } else if (elements[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return -1;
    }

    static int findPivot(int[] elements, int left, int right) {
        if (elements.length == 1) {
            return 0;
        }
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (elements[mid] <= elements[right]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return right;
    }
}
