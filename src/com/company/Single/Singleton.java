package com.company.Single;

import com.company.Habitat.Pet.Pet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

public class Singleton implements mySingle {
    private static final Singleton singleton = new Singleton();
    ArrayList<Pet> array = new ArrayList<>();
    TreeSet<Integer> petsID = new TreeSet<>();
    HashMap<Integer,Integer> petsLife = new HashMap<>();

    private Singleton(){

    }

    public void SetID(int id){
        petsID.add(id);
    }
    public void SetHashMap(int num,int lifeTime){
        petsLife.put(num,lifeTime);
    }

    public void Add(Pet pet){
        array.add(pet);
        petsID.add(pet.getID());
    }

    public Pet Get(int number){
        return array.get(number);

    }

    public void Clear(){
        array.clear();
    }
    public void Delete(int i){
        array.remove(i);
        petsID.remove(i);
        petsLife.remove(i);
    }
    public static Singleton getInstance(){
        return singleton;
    }
}