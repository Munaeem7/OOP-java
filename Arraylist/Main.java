import java.util.*;

public class Main {
    public static void main(String[] args) {
        String p="It's not only writers who can benefit from this free online tool. If you're a programmer who's working on a project where blocks of text are needed, this tool can be a great way to get that. It's a good way to test your programming and that the tool being created is working well.\n" +
                "\n" +
                "Above are a few examples of how the random paragraph generator can be beneficial. The best way to see if this random paragraph picker will be useful for your intended purposes is to give it a try. Generate a number of paragraphs to see if they are beneficial to your current project.\n" +
                "\n" +
                "If you do find this paragraph tool useful, please do us a favor and let us know how you're using it. It's greatly beneficial for us to know the different ways this tool is being used so we can improve it with updates. This is especially true since there are times when the generators we create get used in completely unanticipated ways from when we initially created them. If you have the time, please send us a quick note on what you'd like to see changed or added to make it better in the future.";
        String[] words=p.split(" ");
        String[] sentences =p.split("\\.");
        //System.out.println(sentences[1]);
        ArrayList<String> paragraph=new ArrayList<>();
        for(String temp:words){
            paragraph.add(temp);
        }

        //System.out.println(paragraph);
        System.out.println("total words:"+paragraph.size());
        ArrayList<String> uniquewords=new ArrayList<>();
        for(String word:words){
            if(!uniquewords.contains(word)){
                uniquewords.add(word);
            }
        }
        System.out.println("unique words:"+uniquewords.size());

        ArrayList<String> Sentences=new ArrayList<>();
        for(String temp:sentences){
            Sentences.add(temp);
        }
        System.out.println("no of sentences:"+Sentences.size());

        Set set=new HashSet();

       // Map<String, Integer> list=new HashMap<>();

        char[] charArray=p.toCharArray();
        System.out.println("no of characters:"+charArray.length);



        HashSet<Character> uniquecharacters=new HashSet();
        for(Character temp:charArray){
            uniquecharacters.add(temp);
        }
        System.out.println("unique characters:"+uniquecharacters.size());

        ArrayList<Word> wordfrequency=new ArrayList<>();


        for(String temp:words){
          //  wordfrequency.add(new Word(temp,1));
            if(uniquecharacters.contains(new Word(temp,1))){
                int index=wordfrequency.indexOf(new Word(temp,1));
                wordfrequency.get(index).setCount(wordfrequency.get(index).getCount()+1);
            }else{
                wordfrequency.add(new Word(temp,1));
            }
        }


        System.out.println("word frequency:"+wordfrequency.size());


    }
}
