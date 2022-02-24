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
        if(hp >= 0 && hp <=80 ) {
            this.hp = hp;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Hit Points Value");
        }
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        if(attack >= 30 && attack <= 90) {
            this.attack = attack;
        }
        else
        {
            throw new IllegalArgumentException("Invalid attack Value");
        }
    }


    public int getDefense() {
        return defense;
    }


    public void setDefense(int defense) {
        if(defense >= 30  && defense <= 83) {
            this.defense = defense;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Defense Value");
        }
    }


    public int getPokemonNumber() {
        return pokemonNumber;
    }


    public void setPokemonNumber(int pokemonNumber) {
        if(pokemonNumber >=1 && pokemonNumber <= 999) {
            this.pokemonNumber = pokemonNumber;
        }
        else
        {
            throw new IllegalArgumentException("Invalid Pokemon Number");
        }
    }


    public String toString()
    {
        String pokemonData;
        if(pokemonNumber >= 1 && pokemonNumber <= 9)
        {
            pokemonData = "00" + Integer.toString(pokemonNumber) + "-" +name;
        }
        else if(pokemonNumber >=10 && pokemonNumber <= 99)
        {
            pokemonData = "0" + Integer.toString(pokemonNumber) + "-" +name;
        }
        else
        {
            pokemonData = Integer.toString(pokemonNumber) + "-" +name;
        }

        return pokemonData;
    }






}
