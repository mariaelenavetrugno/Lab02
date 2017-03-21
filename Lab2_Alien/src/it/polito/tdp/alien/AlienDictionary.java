package it.polito.tdp.alien;

import java.util.*;

public class AlienDictionary {

	//Map<String, String> parolePresenti = new TreeMap<String, String>();
	List<Word> parolePresenti;
	
	
	public AlienDictionary() {
		parolePresenti = new LinkedList<Word>();	}
	
	//public void addWord

	public void addWord(String alienWord, String translation){
		
		Word passata = new Word(alienWord, translation);
		parolePresenti.add(passata);
		
		for(Word w : parolePresenti){
			if(w.compare(alienWord) != null)
				//SE E' PRESENTE DEVO AGGIORNARE TRADUZIONE
				w.setTranslation(translation);
			
		}
		
	}
	
	
	
	public String translateWord(String alienWord){
		String risultato = null;
		for(Word w : parolePresenti){
			if(w.compare(alienWord) != null)
				risultato = w.getTranslation();
			
		}
		return risultato;
		
	}
}
