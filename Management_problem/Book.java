class Book {
    int bookId;
    String title;
    String author;
    double price;

    public Book(int bookId, String title, String author, double price) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void display() {
        System.out.println("[" + bookId + "] " + title + " - Rs. " + price);
    }
}

public class LibraryManagementSystem {

    // Task 1: Remove Duplicate Books In-Place (sorted by bookId)
    public static int removeDuplicates(Book[] books, int n) {
        if (n == 0 || n == 1) return n;
        
        int j = 0; // Index for unique elements
        for (int i = 0; i < n - 1; i++) {
            // Compare current ID with the next ID
            if (books[i].bookId != books[i + 1].bookId) {
                books[j++] = books[i];
            }
        }
        books[j++] = books[n - 1];
        return j;
    }

    // Task 2: Partial Title Search (Case-Insensitive)
    public static void searchByTitle(Book[] books, int count, String query) {
        String lowerQuery = query.toLowerCase();
        System.out.println("Search Results for '" + query + "':");
        for (int i = 0; i < count; i++) {
            if (books[i].title.toLowerCase().contains(lowerQuery)) {
                System.out.print("- Found: ");
                books[i].display();
            }
        }
    }

    // Task 3: Sort by Price using Selection Sort (Ascending) + swap count
    public static void sortByPrice(Book[] books, int count) {
        int swapCount = 0;
        for (int i = 0; i < count - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < count; j++) {
                if (books[j].price < books[minIndex].price) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Book temp = books[i];
                books[i] = books[minIndex];
                books[minIndex] = temp;
                swapCount++;
            }
        }
        System.out.println("Total Swaps: " + swapCount);
    }

    // Task 4: Binary Search by Price in O(log N) time
    public static int searchByPrice(Book[] books, int count, double targetPrice) {
        int left = 0;
        int right = count - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (books[mid].price == targetPrice) {
                return mid;
            } else if (books[mid].price < targetPrice) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Task 5: Sliding Window for Minimum Consecutive Books >= targetCost
    public static int minBooksForTargetCost(Book[] books, int count, double targetCost) {
        int minLength = Integer.MAX_VALUE;
        double currentSum = 0;
        int left = 0;

        for (int right = 0; right < count; right++) {
            currentSum += books[right].price;

            while (currentSum >= targetCost) {
                minLength = Math.min(minLength, right - left + 1);
                currentSum -= books[left].price;
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    // Main Method to test with Sample Case
    public static void main(String[] args) {
        Book[] books = {
            new Book(101, "Data Structures", "Mark", 400.0),
            new Book(101, "Data Structures", "Mark", 400.0), // Duplicate
            new Book(102, "Java Basics", "James", 300.0),
            new Book(103, "Python Guide", "Guido", 600.0),
            new Book(104, "Database Systems", "Raghu", 500.0),
            new Book(105, "Computer Networks", "Andrew", 700.0)
        };
        int n = books.length;

        // Task 1
        n = removeDuplicates(books, n);
        System.out.println("Unique Books Count: " + n);
        System.out.println("Book List:");
        for (int i = 0; i < n; i++) books[i].display();
        System.out.println();

        // Task 2
        searchByTitle(books, n, "data");
        System.out.println();

        // Task 3
        System.out.println("Books Sorted by Price:");
        sortByPrice(books, n);
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". ");
            books[i].display();
        }
        System.out.println();

        // Task 4
        double targetPrice = 500.0;
        System.out.println("Searching for Price Rs. " + targetPrice + "...");
        int index = searchByPrice(books, n, targetPrice);
        if (index != -1) {
            System.out.print("Result: Book found at index " + index + ": ");
            books[index].display();
        } else {
            System.out.println("Result: Not found");
        }
        System.out.println();

        // Task 5
        double grantS = 1000.0;
        System.out.println("Finding minimum consecutive books whose total price >= Rs. " + grantS + "...");
        int minBooks = minBooksForTargetCost(books, n, grantS);
        System.out.println("Minimum Consecutive Books Needed: " + minBooks);
    }
}
