package NeetCode_2022_Summer.DailyChallenges.weeklyCompetitions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class week79 {
    public static void main(String[] args) {
        // String num = "1210";
        // boolean myreturn = checkNumForEqualDigitCountAndValue(num);
        // System.out.println(myreturn);
        String[] messages = {"Ux i E XMm","G Mo f q Qa q","v qZ J m R","z pt T yG W xq Xq G","GS F Ug","QDv","I iY k pd M","aOi","f xV xa","c Zu Fa ofO","x c E R H","pw sfU","i aE G Aqw","Yu S di sV sx mc AlB","D lx g cF k","U fw rh Ne","I aN o Sv aE s","ZF c Jo IA","Y S f Ld D M fbb","OI Mn e Q A gT","xV f Li v h vy I S","Q gI G vj Qd c y r W","Q R BK VI","K Am NZ","wk CT","p sQ b Se l BI We fv","x WF fW l n px WY rz","S rW mh","a T og TA b Gg h","t v WO","Ai bO mY","e AMh","t nfH","q F G ch N","sf W iH yx M Pf YjA","uE D","hA F q NX","Fm","lI C Vl Em md d L","az kz i bx g v dD","Fq UR qf hh","C r Nq u Ve i","x tT BR Bj d a yu G","Nm M DM h Wu","IZ y Lo ZN Yv","l Kh ia Rt","VR cg C fM mL MH","a P e Gb","Xq UO","U qM","h bM mn e a","WD w VT Tf dK G YPE","cT T wc O VLT","e q K e Ao V kw","Ie dt JB a C y O rq","ih Wu","QP T G Zl Yx Q pSz","Rs","xA y D e e g","Gik","D o Y wyD","mG z N a j fz P","U q W","Ei xr Zf","wT X EI vz BI","nj Fr g J P qH h gZa","e wB XX s","wL Md wt","RE yd U rY J qx","DO Q a U N","p F gh fv","xn LT vg rZ pF z xrf","k","DD r sh B","Z Eg iJ Hq r VX h","Xy N k Hd Lk ea","teU","n kp U k KZ aw","UG uO ax S y","q D SD","r ns E Wv XR wv tP g"};
        String[] senders = {"K","kFIbpoFxn","yErgn","N","wtJesr","rusffeL","KlpoodEd","qGcQqIVdFr","ztmCdK","HFILjKln","rusffeL","TmmQZ","R","CNh","YMQDBkOWy","kjiSc","cGMsZxxx","YMQDBkOWy","PPqsmNBewN","gbtn","nQNcL","rK","ppr","LhSVp","Ub","QGRFMLY","YMQDBkOWy","Ub","PPqsmNBewN","SdDObYkD","q","suAakSCuHz","QGRFMLY","dnzhjdwrEt","ubIEXAO","EsBuLal","kFIbpoFxn","yErgn","ubIEXAO","TmmQZ","TmmQZ","xlQqQRrdTv","mWxCG","TmmQZ","DmwIEmS","gbtn","nBQLLS","QhF","Ub","ppr","bmtYQKYv","ppr","EsBuLal","PRiNk","rusffeL","ztmCdK","PPqsmNBewN","rK","xlQqQRrdTv","QGRFMLY","EsBuLal","QyYJw","QIFauTN","dnzhjdwrEt","zJLcUq","ubIEXAO","HFILjKln","ppr","wtJesr","ztmCdK","suAakSCuHz","zJLcUq","TU","HFILjKln","lCkGjDY","A","zJLcUq","SdDObYkD","YMQDBkOWy","R","LhSVp"};
        String longestWordCountSender = senderWithLargestWordCount(messages, senders);
        System.out.println(longestWordCountSender);
    }

    private static String senderWithLargestWordCount(String[] messages, String[] senders) {
        //create a hashmap with sender as key and number of words as value
        HashMap<String, Integer> wordCountMap = new HashMap<>();
        for (int i = 0; i < messages.length; i++) {
            //count number of words in message
            String[] messagewordcount = messages[i].split(" ");
            if(wordCountMap.containsKey(senders[i])) {
                wordCountMap.put(senders[i], wordCountMap.get(senders[i]) + messagewordcount.length);
            } else {
                wordCountMap.put(senders[i], messagewordcount.length);
            }
        }
        //max values in hashmap
        int maxValue = 0;
        ArrayList<String> maxSenders = new ArrayList<>();

        for (String sender : wordCountMap.keySet()) {
            if(wordCountMap.get(sender) > maxValue) {
                maxValue = wordCountMap.get(sender);
                maxSenders.removeAll(maxSenders);
                maxSenders.add(sender);

            } else if(wordCountMap.get(sender) == maxValue) {
                maxSenders.add(sender);
                System.out.println(maxSenders);
            }
        }
        if(maxSenders.size() == 1) {
            return maxSenders.remove(0);
        } else {
            Collections.sort(maxSenders, String.CASE_INSENSITIVE_ORDER);
            return maxSenders.remove(maxSenders.size()-1);
        }        
    }





    private static boolean checkNumForEqualDigitCountAndValue(String num) {
        boolean result = true;
        HashMap<Integer, Integer> digitMap = new HashMap<>();
        
        for (Character c : num.toCharArray()) {
            int a = Character.getNumericValue(c);
            if(digitMap.containsKey(a)){
                digitMap.put(a, digitMap.get(a) + 1);
            } else {
                digitMap.put(a, 1);
            }
        }        
        //traverse through hashmap and make sure they are even
        char[] mychararray = num.toCharArray();
        for (int i = 0; i < mychararray.length; i++) {
            int b = Character.getNumericValue(mychararray[i]);
            if(digitMap.get(i) == null) {
                if(b != 0){
                    System.out.println(i);
                    result = false;
                }
            } else if(b != digitMap.get(i)){
                System.out.println(b);
                result = false;
            }
        }
        return result;
    }
}
