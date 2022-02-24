package com.example.st200492923test2;

import java.util.ArrayList;

public class Pokedex {

    private String ownersName;
    private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();


    public Pokedex(String ownersName) {
        ownersName.trim();
        if (ownersName.length() >= 3) {
            this.ownersName = ownersName;
        } else {
            throw new IllegalArgumentException("Please enter a valid user name");
        }
    }


    public String getOwnersName() {
        return ownersName;
    }


    public void setOwnersName(String ownersName) {

        ownersName.trim();
        if (ownersName.length() >= 3) {
            this.ownersName = ownersName;
        } else {
            throw new IllegalArgumentException("Please enter a valid user name");
        }
    }


    public void addPokemon(Pokemon pokemonObject) {
        pokemonList.add(pokemonObject);
    }



    }




