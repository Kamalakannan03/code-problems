/**
 * In an array, we can swap the elements at any two indices in a single operation called a move.
 * For example, if our array is a = [17, 4, 8], we can swap a[0] = 17 and a[2] = 8 to get a = 
 * [8, 4, 17] in a single move. We want to custom sort an array such that all of the even elements
 * are at the beginning of the array and all of the odd elements are at the end of the array.
 * 
 * Note : the order of elements within even or odd doesn't matter.
 * 
 * Constraints :
 * 2 <= n <= 10^5
 * 1 <= a[i] <= 10^9, where 0 <= i <= n
 * it is guaranteed that array a contains at least one even and one odd element.
 */

package company.fidelityInternational;

public class Moves {

	public static void main(String[] args) {
		System.out.println(moves(new int[] {8, 5, 11, 4, 6}));
	}
	
	static int moves(int[] a) {
		int left = 0;
		int right = a.length - 1;
		int temp = 0;
		int count = 0;
		while(left < right) {
			if(a[left] % 2 != 0) {
				while(a[right] % 2 != 0 && right > left) {
					right--;
				}
				if(left != right) {
					temp = a[right];
					a[right] = a[left];
					a[left] = temp;
					right--;
					left++;
					count++;
				}
			}else {
				left++;
			}
		}
		return count;
	}
}
