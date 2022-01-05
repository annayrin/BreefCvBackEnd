package com.company.service.impl;

import com.company.model.People;
import com.company.repository.FileRepository;
import com.company.service.JsonParser;
import com.google.gson.Gson;

public class JsonParserGson implements JsonParser {
    private final Gson gson = new Gson();
    private final FileRepository fileRepository = new FileRepository();
    @Override
    public String parseToJsonAndWriteInFile(People...o) {
        String str = "export const members = " + gson.toJson(o);
        fileRepository.writeInFile(str);
        return str;
    }

    @Override
    public Object parseFromJson(String jsonStr, Class classOfT) { //*
        Gson gson = new Gson();
        return gson.toJson(jsonStr);
    }
}
