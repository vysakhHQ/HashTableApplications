import java.util.HashMap;

public class UC4PlagiarismDetectionSystem{

    public static void main(String[] args){

        String doc1="java is a programming language";
        String doc2="java is a powerful programming language";

        String[] words1=doc1.split(" ");
        String[] words2=doc2.split(" ");

        HashMap<String,Integer> map=new HashMap<>();

        for(String word:words1){
            map.put(word,1);
        }

        int matchCount=0;

        for(String word:words2){
            if(map.containsKey(word)){
                matchCount++;
            }
        }

        double similarity=((double)matchCount/words2.length)*100;

        System.out.println("Matching words: "+matchCount);
        System.out.println("Similarity: "+similarity+"%");

    }
}