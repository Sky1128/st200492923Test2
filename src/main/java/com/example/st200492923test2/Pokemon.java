package com.example.st200492923test2;

import java.util.ArrayList;

public class Pokemon {

    //Variable declaration

    private String name;
    private String gender;
    private int hp;
    private int attack;
    private int defense;
    private int pokemonNumber;

    public Pokemon(String name, String gender, int hp, int attack, int defense, int pokemonNumber)
    {
        this.name = name;
        this.gender = gender;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.pokemonNumber = pokemonNumber;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name.trim();
        if(name.length() >= 4) {
            this.name = name;
        }
        else
        {
            throw new IllegalArgumentException("Enter Valid Pokemon Name");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        gender = gender.trim();
        ArrayList<String> genderList = new ArrayList<String>();
        genderList.add("male");
        genderList.add("female");
        genderList.add("both");
        genderList.add("unknown");

        if(genderList.contains(gender)) {
            this.gender = gender;
        }
        else
        {
            throw new IllegalArgumentException("Please Enter valid Gender Type");
        }
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if(hp >= 0 && hp <+80 )
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getPokemonNumber() {
        return pokemonNumber;
    }

    public void setPokemonNumber(int pokemonNumber) {
        this.pokemonNumber = pokemonNumber;
    }






}
