import java.util.ArrayList;
import java.util.List;

public class Solution438 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<Integer> findAnagrams(String s, String p) {
		int[] smap = new int[26];
        int[] pmap = new int[26];
        int plen = p.length();
        int slen = s.length();

        for (int i=0; i<plen; i++) {
            pmap[p.charAt(i)-'a']++;
        }

        List<Integer> lst = new ArrayList<>();
        int count = 0;
        for (int i=0; i<plen&&i<slen; i++) {
            int xx = s.charAt(i) - 'a';
            if (pmap[xx] > 0) {
                smap[xx]++;
                if (smap[xx] <= pmap[xx]) {
                    count++;
                }
            }
        }
        if (count == plen) {
            lst.add(0);
        }
        for (int i=plen; i<slen; i++) {
            int yy = s.charAt(i-plen) - 'a';
            if (smap[yy] > 0) {
                smap[yy]--;
                if (smap[yy] < pmap[yy]) {
                    count--;
                }
            }
            int xx = s.charAt(i) - 'a';
            if (pmap[xx] > 0) {
                smap[xx]++;
                if (smap[xx] <= pmap[xx]) {
                    count++;
                }
            }
            if (count == plen) {
                lst.add(i-plen+1);
            }
        }
        return lst;
    }
	

}
