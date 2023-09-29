package WebScraper;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Scanner;

public class bagOfWords {
    ArrayList<String> documents;
    ArrayList<String> bagOfWord;
    HT ht;
    ArrayList<HT> hashtables=new ArrayList<>();
    public bagOfWords(ArrayList<String> documents){
        this.documents=documents;
    }
    public ArrayList<String> getBagOfWord(){
        for (String document: documents){
            ht = new HT();
            Scanner scanner = new Scanner(document);
            while (scanner.hasNext()){
                ht.add(scanner.next());
            }
            hashtables.add(ht);
        }
        ht =new HT();
        for (int i=0;i<hashtables.size()-1;i++){
            ht.addAll(hashtables.get(i));
        }

        bagOfWord=ht.printAll();
        return bagOfWord;
    }
}

