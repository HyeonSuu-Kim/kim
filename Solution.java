import java.util.ArrayList;

class Solution {    //둘만의 암호
    public String solution(String s, String skip, int index) {
        /*a=97, z=122*/
        char[] arr1 = s.toCharArray();
        char[] arr2 = skip.toCharArray();
        char[] arr3 = new char[index];
        int count = 0;
        int a = (int)arr1[0];

        for(int i = 0; i<index; i++)
        {
            if(a+i>=123)
            {
                arr3[i] = (char)((a+i)%123+97);
            }
            else
                arr3[i] = (char)(a+i);
        }
        for(Character c: arr3)
        {
            for(Character h: arr2)
            {
                if(c.equals(h))
                {
                    count++;
                }
            }
        }
        for(int i = 0; i<arr1.length; i++)
        {
            int b = (int)arr1[i];
            if(b+count+index>=123) {
                arr1[i] = (char) ((b + count + index) % 123 + 96);
            }


            else
            arr1[i]= (char)(b+count+index);
        }

        String answer = new String(arr1);
        return answer;
    }
}