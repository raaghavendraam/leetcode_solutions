// Last updated: 07/09/2026, 08:46:29
class Solution {
public int maxNumberOfBalloons(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int count =0;
        for (int i = 0; i <s.length(); i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                int freq = map.get(ch);
                map.put(ch, freq+1);
            }
            else map.put(ch,1);
        }
        while(map.containsKey('b')&&map.containsKey('a')&&map.containsKey('l')&&map.containsKey('o')&&map.get('b')>=1&&map.containsKey('n')&&map.get('a')>=1&&map.get('n')>=1&&map.get('o')>=2&&map.get('l')>=2){
            count++;
            map.put('b',map.get('b')-1);
            map.put('a',map.get('a')-1);
            map.put('n',map.get('n')-1);
            map.put('l',map.get('l')-2);
            map.put('o',map.get('o')-2);
        }
        return count;
    }
}