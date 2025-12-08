/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
// הגדרת מבנה של צומת ברשימה מקושרת
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // יצירת צומת דמה כדי להתחיל ממנו
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;

        // כל עוד שתי הרשימות אינן ריקות
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        // אם נשארו איברים באחת הרשימות
        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        // ראש הרשימה החדשה הוא אחרי הצומת הדמה
        return dummy.next;
    }

    // מתודת main להדגמה
    public static void main(String[] args) {
        // רשימה ראשונה: 1 -> 3 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        // רשימה שנייה: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // מיזוג הרשימות
        ListNode merged = mergeTwoLists(l1, l2);

        // הדפסת הרשימה הממוזגת
        System.out.print("Merged list: ");
        while (merged != null) {
            System.out.print(merged.val + " ");
            merged = merged.next;
        }
        // פלט צפוי: Merged list: 1 1 3 3 4 5
    }
}
