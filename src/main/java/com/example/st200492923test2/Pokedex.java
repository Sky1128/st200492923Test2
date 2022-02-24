package com.example.st200492923test2;

import java.util.ArrayList;

public class Pokedex {

    private String ownersName;
    private ArrayList<Pokemon> pokemonList = new ArrayList<Pokemon>();

    public Pokedex(String name) {
        name.trim();
        if (name.length() >= 3) {
            this.ownersName = name;
        } else {
            throw new IllegalArgumentException("Please enter a valid user name");
        }
    }

    public String getOwnersName() {
        return ownersName;
    }

    public void setOwnersName(String ownersName) {
        this.ownersName = ownersName;
    }

    public ArrayList<Pokemon> getPokemonList() {
        return pokemonList;
    }

    public void setPokemonList(ArrayList<Pokemon> pokemonList) {
        this.pokemonList = pokemonList;
    }


    }




