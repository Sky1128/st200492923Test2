package com.example.st200492923test2;

public class Pokemon {

    //Variable declaration

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

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
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
