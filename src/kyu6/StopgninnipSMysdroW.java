package kyu6;

public class StopgninnipSMysdroW {
    public String spinWords(String sentence) {
        String[] sentenceArray=sentence.split(" ");


        for (int i = 0; i < sentenceArray.length; i++) {
            if (sentenceArray[i].length()>=5){
                StringBuilder str=new StringBuilder();
                str.append(sentenceArray[i]);
                sentenceArray[i]=String.valueOf(str.reverse());
            }
        }


        return String.join(" ",sentenceArray);
    }
}
