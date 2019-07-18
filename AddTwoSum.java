public class AddTwoSum {
    private class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }

    /**
     * @author xinrui zhan
     * @since 7.17.2019
     *
     * faster than 100%
     * using less than 69% space 
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            boolean ifAdd = false;
            ListNode answer = l1;
            while(l1.next != null && l2.next != null) {
                int temp = l1.val + l2.val;
                if (ifAdd) {
                    temp++;
                }
                if (temp >= 10) {
                    ifAdd = true;
                    temp = temp % 10;
                    l1.val = temp;
                } else {
                    ifAdd = false;
                    l1.val = temp;
                }
                l1 = l1.next;
                l2 = l2.next;
            }
            if (l1.next == null) {
                int temp = l1.val + l2.val;
                if (ifAdd) {
                    temp++;
                }
                if (temp >= 10) {
                    ifAdd = true;
                    temp = temp % 10;
                    l1.val = temp;
                } else {
                    ifAdd = false;
                    l1.val = temp;
                }
                ListNode tempNode = l2;
                while (ifAdd) {
                    if (tempNode.next != null) {
                        tempNode = tempNode.next;
                        tempNode.val++;
                        if (tempNode.val < 10) {
                            ifAdd = false;
                        } else {
                            ifAdd = true;
                            tempNode.val = tempNode.val % 10;
                        }
                    } else {
                        ListNode NodeOne = new ListNode(1);
                        tempNode.next = NodeOne;
                        break;
                    }
                }
                l1.next = l2.next;
            } else {
                int temp = l1.val + l2.val;
                if (ifAdd) {
                    temp++;
                }
                if (temp >= 10) {
                    ifAdd = true;
                    temp = temp % 10;
                    l1.val = temp;
                } else {
                    ifAdd = false;
                    l1.val = temp;
                }
                while (ifAdd) {
                    if (l1.next != null) {
                        l1 = l1.next;
                        l1.val++;
                        if (l1.val >= 10) {
                            ifAdd = true;
                            l1.val = l1.val % 10;
                        } else {
                            ifAdd = false;
                        }
                    } else {
                        ListNode NodeOne = new ListNode(1);
                        l1.next = NodeOne;
                        break;
                    }
                }
            }
            return answer;
        }
    }
}
