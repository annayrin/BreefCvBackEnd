package com.company;


import com.company.controller.PeopleController;
import com.company.model.People;
import com.company.repository.FileRepository;
import com.google.gson.Gson;


public class Main {


    public static void main(String[] args) {
        PeopleController peopleController = new PeopleController();
        peopleController.generateData();
        peopleController.writeInFileWithJson();
    }
}

