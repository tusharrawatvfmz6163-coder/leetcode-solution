  class Solution {
    public boolean isPalindrome(ListNode head) {
        String str = "";

        for (ListNode temp = head; temp != null; temp = temp.next) {
            str += temp.val;
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }

        return true;
    }
}