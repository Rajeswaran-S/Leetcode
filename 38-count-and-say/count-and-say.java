class Solution {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String prev=countAndSay(n-1);
        StringBuilder sb=new StringBuilder();
        int i=0;
        while(i<prev.length())
        {
            int c=1;
            while(i+1<prev.length() && prev.charAt(i)==prev.charAt(i+1))
            {
                c+=1;
                i+=1;
            }
            sb.append(c).append(prev.charAt(i));
            i+=1;
        }        
        return sb.toString();       
    }
}