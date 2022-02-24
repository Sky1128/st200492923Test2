package com.example.st200492923test2;

import java.util.ArrayList;
import java.util.List;

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

    public int getNumberOfPokemons() {
        int numberOfPokemons;
        numberOfPokemons = pokemonList.size();
        return numberOfPokemons;
    }

    public ArrayList<Pokemon> getPokemonByGender(String gender)
    {
        ArrayList<Pokemon> byGender = new ArrayList<Pokemon>();
        for(int i = 0; i < pokemonList.size(); i++)
        {
            if(pokemonList.get(i).getGender() == gender)
            {
                byGender.add(pokemonList.get(i));
            }
        }
        return byGender;
    }




    }




