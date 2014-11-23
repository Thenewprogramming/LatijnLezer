/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latijnlezer;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Reijer
 * @version first
 */
public class ZelfstandigNaamwoord {
    private static ArrayList<String> StammenGroep1 = new ArrayList<>();
    private static ArrayList<String> StammenGroep2_1 = new ArrayList<>();
    private static ArrayList<String> StammenGroep2_2 = new ArrayList<>();
    private static ArrayList<String> StammenGroep3_1 = new ArrayList<>();
    private static ArrayList<String> StammenGroep3_2 = new ArrayList<>();
    private static ArrayList<String> StammenGroep4 = new ArrayList<>();
    private static ArrayList<String> StammenGroep5 = new ArrayList<>();

    private static ArrayList<String> UitgangenGroep1 = new ArrayList<>();//Vrouwelijk
    {
        UitgangenGroep1.add("a");
        UitgangenGroep1.add("ae");
        UitgangenGroep1.add("ae");
        UitgangenGroep1.add("am");
        UitgangenGroep1.add("a");

        UitgangenGroep1.add("ae");
        UitgangenGroep1.add("arum");
        UitgangenGroep1.add("is");
        UitgangenGroep1.add("as");
        UitgangenGroep1.add("is");
    }
    
    private static ArrayList<String> UitgangenGroep2_1 = new ArrayList<>(); //Mannelijk
    {
        UitgangenGroep2_1.add("us");
        UitgangenGroep2_1.add("i");
        UitgangenGroep2_1.add("o");
        UitgangenGroep2_1.add("um");
        UitgangenGroep2_1.add("o");

        UitgangenGroep2_1.add("i");
        UitgangenGroep2_1.add("orum");
        UitgangenGroep2_1.add("is");
        UitgangenGroep2_1.add("os");
        UitgangenGroep2_1.add("is");
    }

    private static ArrayList<String> UitgangenGroep2_2 = new ArrayList<>(); //Onzijdig
    {
        UitgangenGroep2_2.addAll(UitgangenGroep2_1);
        UitgangenGroep2_2.set(0, "um");
        UitgangenGroep2_2.set(5, "a");
        UitgangenGroep2_2.set(8, "a");
    }
    
    private static ArrayList<String> UitgangenGroep3_1 = new ArrayList<>(); //Mannelijk & Vrouwelijk
    {
        UitgangenGroep3_1.add("is");
        UitgangenGroep3_1.add("i");
        UitgangenGroep3_1.add("em");
        UitgangenGroep3_1.add("e");
        
        UitgangenGroep3_1.add("es");
        UitgangenGroep3_1.add("um");
        UitgangenGroep3_1.add("ibus");
        UitgangenGroep3_1.add("es");
        UitgangenGroep3_1.add("ibus");
    }
    
    private static ArrayList<String> UitgangenGroep3_2 = new ArrayList<>(); //Onzijdig
    {
        UitgangenGroep3_2.addAll(UitgangenGroep3_1);
        UitgangenGroep3_2.remove(2);
        UitgangenGroep3_2.set(3, "a");
        UitgangenGroep3_2.set(6, "a");
    }
    
    private static ArrayList<String> UitgangenGroep4 = new ArrayList<>(); //Mannelijk
    {
        UitgangenGroep4.add("us");
        UitgangenGroep4.add("us");
        UitgangenGroep4.add("ui");
        UitgangenGroep4.add("um");
        UitgangenGroep4.add("u");

        UitgangenGroep4.add("us");
        UitgangenGroep4.add("uum");
        UitgangenGroep4.add("ibus");
        UitgangenGroep4.add("us");
        UitgangenGroep4.add("ibus");
    }
    //TODO: Misschien groep4_2 toevoegen voor de onzijdige woorden van groep 4...
    
    private static ArrayList<String> UitgangenGroep5 = new ArrayList<>(); //Vrouwelijk
    {
        UitgangenGroep5.add("es");
        UitgangenGroep5.add("ei");
        UitgangenGroep5.add("ei");
        UitgangenGroep5.add("em");
        UitgangenGroep5.add("e");
        
        UitgangenGroep5.add("es");
        UitgangenGroep5.add("erum");
        UitgangenGroep5.add("ebus");
        UitgangenGroep5.add("es");
        UitgangenGroep5.add("ebus");
    }
    
    
    public static void leesWoord(String woord){
        
        ArrayList<Integer> MogelijkhedenGroep1 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep2_1 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep2_2 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep3_1 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep3_2 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep4 = new ArrayList<>();
        ArrayList<Integer> MogelijkhedenGroep5 = new ArrayList<>();

        ArrayList<Integer> VormenGroep1 = new ArrayList<>();
        ArrayList<Integer> VormenGroep2_1 = new ArrayList<>();
        ArrayList<Integer> VormenGroep2_2 = new ArrayList<>();
        ArrayList<Integer> VormenGroep3_1 = new ArrayList<>();
        ArrayList<Integer> VormenGroep3_2 = new ArrayList<>();
        ArrayList<Integer> VormenGroep4 = new ArrayList<>();
        ArrayList<Integer> VormenGroep5 = new ArrayList<>();
        
        
        //Kijken welke uitgangen het kunnen zijn.
        {
           //Groep 1
            for(int i =0; i<UitgangenGroep1.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep1.get(i).length()).equalsIgnoreCase(UitgangenGroep1.get(i)) ){
                    MogelijkhedenGroep1.add(i);
                }
            }
            //Groep 2_1
            for(int i =0; i<UitgangenGroep2_1.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep2_1.get(i).length()).equalsIgnoreCase(UitgangenGroep2_1.get(i)) ){
                    MogelijkhedenGroep2_1.add(i);
                }
            }
            //Groep 2_2
            for(int i =0; i<UitgangenGroep2_2.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep2_2.get(i).length()).equalsIgnoreCase(UitgangenGroep2_2.get(i)) ){
                    MogelijkhedenGroep2_2.add(i);
                }
            }
            //Groep 3_1
            for(int i =0; i<UitgangenGroep3_1.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep3_1.get(i).length()).equalsIgnoreCase(UitgangenGroep3_1.get(i)) ){
                    MogelijkhedenGroep3_1.add(i);
                }
            }
            //Groep 3_2
            for(int i =0; i<UitgangenGroep3_2.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep3_2.get(i).length()).equalsIgnoreCase(UitgangenGroep3_2.get(i)) ){
                    MogelijkhedenGroep3_2.add(i);
                }
            }
            //Groep 4
            for(int i =0; i<UitgangenGroep4.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep4.get(i).length()).equalsIgnoreCase(UitgangenGroep4.get(i)) ){
                    MogelijkhedenGroep4.add(i);
                }
            }
            //Groep 5
            for(int i =0; i<UitgangenGroep5.size(); i++){
                if(woord.substring(woord.length()-UitgangenGroep5.get(i).length()).equalsIgnoreCase(UitgangenGroep5.get(i)) ){
                    MogelijkhedenGroep5.add(i);
                }
            } 
        }
        
        //Checken of het woord in die vorm bestaaat.
        
        //Groep 1
        for(int n=0; n<StammenGroep1.size(); n++){
            for (int i=0; i<MogelijkhedenGroep1.size(); i++){
                if(woord.substring( 0, woord.length()-UitgangenGroep1.get(i).length() ).equalsIgnoreCase(StammenGroep1.get(n)) ){
                    String display;
                    
                	
                	WoordVorm vormToAdd = new WoordVorm(i, UitgangenGroep1.get(i), display);
                	VormenGroep1.add(vormToAdd);//moet hebben : naamval&getal(int), woordstam(string)
                    
                }
            }
        }
        
        
        
        //TODO: Controleren of alle mogelijkheden ook kunnen, IVM woordstammen.
        
    }
    
}

class WoordVorm{
	
	private int naamval;
	private String stam;
	private String display;
	
	
	WoordVorm(int naamval, String stam, String display){
		this.naamval = naamval;
		this.stam = stam;
		this.display = display;
	}
}
