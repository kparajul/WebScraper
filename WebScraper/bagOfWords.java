package WebScraper;

import javax.swing.text.Document;
import java.util.ArrayList;
import java.util.Scanner;

public class bagOfWords {
    ArrayList<String> documents;
    ArrayList<String> bagOfWord = new ArrayList<>();
    ArrayList<HT> tfStorage;
    HT ht;
    ArrayList<HT> hashtables=new ArrayList<>();
    double doubletf[][];
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
        doubletf = new double[bagOfWord.size()-1][hashtables.size()-1];
        for (int j = 0;j < bagOfWord.size(); ++j) {
            for (int i = 0; i < hashtables.size();++i) {
                doubletf[j][i] = TF(bagOfWord.get(i), hashtables.get(i));
            }
        }
        return bagOfWord;
    }
    public double TF(String value, HT hashtable) {
        int size = hashtable.getTotalsize();
        int frequency = hashtable.contains(value);
        double tf = (double) frequency / size;
        return tf;
    }
}

